<template>
    <div class="container">
        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Built in Directives</h1>
                <p v-text="'some text'"></p>
                <p v-html="'<strong>some strong text</strong>'"></p>

            </div>
        </div>

        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Custom Directives</h1>
                <p v-highlight>Highlight this</p>
                <p v-highlight2="'red'">Highlight Two, using binding.value</p>

                <p v-highlight3:background="'orange'">Highlight Three, using background arg</p>
                <p v-highlight3="'orange'">Highlight Three, no arg</p>

                <p v-highlight4:background.delayed="'blue'">Highlight Four, with delay modifier</p>

            </div>
        </div>
        <div class="row">
            <div class="col-xs-12 col-sm-8 col-sm-offset-2 col-md-6 col-md-offset-3">
                <h1>Local Directives</h1>
                <p v-local-highlight:background.delayed.blink="'purple'">Local directive</p>

            </div>
        </div>
    </div>
</template>

<script>
    export default {
        directives: {
            'local-highlight': {
                bind(el, binding, vnode) {
                    var delay = 0;
                    if (binding.modifiers['delayed']) {
                        delay = 3000;
                    }

                    if (binding.modifiers['blink']) {
                        console.log('yes to blink');
                        let mainColor = binding.value;
                        let secondColor = 'blue';
                        let currentColor = mainColor;
                        setTimeout( () =>{

                            setInterval(() => {
                                currentColor == mainColor ? currentColor = secondColor : currentColor = mainColor;

                                el.style.color = 'white';
                                if (binding.arg === 'background') {
                                    el.style.backgroundColor = currentColor;
                                } else {
                                    el.style.color = currentColor;
                                }
                            }, 1000);
                        }, delay);
                    } else {

                        setTimeout(() => {
                            el.style.color = 'white';
                            if (binding.arg === 'background') {
                                el.style.backgroundColor = binding.value;
                            } else {
                                el.style.color = binding.value;
                            }
                        }, delay);
                    }
                }
            }
        }
    }
</script>

<style>

</style>
