<template>
  <div id="app">
    <div id="nav">
      <router-link class="routerLink" v-bind:to="{ name: 'home' }">Home</router-link>&nbsp; &nbsp;
      <router-link class="routerLink" v-bind:to="{ name: 'logout' }" v-if="$store.state.token != ''">Logout</router-link>
    </div>
    <router-view />
  </div>
</template>

<style>
 #app{
   font-family:Verdana, Geneva, Tahoma, sans-serif;
   color: rgb(180, 180, 200);
 }
 .routerLink{
   color: rgb(80, 27, 110);
   font-size: 1.5rem;
   text-decoration: none;
 }

 .component-main {
  position: relative;
  top: 10rem;
  background-color: rgba(88, 23, 90, 0.9);
  border-radius: 5px;
}


</style>

