<template>
  <div class="banner">
    <h2>{{ title }}</h2>
  </div>
</template>

<script>
export default {
  data: () => {
    return {
      title: "Komputery",
    };
  },
};
</script>

<style>
.banner {
  width: 100%;
  height: 70vh;
  min-height: 500px;
  position: relative;
  top: 53px;
  background-image: url("https://static.polityka.pl/_resource/res/path/4e/5a/4e5a5440-4db1-4708-b5b7-8287fa65b8aa");
}
.banner > h2 {
  height: 200px;
  font-size: 80px;
  line-height: 100px;
  position: relative;
  top: 30px;
  left: 10%;
}
</style>
