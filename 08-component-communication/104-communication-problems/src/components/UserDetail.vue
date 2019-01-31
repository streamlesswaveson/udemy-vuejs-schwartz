<template>
    <div class="component">
        <h3>You may view the User Details here</h3>
        <p>Many Details</p>
        <p>User name: {{name}}</p>
        <p>Switched name: {{switchName()}}</p>
        <p>Other Name: {{otherName}}</p>

        <!-- child-parent communication via custom event -->
        <button @click="resetName">Reset Name (custom event)</button>

        <!-- child-parent communication through 'prop' function -->
        <button @click="resetFn">Reset Name (resetFn)</button>
    </div>
</template>

<script>
    export default {
        // props - properties that can be set from outside
        // these must match the properties used in the template
        // props: ['name'],
        props: {
            // validation - this can also be an array of types - e.g. [String,Array]
            name: {
                type: String,
                required: true
            },
            resetFn: Function,
            otherName: {
                type: String,
                default: 'waveson'
            },
            someObj: {
                type: Object,
                // always a function returning the default object
                default: function () {
                    return {
                        'default':'something'
                    }
                }
            }
        },
        methods: {
            switchName() {
                // you can access the name property like any other
                return this.name.split("").reverse().join("");
            },
            resetName() {
                this.name = 'Streamless';
                this.$emit('nameWasChanged', this.name);
            }
        }
    }
</script>

<style scoped>
    div {
        background-color: lightcoral;
    }
</style>
