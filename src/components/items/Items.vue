<template>
  <div class="main">
    <Menu></Menu>
    <Banner></Banner>
  </div>
</template>

<script>
import Menu from "../main/Menu.vue";
import Banner from "./Banner.vue";
export default {
  components: {
    Menu,
    Banner,
  },
};
</script>

<style>
.main {
  background-color: #2c2c54;
  width: 100%;
  height: 100vh;
}
</style>
