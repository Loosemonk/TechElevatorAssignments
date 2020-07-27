import Vue from "vue";
import Vuex from "vuex";

Vue.use(Vuex);

export default new Vuex.Store({
<<<<<<< HEAD
  state: {books: [
    {
      title: "Kafka on the Shore",
      author: "Haruki Murakami",
      read: false,
      isbn: "9781400079278"
    },
    {
      title: "The Girl With All the Gifts",
      author: "M.R. Carey",
      read: true,
      isbn: "9780356500157"
    },
    {
      title: "The Old Man and the Sea",
      author: "Ernest Hemingway",
      read: true,
      isbn: "9780684830490"
    },
    {
      title: "Le Petit Prince",
      author: "Antoine de Saint-Exupéry",
      read: false,
      isbn: "9783125971400"
    }
  ]},
  mutations: {
    FLIP_STATUS(state,book) {
      book.read = !book.read;
    },
    ADD_BOOK(state, book) {
      state.books.push(book);
    }
  },
=======
  state: {},
  mutations: {},
>>>>>>> af7698ec32e2c0ae07886c97875cdfd20da0e253
  actions: {},
  modules: {},
  strict: true
});
