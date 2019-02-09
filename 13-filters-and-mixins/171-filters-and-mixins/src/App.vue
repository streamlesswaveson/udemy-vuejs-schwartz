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

            </div>
        </div>
    </div>
</template>

<script>
    export default {
        data() {
            return {
                text: 'Hello There',
                fruits: ['Apple', 'Mango', 'Banana', 'Melon'],
                filterText: ''
            }
        },
        // for more complex transformations use a computed property
        computed: {
            filteredFruits() {
                return this.fruits.filter((el) => {
                    return el.match(this.filterText);
                })
            }
        },
        filters: {
            toUpperCase(value) {
                return value.toUpperCase();
            }
        }
    }
</script>

<style>

</style>
