<template>
  <div id="app">
    <Main></Main>
  </div>
</template>

<script>
import Main from './components/main/Main.vue'
export default {
  components: {
    Main
  },
  data() {
    return {
      message: 'Hello World',
    };
  },
};
</script>

<style>
</style>