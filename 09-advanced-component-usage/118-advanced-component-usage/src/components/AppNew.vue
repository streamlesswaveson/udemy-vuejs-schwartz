<template>
    <div>
        <h3>New Quote</h3>
        <button @click="counter++">Increase!</button>
        <p>{{counter}}</p>
    </div>
</template>

<script>
    export default {
        name: "AppNew",
        data : function () {
            return {
                counter: 0
            };
        },
        destroyed() {
            console.log('AppNew destroyed');
        },
        deactivated() {
            console.log('AppNew deactivated');
        },
        activated() {
            console.log('AppNew activated');
        }
    }
</script>

<style scoped>

</style>