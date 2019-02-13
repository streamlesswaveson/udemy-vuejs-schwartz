<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Http</h1>
            </div>
            <div class="form-group">
                <label>Username</label>
                <input type="text" class="form-control" v-model="user.username">
            </div>
            <div class="form-group">
                <label>Mail</label>
                <input type="text" class="form-control" v-model="user.email">
            </div>
            <button class="btn btn-primary" @click="submit">Submit</button>
        </div>
    </div>
</template>

<script>
    export default {
        methods: {
          submit() {
              this.$http.post('http://localhost:8099/api/user', this.user)
                  .then(response => {
                      console.log(response);
                  }, error => {
                      console.error(error);
                  });
          }
        },
        data() {
            return {
                user: {
                    username: '',
                    email: ''
                }
            }
        }
    }
</script>

<style>
</style>
