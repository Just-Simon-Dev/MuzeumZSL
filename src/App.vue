E<template>
  <div id="app">
    <Items></Items>
  </div>
</template>

<script>
// import Main from './components/main/Main.vue'
import Items from "./components/items/Items.vue";
export default {
  components: {
    Items,
  },
  data() {
    return {
      message: "Hello World",
    };
  },
};
</script>

<style></style>
