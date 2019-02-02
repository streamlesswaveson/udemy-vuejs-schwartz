<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12">
                <button @click="selectedComponent = 'appQuote'">Quote</button>
                <button @click="selectedComponent = 'appAuthor'">Author</button>
                <button @click="selectedComponent = 'appNew'">New</button>
                <hr>
                <p>{{selectedComponent}}</p>

                <!-- key-alive is a reserved word.  Wrapping the component will prevent it's destruction -->
                <keep-alive>
                    <!-- component is a reserved word -->
                    <component :is="selectedComponent">
                        <p>Default content</p>
                    </component>
                </keep-alive>
                <!--<app-quote>-->
                <!--&lt;!&ndash; note the binding still works with the slot managed html &ndash;&gt;-->
                <!--<h1 slot="title">{{quoteTitle}}</h1>-->
                <!--<p slot="content">Hey some quote!</p>-->
                <!--</app-quote>-->
            </div>
        </div>
    </div>
</template>

<script>
    import Quote from './components/Quote.vue'
    import AppAuthor from "./components/AppAuthor.vue";
    import AppNew from "./components/AppNew.vue";

    export default {
        data: function () {
            return {
                quoteTitle: 'the quote title',
                selectedComponent: 'appQuote'
            }
        },
        components: {
            appQuote: Quote,
            appAuthor: AppAuthor,
            appNew: AppNew
        }
    }
</script>

<style>
</style>
