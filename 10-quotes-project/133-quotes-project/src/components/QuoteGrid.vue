<template>
    <div class="row">
        <!-- click.native - react to a click on the native element of the component -->
        <app-quote v-for="(quote,index) in quotes" @click.native="deleteQuote(index)">{{quote}}</app-quote>
    </div>
</template>

<script>
    import Quote from './Quote.vue';
    export default {
        name: "QuoteGrid",
        props: ['quotes'],
        methods: {
            deleteQuote(index) {
                console.log('index', index);
                this.$emit('quoteDeleted', index);
            }
        },
        components: {
            appQuote: Quote
        }
    }
</script>

<style scoped>

</style>