<template>
  <div>
    <p>Server status is {{status}}</p>
    <hr>
    <button @click="changeStatus">Change</button>
  </div>
</template>

<script>
  export default {
    data: function () {
      return {
        status: 'Critical'
      }
    },
    methods: {
      changeStatus() {
        this.status = 'Normal';
      }
    }
  }
</script>

<style scoped>

</style>
