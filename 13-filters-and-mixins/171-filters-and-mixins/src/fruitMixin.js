export const fruitMixin = {
    data() {
        return {
            fruits: ['Apple', 'Mango', 'Banana', 'Melon'],
            filterText: ''
        }
    },
    // for more complex transformations use a computed property
    computed: {
        filteredFruits() {
            return this.fruits.filter((el) => {
                return el.match(this.filterText);
            })
        }
    },
    created() {
        console.log('mixin created');
    }
};