<template>
    <div class="container">

        <exercise-header></exercise-header>

        <hr>
        <exercise-dashboard></exercise-dashboard>
        <hr>
        <exercise-footer></exercise-footer>
    </div>
</template>

<script>
    import Header from './Header.vue';
    import Footer from './Footer.vue';
    import ServerDashboard from './ServerDashboard.vue';
    export default {
        components: {
            'exercise-header': Header,
            'exercise-footer': Footer,
            'exercise-dashboard': ServerDashboard
        }
    }
</script>

<style>

</style>
