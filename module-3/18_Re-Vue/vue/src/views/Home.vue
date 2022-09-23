<template>
  <div class="home">
    <h1>Welcome {{ $store.state.user.username }}!</h1>
    <p>You must be authenticated to see this</p>
    
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>
