<template>
 <div class="products">
    <product-list-item
        v-for="currentProduct in products"
        v-bind:key="currentProduct.id"
        v-bind:product="currentProduct" />
 </div>
</template>

<script>
import ProductListItem from '@/components/ProductListItem'
import productService from '@/services/ProductService';
 
export default {
    name: 'product-list',
    components: {
        ProductListItem
    },
    data() {
        return {
            productList: []
        }
    },
    computed: {
        products() {
            const category = this.$store.state.category;
            return this.productList.filter( product => {
                if (category == 'All') {
                    return true;
                } else {
                    if (category == product.category) {
                        return true;
                    }
                }
                return false;
                // Equivalent tenary operator
                //return category == 'All' ? true : category == product.category;
            })
        }
    },
    created() {
        productService.getProducts().then( response => {
            this.productList = response.data;
        }).catch( error => console.error(error) );
    }
 
}

</script>

<style>
div.products {
   display: flex;
   flex-wrap: wrap;
   justify-content: center;
}

</style>