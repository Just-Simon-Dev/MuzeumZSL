<template>
  <div id="app">
    <Main></Main>
    <About></About>
    <News></News>
    <Muzeum></Muzeum>
    <Contact></Contact>
    <Footer></Footer>
  </div>
</template>

<script>
import Main from './components/main/Main.vue'
import About from './components/about/About.vue'
import News from './components/news/News.vue'
import Muzeum from './components/muzeum/Muzeum.vue'
import Contact from './components/contact/Contact.vue'
import Footer from './components/footer/Footer.vue'
export default {
  components: {
    Main,
    About,
    News,
    Muzeum,
    Contact,
    Footer
  }
};
</script>

<style>
</style>