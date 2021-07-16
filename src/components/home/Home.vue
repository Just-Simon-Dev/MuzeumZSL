<template>
  <div id="Home">
    <Main></Main>
    <About></About>
    <News></News>
    <Muzeum></Muzeum>
    <Contact></Contact>
    <Footer></Footer>
  </div>
</template>

<script>
import Main from '../main/Main.vue'
import About from '../about/About.vue'
import News from '../news/News.vue'
import Muzeum from '../muzeum/Muzeum.vue'
import Contact from '../contact/Contact.vue'
import Footer from '../footer/Footer.vue'

export default {
  components: {
    Main,
    About,
    News,
    Muzeum,
    Contact,
    Footer,
  },
};
</script>