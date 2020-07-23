<template>
  <div class="book-container">
    <book-card
      v-for="cardOfBook in $store.state.books"
      v-bind:key="cardOfbook.title/>
  </div>
    
  
</template>

<script>
import BookCard from "./BookCard.vue";

export default {
    name: 'reading-list'
}
</script>

<style>
.book-container {
    display:flex;
    justify-content: space-evenly;
    flex-wrap: wrap;
}
</style>""