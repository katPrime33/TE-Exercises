<template>
  <div id="wishlists">
      <div class="addWishlist">
          <label for="newWishlistName">Name:</label>
          <input type="text" id="newWishlistName" v-model="wishlistName">
          <button v-on:click.prevent="createNewWishlist()">Create Wishlist</button>
      </div>
      <wishlist-list-item 
        v-for="currentWishlist in wishlists" 
        v-bind:key="currentWishlist.id"
        v-bind:wishlist="currentWishlist" />
  </div>
</template>

<script>
import wishlistService from '@/services/WishlistService'
import WishlistListItem from '@/components/WishlistListItem'

export default {
    name: 'wishlist-list',
    components: {
        WishlistListItem
    },
    data() {
        return {
            wishlists: [],
            wishlistName: ''
        }
    },
    methods: {
        createNewWishlist() {
            const newWishlist = {
                name: this.wishlistName
            }
            wishlistService.addWishlist(newWishlist).then( response => {
                this.wishlists.push(response.data);
            })
        }
    },
    created() {
        wishlistService.getWishlists().then( response => {
            this.wishlists = response.data;
        })
    }
}
</script>

<style>

</style>