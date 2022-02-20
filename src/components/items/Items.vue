<template>
  <div id="eksponaty">
    <Menu></Menu>
    <Banner></Banner>
    <Entry :obj="item" v-for="item in items" :key="item.id" :id="item.id"></Entry>
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
      items: [],
      name: window.location.href.split('/')[4],
    };
  },
  created: function() {
    fetch('http://localhost:8080/getItems/'+this.name)
        .then(response => response.json())
        .then(data => {
          this.items = data[0]
          console.log(this.items)
        })
  }
};
</script>

<style>
#eksponaty {
  background-color: #2c2c54;
  width: 100%;
  overflow: auto;
}
</style>
