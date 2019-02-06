import Vue from 'vue'
import App from './App.vue'

Vue.directive('highlight', {
  bind(el, binding, vnode) {
    el.style.backgroundColor = 'green';
    el.style.color = 'white';
  }
});

Vue.directive('highlight2', {
  bind(el, binding, vnode) {
    el.style.backgroundColor = binding.value;
    el.style.color = 'white';
  }
});

Vue.directive('highlight3', {
  bind(el, binding, vnode) {
    el.style.color = 'white';
    if (binding.arg === 'background') {
      el.style.backgroundColor = binding.value;
    } else {
      el.style.color = binding.value;
    }
  }
});

new Vue({
  el: '#app',
  render: h => h(App)
})
