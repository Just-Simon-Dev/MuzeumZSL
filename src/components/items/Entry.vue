<template>
  <div class="content" v-animate-onscroll.repeat="'animate__animated animate__fadeIn'">
    <div class="image" :style="`background: url('${imagePath}')`"></div>
    <div class="text">
      <h3 class="title">{{ title }}</h3>
      <div class="description">
        <p>{{ description }}</p>
      </div>
      <button class="btn" type="button"><font-awesome-icon class="ic" :icon="['fas', 'table']" /></button>
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
        "wait for the article to be loaded from database",
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
  position: relative;
  height: 40vh;
  min-height: 400px;
  width: 80%;
  margin: 100px 0 0 0;
  transition: 0.3s ease-in-out;
}
.content:nth-child(2n){
  background: #eb3b5a;
  color: #fff;
  float: right;
  border-radius: 10px 0 0 10px !important;
}
.content:nth-child(2n) .image{
  border-radius: 10px 0 0 10px !important;
}
.content:nth-child(2n) .btn{
  background: #fff;
  color: #eb3b5a;
  right: 10px;
}
.content:nth-child(2n+1){
  background: #fff;
  float: left;
  border-radius: 0 10px 10px 0;
}
.content:nth-child(2n+1) .image{
  float: right;
  border-radius: 0 10px 10px 0;
}
.content:nth-child(2n+1) .btn{
  background: #eb3b5a;
  color: #fff;
  left: 10px;
}
.image {
  width: 30%;
  height: 100%;
  float: left;
  background-size: cover !important;
  background-repeat: no-repeat !important;
  background-position: center !important; 
}
img {
  height: inherit !important;
}
.text {
  position: sticky;
  width: 70%;
  float: left;
}
.title {
  width: 40%;
  margin: 20px auto;
  text-align: center;
  font-size: 30px;
  padding: 17px 0 12px 0;
}
.description {
  width: 80%;
  margin: auto;
  padding: 20px;
  line-height: 200%;
}
.btn{
  position: absolute;
  bottom: 10px;
  font-size: 24px;
  border: none;
  border-radius: 50%;
  padding: 10px;
  cursor: pointer;
}
</style>
