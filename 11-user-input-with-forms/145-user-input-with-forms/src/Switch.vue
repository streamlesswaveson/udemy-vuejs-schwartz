<template>

    <div>
        <div id="on"
        @click="switched(true)"
             :class="{active: value}"
        >On</div>

        <div id="off"
             @click="switched(false)"
             :class="{active: !value}"
        >Off</div>
    </div>
    
</template>

<script>
    export default {
        // the naming is important - takes a prop of 'value'
        // emits an event called 'input'
        props: ['value'],
        methods: {
            switched(v) {
                this.$emit('input', v);
            }
        },
        name: "Switch"
    }
</script>

<style scoped>

    #on, #off {
        width: 40px;
        height: 20px;
        background-color: lightgray;
        padding: 2px;
        display: inline-block;
        margin: 10px -2px;
        box-sizing: content-box;
        cursor: pointer;
        text-align: center;
    }

    #on:hover, #on.active {
        background-color: lightgreen;
    }
    #off:hover, #off.active {
        background-color: lightcoral;
    }

</style>