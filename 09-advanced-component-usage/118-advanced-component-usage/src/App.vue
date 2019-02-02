<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
               <app-quote>
                   <!-- note the binding still works with the slot managed html -->
                   <h1 slot="title">{{quoteTitle}}</h1>
                   <p slot="content">Hey some quote!</p>
               </app-quote>
            </div>
        </div>
    </div>
</template>

<script>
    import Quote from './components/Quote.vue'
    export default {
        data: function() {
            return {
                quoteTitle: 'the quote title'
            }
        },
        components: {
            appQuote: Quote
        }
    }
</script>

<style>
</style>
