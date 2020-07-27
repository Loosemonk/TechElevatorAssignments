<template>
  <div class="book-container">
<<<<<<< HEAD
    <book-card v-bind:book="book" v-for="book in $store.state.books" v-bind:key="book.title"></book-card>
     
=======

>>>>>>> af7698ec32e2c0ae07886c97875cdfd20da0e253
  </div>
</template>

<script>
<<<<<<< HEAD
import BookCard from './BookCard.vue';
export default {
    name: 'reading-list',
    components: {BookCard},
};
=======

export default {
    name: 'reading-list'
}
>>>>>>> af7698ec32e2c0ae07886c97875cdfd20da0e253
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>