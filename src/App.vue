<template>
  <div id="app">
    <Main></Main>
    <Muzeum></Muzeum>
    <News></News>
  </div>
</template>

<script>
import Main from './components/main/Main.vue'
import Muzeum from './components/muzeum/Muzeum.vue'
import News from './components/news/News.vue'
export default {
  components: {
    Main,
    Muzeum,
    News,
  }
};
</script>

<style>
</style>