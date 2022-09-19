<template>
  <div class="my-books">
      <reading-list/>
      <nav>
      <router-link :to="{name: 'add-book'}">Add Book to Reading List</router-link>
      </nav>
  </div>
</template>

<script>
import ReadingList from '../components/ReadingList.vue'
export default {
    components: {ReadingList}
}
</script>

<style>

</style>