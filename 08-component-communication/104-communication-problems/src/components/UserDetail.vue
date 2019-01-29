<template>
    <div class="component">
        <h3>You may view the User Details here</h3>
        <p>Many Details</p>
        <p>User name: {{name}}</p>
        <p>Switched name: {{switchName()}}</p>
    </div>
</template>

<script>
    export default {
        // props - properties that can be set from outside
        // these must match the properties used in the template
        props: ['name'],
        methods: {
            switchName() {
                // you can access the name property like any other
                return this.name.split("").reverse().join("");
            }
        }
    }
</script>

<style scoped>
    div {
        background-color: lightcoral;
    }
</style>
