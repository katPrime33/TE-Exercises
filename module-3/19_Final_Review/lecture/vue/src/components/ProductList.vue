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

 
export default {
    name: 'product-list',
    components: {
        ProductListItem
    },
    computed: {
        products() {
            const products = this.$store.state.products;
            const category = this.$store.state.category;
            return products.filter( product => {
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