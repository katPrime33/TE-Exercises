<template>
  <div id="productDetail">
      <h2>Showing {{ product.name}}</h2>
      <p>In {{ product.category }}</p>
      <p>Product id: {{ productId }}</p>
      <div v-if="isLoading">
          <img src="../assets/loading.gif" />
      </div>
      <product-list-item v-if="!isLoading" v-bind:product="product" />
      <button v-on:click.prevent="showWishlists = true">Add to Wishlist</button>
      <div>
          <select v-show="showWishlists" v-model="selectedWishlist" v-on:change="addToWishList()">
              <option value="">Select a Wishlist</option>
              <option 
                v-for="wishlist in wishlists" 
                v-bind:key="wishlist.id" 
                v-bind:value="wishlist.id">{{ wishlist.name }}</option>
          </select>
      </div>
      <router-link v-bind:to="{ name: 'products' }">Back to Products</router-link>
  </div>
</template>

<script>
import ProductListItem from '@/components/ProductListItem'
import productService from '@/services/ProductService'
import wishListService from '@/services/WishlistService'

export default {
    components: {
        ProductListItem
    },
    data() {
        return {
            productId: 0,
            product: {},
            isLoading: true,
            wishlists: [],
            selectedWishlist: "",
            showWishlists: false
        }
    },
    methods: {
        addToWishList() {
            if (this.selectedWishlist) {
                wishListService.addProductToWishlist(this.product.id, this.selectedWishlist)
                .then(response =>{
                    if (response.status === 201) {
                        alert("Product Added to Wishlist");
                        this.showWishlists = false;
                    }
                })
            }
        }
    },
    created() {
        this.productId = Number(this.$route.params.productId);
        productService.getProductById(this.productId).then( response => {
            this.product = response.data;
            this.isLoading = false;
        }).catch( error => console.error(error) );

        wishListService.getWishlists().then( response => {
            this.wishlists = response.data;
        })
    }
}
</script>

<style>
div#productDetail {
    display: flex;
    flex-direction: column;
    align-items: center;
}
div#productDetail p {
    font-size: 1.2rem;
    margin: 5px 0px 5px 0px;

}

div#productDetail button {
    margin-bottom: 10px;
    width: 150px;
    line-height: 25px;
    font-size: 1.1rem;
}
</style>