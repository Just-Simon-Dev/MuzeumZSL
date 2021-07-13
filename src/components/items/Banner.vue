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
  background-image: url("https://static.polityka.pl/_resource/res/path/4e/5a/4e5a5440-4db1-4708-b5b7-8287fa65b8aa");
  background-attachment: fixed;
}
.banner > h2 {
  display: flex;
  align-items: center;
  justify-content: center;
  height: 100%;
  width: 100%;
  font-size: 10em;
  background: rgba(0, 0, 0, .6);
  color: white;
}
</style>
