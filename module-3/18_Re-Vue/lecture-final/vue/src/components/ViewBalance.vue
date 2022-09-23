<template>
  <div id="balance">
      <h2>Welcome, {{ $store.state.user.username }}!</h2>
      <h2>Your current balance is {{ balance }}</h2>
  </div>
</template>

<script>
import tenmoService from '../services/TenmoService';
export default {
    data() {
        return {
            balance: Number,
        }
    },
    created () {
         tenmoService.getBalance()
         .then( (response) => {
             if (response.status == 200) {
                 this.balance = response.data;
             }
         });
  },
}
</script>

<style>
 #balance{
     margin-top: 40px;
     display: flex;
     flex-direction: column;
     align-items: center;
 }
</style>