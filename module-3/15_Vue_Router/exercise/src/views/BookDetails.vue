<template>
  <div class="book-details">
      <h1>Book Details</h1>
      <p>{{ book.title }}</p>
      <p>{{ book.author }}</p>
      <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
      <p v-if="book.read">I have read this book.</p>
      <p v-else>I have not read this book.</p>
      </div>
</template>

<script>

export default {
    name: 'book-details',
    computed: {
        book(){
            return this.$store.state.books.filter((book) => {
               return book.isbn === this.$route.params.isbn;
            })[0]
        }
    }
}
</script>

<style>

</style>