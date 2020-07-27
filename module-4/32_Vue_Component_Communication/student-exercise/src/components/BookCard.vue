<template>
<<<<<<< HEAD
  <div class="card" v-bind:class="{read:book.read}">
      <div class="book-title">{{book.title}}</div>
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    <div class="book-author">{{book.author}}</div>
    <button class="mark-unread" v-on:click.prevent="markReadUnread" v-if="book.read">Mark Unread</button>
     <button class="mark-read" v-on:click.prevent="markReadUnread" v-if="!book.read">Mark Read</button>     
=======
  <div class="card">

    <!-- Please leave <img> commented out until directed to remove open and close comment tags in the README.
    <img v-if="book.isbn" v-bind:src="'http://covers.openlibrary.org/b/isbn/' + book.isbn + '-M.jpg'" />
    -->
    
>>>>>>> af7698ec32e2c0ae07886c97875cdfd20da0e253
  </div>
</template>

<script>
export default {
<<<<<<< HEAD
    name: 'book-card',
     props: {
         book: Object
     },
   methods: {
    markReadUnread() {
      this.$store.commit("FLIP_STATUS", this.book);
    },
  },

=======
    name: 'book-card'
>>>>>>> af7698ec32e2c0ae07886c97875cdfd20da0e253
}
</script>

<style>
.card {
    border: 2px solid black;
    border-radius: 10px;
    width: 250px;
    height: 550px;
    margin: 20px;
}

.card.read {
    background-color: lightgray;
}

.card .book-title {
    font-size: 1.5rem;
}

.card .book-author {
    font-size: 1rem;
}
</style>