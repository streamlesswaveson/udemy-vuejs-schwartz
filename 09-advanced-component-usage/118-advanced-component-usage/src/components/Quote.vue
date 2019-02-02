<template>
    <div>
        <!-- slot is a reserved tag/word in vuejs -->
            <div class="title">
                <slot name="title"></slot>
            </div>

        <hr>
        <div>
            <slot name="content"></slot>
        </div>
    </div>
</template>

<script>
    export default {
        name: "Quote"
    }
</script>

<style scoped>
    div {
        border: 1px solid #ccc;
        box-shadow: 1px 1px 2px black;
        padding: 30px;
        margin: auto;
        text-align: center;

    }

    /* the styling will change the slot managed html also */
    h1 {
        color: red;
    }

    .title {
        font-style: italic;
    }
</style>