<template>
  <div id="filter">
      <label for="categories">Category:</label>
      <select id="categories" v-model="selectedCategory"
        v-on:change="setCategoryFilter()">
          <option 
            v-for="category in categories" 
            v-bind:key="category"
            v-bind:value="category">{{ category }}</option>
      </select>
  </div>
</template>

<script>
import productService from '@/services/ProductService'

export default {
    name: 'filter-products',
    data() {
        return {
            selectedCategory: this.$store.state.category,
            categories: []
        }
    },
    methods: {
        setCategoryFilter() {
            this.$store.commit('SET_CATEGORY', this.selectedCategory);
        }
    },
    created() {
        productService.getCategories().then( response => {
            const cats = response.data;
            cats.unshift('All');
            this.categories = cats;
        });
    }
}
</script>

<style>

</style>