<template>
    <div class="container">
        <app-new-quote @quoteAdded="newQuote"></app-new-quote>
    <app-quote-grid :quotes="quotes"></app-quote-grid>
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
