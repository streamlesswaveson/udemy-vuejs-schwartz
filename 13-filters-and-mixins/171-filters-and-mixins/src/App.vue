<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Filters & Mixins</h1>
                <!-- chained filters -->
                <p>{{text | toUpperCase | toLowerCase}}</p>
                <hr>
                <input v-model="filterText">
                <ul>
                    <li v-for="fruit in filteredFruits">{{fruit}}</li>
                </ul>

                <hr>
                <app-list></app-list>

            </div>
        </div>
    </div>
</template>

<script>
    import {fruitMixin} from "./fruitMixin";
    import List from './List.vue';
    export default {
        mixins: [fruitMixin],
        data() {
            return {
                text: 'Hello There'
            }
        },
        filters: {
            toUpperCase(value) {
                return value.toUpperCase();
            }
        },
        components: {
            appList: List
        },
        created() {
            console.log('app created');
        }
    }
</script>

<style>

</style>
