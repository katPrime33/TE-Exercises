<template>
  <div id="filter">
      <label for="categories">Category:</label>
      <select id="categories" v-model="selectedCategory"
        v-on:change="setCategoryFilter()">
          <option 
            v-for="category in $store.state.categories" 
            v-bind:key="category"
            v-bind:value="category">{{ category }}</option>
      </select>
  </div>
</template>

<script>
export default {
    name: 'filter-products',
    data() {
        return {
            selectedCategory: this.$store.state.category
        }
    },
    methods: {
        setCategoryFilter() {
            this.$store.commit('SET_CATEGORY', this.selectedCategory);
        }
    }
}
</script>

<style>

</style>