<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Built in Directives</h1>
                <p v-text="'some text'"></p>
                <p v-html="'<strong>some strong text</strong>'"></p>

            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Custom Directives</h1>
                <p v-highlight>Highlight this</p>
                <p v-highlight2="'red'">Highlight Two, using binding.value</p>

                <p v-highlight3:background="'orange'">Highlight Three, using background arg</p>
                <p v-highlight3="'orange'">Highlight Three, no arg</p>

                <p v-highlight4:background.delayed="'blue'">Highlight Four, with delay modifier</p>

            </div>
        </div>
    </div>
</template>

<script>
    export default {
    }
</script>

<style>

</style>
