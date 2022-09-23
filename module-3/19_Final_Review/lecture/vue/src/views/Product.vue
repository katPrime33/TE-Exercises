<template>
  <div id="productDetail">
      <h2>Showing {{ product.name}}</h2>
      <p>In {{ product.category }}</p>
      <p>Product id: {{ productId }}</p>
      <product-list-item v-bind:product="product" />
      <router-link v-bind:to="{ name: 'products' }">Back to Products</router-link>
  </div>
</template>

<script>
import ProductListItem from '@/components/ProductListItem'

export default {
    components: {
        ProductListItem
    },
    data() {
        return {
            productId: 0
        }
    },
    computed: {
        product() {
            return this.$store.state.products.find( p => p.id == this.productId );
        }
    },
    created() {
        this.productId = Number(this.$route.params.productId);
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
</style>