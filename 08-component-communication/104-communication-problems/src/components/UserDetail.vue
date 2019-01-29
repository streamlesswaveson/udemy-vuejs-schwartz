<template>
    <div class="component">
        <h3>You may view the User Details here</h3>
        <p>Many Details</p>
        <p>User name: {{name}}</p>
    </div>
</template>

<script>
    export default {
        // props - properties that can be set from outside
        // these must match the properties used in the template
        props: ['name']
    }
</script>

<style scoped>
    div {
        background-color: lightcoral;
    }
</style>
