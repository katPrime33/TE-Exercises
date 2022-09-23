<template>
  <div>
      <h2>Products</h2>
      <filter-products />
      <product-list />  
  </div>
</template>

<script>
import ProductList from '@/components/ProductList';
import FilterProducts from '@/components/FilterProducts';

export default {
    components: {
        ProductList,
        FilterProducts
    }

}
</script>

<style>

</style>