import axios from 'axios'

export default {
    getWishlists() {
        return axios.get('/wishlists');
    },

    addProductToWishlist(productId, wishlistId) {
        const msgBody = {
            productId: productId,
            wishlistId: wishlistId
        };
        return axios.post(`/wishlists/${wishlistId}`, msgBody);
    },

    getWishlistById(wishlistId) {
        return axios.get(`/wishlists/${wishlistId}`);
    },

    addWishlist(wishlist) {
        return axios.post('/wishlists', wishlist);
    },
    
    deleteWishlistById(wishlistId) {
        return axios.delete(`/wishlists/${wishlistId}`);
    }
}