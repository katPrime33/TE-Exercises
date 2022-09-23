import axios from 'axios'

export default {
    getProducts() {
        return axios.get('/products');
    },
    getProductById(productId) {
        return axios.get(`/products/${productId}`);
    },
    getCategories() {
        return axios.get('/categories');
    }
}