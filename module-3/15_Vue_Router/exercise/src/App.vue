<template>
  <div id="app">
   <router-link :to="{name: 'home'}">Home</router-link>
    |
   <router-link :to="{name: 'my-books'}">My Books</router-link>
    <router-view />
  </div>
</template>

<script>

export default {
  name: 'app'
}
</script>

<style>
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin: 60px;
}
</style>
