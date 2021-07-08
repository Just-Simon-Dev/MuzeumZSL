<template>
  <div class="content">
    <div class="image"><img :src="imagePath" :alt="'image of ' + title" /></div>
    <div class="text">
      <div class="title">
        <h3>{{ title }}</h3>
      </div>
      <div class="description">
        <p>{{ description }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["id"],
  data: () => {
    return {
      imagePath: "images/loading.jpg",
      title: "Loading...",
      description:
        "wait to load article from database, if you have poor network it can tak awhile",
    };
  },
  created: function() {
    // request for item with this.id
  },
};
</script>

<style></style>
