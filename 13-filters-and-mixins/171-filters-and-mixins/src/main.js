import Vue from 'vue'
import App from './App.vue'

// global filter
Vue.filter('toLowerCase', function (value) {
  return value.toLowerCase();
});

Vue.mixin({
  created() {
    console.log('global mixin created');
  }
})

new Vue({
  el: '#app',
  render: h => h(App)
})
