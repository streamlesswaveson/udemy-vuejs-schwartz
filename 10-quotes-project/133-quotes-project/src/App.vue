<template>
    <div class="container">
        <app-new-quote @quoteAdded="newQuote"></app-new-quote>
        <app-quote-grid :quotes="quotes" @quoteDeleted="deleteQuote"></app-quote-grid>
        <div class="row">
            <div class="col-sm-12 text-center">
                <div class="alert alert-info">
                    Info: click on a quote to delete it
                </div>
            </div>
        </div>
    </div>
</template>

<script>
    import NewQuote from './components/NewQuote.vue';
    import QuoteGrid from './components/QuoteGrid.vue';

    export default {
        components: {
            appQuoteGrid: QuoteGrid,
            appNewQuote: NewQuote
        },
        methods: {
            newQuote(quote) {
                if (quote) {
                    console.log('hey new quote', quote);
                    this.quotes.push(quote);
                }
            },
            deleteQuote(index) {
                console.log('going to delete index', index);
                this.quotes.splice(index,1);
            }
        },
        data: function () {

            return {
                quotes: [
                    "Just a quote to see something"
                ],
                maxQuotes: 10
            }

        }
    }
</script>

<style>
</style>
