<template>
  <div id="wishlist">
      <a href="#" v-on:click.prevent="toggleProducts()">
      {{ wishlist.name}} ({{wishlist.countOfProducts}})
      </a>
      <span class="deleteButton">
          <a href="#" v-on:click.prevent="deleteWishlist()">[Delete]</a>
      </span>

      <div class="wishlistProducts" v-if="showProducts && products.length > 0">
          <product-list-item 
            v-for="currentProduct in products"
            v-bind:key="currentProduct.id"
            v-bind:product="currentProduct" />
      </div>
  </div>
</template>

<script>
import wishlistService from '@/services/WishlistService'
import ProductListItem from '@/components/ProductListItem'

export default {
    name: "wishlist-list-item",
    components: {
        ProductListItem
    },
    props: ['wishlist'],
    data() {
        return {
            showProducts: false,
            products: []
        }
    },
    methods: {
        toggleProducts() {
            if (this.showProducts) {
                this.showProducts = false;
            } else {
                // Load the products for the Wishlist
                wishlistService.getWishlistById(this.wishlist.id).then( response => {
                    this.products = response.data.products;
                    this.showProducts = true;
                }).catch( err => console.error(err) );
                
            }
        },
        deleteWishlist() {
            wishlistService.deleteWishlistById(this.wishlist.id).then( response => {
                if (response.status < 300) {
                    alert("Wishlist deleted");
                    this.$router.push({ name: 'home'});
                }
            }).catch( err => console.error(err) );
        }
    }

}
</script>

<style>
div#wishlist div.wishlistProducts {
    display: flex;
}
div#wishlist {
    margin: 20px;
}
div#wishlist span.deleteButton {
    padding-left: 20px;
}
</style>