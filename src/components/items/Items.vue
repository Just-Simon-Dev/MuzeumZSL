<template>
  <div id="eksponaty">
    <Menu></Menu>
    <Banner></Banner>
    <Entry v-for="item in items" :key="item.id" :id="item.id"></Entry>
  </div>
</template>

<script>
import Menu from "../main/Menu.vue";
import Banner from "./Banner.vue";
import Entry from "./Entry.vue";
export default {
  components: {
    Menu,
    Banner,
    Entry,
  },
  data: () => {
    return {
      items: [{ id: 1 }, { id: 2 }, { id: 3 }],
    };
  },
};
</script>

<style>
#eksponaty {
  background-color: #2c2c54;
  width: 100%;
  overflow: auto;
}
</style>
