<template>
  <div id="app" class="main">
    <nav class="actions">
      <router-link :to="{name: 'products'}">Back to Products</router-link>
      |
      <router-link :to="{name: 'add-review', params: {id: product.id}}">Add a Review</router-link>
    </nav>
    <h1>{{ product.name }}</h1>
    <p class="description">{{ product.description }}</p>
    <div class="well-display">
      <average-summary />
      <star-summary rating="1" />
      <star-summary rating="2" />
      <star-summary rating="3" />
      <star-summary rating="4" />
      <star-summary rating="5" />
    </div>
    <review-list />
  </div>
</template>

<script>
import AverageSummary from "../components/AverageSummary.vue";
import StarSummary from "../components/StarSummary.vue";
import ReviewList from "../components/ReviewList.vue";

export default {
  components: {
    AverageSummary,
    StarSummary,
    ReviewList,
  },
  computed: {
    product() {
      return this.$store.state.products.find(
        (currentProduct) => {
          return currentProduct.id == this.$store.state.activeProduct;
        }
      );
    },
  },
  //created is a lifecycle hook we will talk more about on tuesday- for now, it means 'when the DOM is loaded'
  created() {
    const currentActiveProductId = this.$route.params.id;
    this.$store.commit("SET_ACTIVE_PRODUCT", currentActiveProductId);
  },
};
</script>

<style>
</style>