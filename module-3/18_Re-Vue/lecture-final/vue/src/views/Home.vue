<template>
  <div class="home">
    <h1>Welcome {{$store.state.user.username}}!</h1>
    <p>You must be authenticated to see this</p>
       <router-link 
   id="linkToBalance" :to="{ name: 'balance' }">View your Balance</router-link>
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style>

.home {
  position: relative;
  top: 10rem;
  background-color: rgba(88, 23, 90, 0.9);
  border-radius: 5px;
  display: flex;
  flex-direction: column;
  align-items: center;
}
#linkToBalance{
  height: 50px;
  width: 200px;
  background-color: rgb(156, 92, 156);
  border-radius: 5px;
  text-align: center;
  text-decoration: none;
  padding-top: 2rem;
}

#linkToBalance:hover{
   background-color: rgb(173, 132, 173);
}
</style>
