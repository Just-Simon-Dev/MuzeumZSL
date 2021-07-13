<template>
  <div class="content">
    <div class="image"><img :src="imagePath" :alt="'image of ' + title" /></div>
    <div class="text">
      <h3 class="title">{{ title }}</h3>
      <div class="description">
        <p>{{ description }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  props: ["id", "position"],
  data: () => {
    return {
      imagePath: "../assets/images/loading.jpg",
      title: "Loading...",
      description:
        "wait to load article from database, if you have poor network it can tak awhile",
    };
  },
  created: function() {
    // request for item with this.id

    this.imagePath =
      "https://static.turbosquid.com/Preview/2019/05/07__14_24_00/Retro_TV_Showa_Dirt_00.jpgDD92FD2F-8E7F-4427-8210-CCCEA527746DLarge.jpg";
    this.title = "Telewizor model 2.3";
    this.description = `
  Lorem ipsum dolor sit amet consectetur adipisicing elit.
   Reiciendis magnam a eveniet tempore.
    Itaque omnis neque doloribus deserunt aspernatur facere laboriosam amet culpa hic suscipit vero dignissimos explicabo sapiente ipsum corporis soluta,
    consequatur repellat ducimus sed quae labore quod eligendi natus! Nesciunt dolor fuga sapiente laborum rerum perspiciatis quasi sunt ratione veniam,
     ipsa, cupiditate illum, odit dolorum modi! Necessitatibus exercitationem consequuntur reprehenderit voluptatibus recusandae fugiat veritatis.
      Soluta rerum nulla numquam veritatis repellendus excepturi, reprehenderit ipsum ab culpa, possimus eaque perferendis maiores nesciunt aliquid natus consequatur pariatur harum,
    `;
  },
};
</script>

<style>
.content {
  height: 40vh;
  min-height: 400px;
  width: 80%;
  background: rgb(3, 20, 200);
  margin: 0 0 100px 0;
  position: relative;
  top: 35px;
}
.image {
  width: 30%;
  height: 100%;
  float: left;
}
img {
  height: inherit !important;
}
.text {
  width: 70%;
  float: left;
}
h3 {
  width: 40%;
  margin: auto;
  text-align: center;
  font-size: 30px;
  padding: 17px 0 12px 0;
  border-radius: 40px;
  background: #eee;
}
.description {
  width: 80%;
  background-color: #eee;
  border-bottom-right-radius: 10px;
  margin: auto;
  padding: 20px;
  line-height: 200%;
}
</style>
