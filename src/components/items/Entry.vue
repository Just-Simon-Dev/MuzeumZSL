<template>
  <div class="entry-content" v-animate-onscroll.repeat="'animate__animated animate__fadeIn'">
    <div class="image" :style="`background: url('${imagePath}')`"></div>
    <div class="text">
      <h3 class="entry-title">{{ this.obj.title }}</h3>
      <div class="description">
        <p>{{ this.obj.description }}</p>
      </div>

    </div>
    <router-link class="entry-btn" :to="'/details/'+this.obj.id">Czytaj więcej</router-link>
  </div>
</template>

<script>
export default {
  props: ["id", "position", "obj"],
  data: () => {
    return {
      imagePath: "../assets/images/loading.jpg",
      // title: "Loading...",
      // description:
      //   "wait for the article to be loaded from database",
    };
  },
  created: function() {
    // request for item with this.id
    this.imagePath =
      "https://static.turbosquid.com/Preview/2019/05/07__14_24_00/Retro_TV_Showa_Dirt_00.jpgDD92FD2F-8E7F-4427-8210-CCCEA527746DLarge.jpg";
  },
};
</script>

<style>
.entry-content {
  position: relative;
  height: 40vh;
  min-height: 400px;
  width: 80%;
  margin: 100px 0 0 0;
  transition: 0.3s ease-in-out;
}
.entry-content:nth-child(2n){
  background: #eb3b5a;
  color: #fff;
  float: right;
  border-radius: 10px 0 0 10px !important;
}
.entry-content:nth-child(2n) .image{
  border-radius: 10px 0 0 10px !important;
}
.entry-content:nth-child(2n) .entry-btn{
  background: #fff;
  color: #eb3b5a !important;
  right: 10px;
}
.entry-content:nth-child(2n+1){
  background: #fff;
  float: left;
  border-radius: 0 10px 10px 0;
}
.entry-content:nth-child(2n+1) .image{
  float: right;
  border-radius: 0 10px 10px 0;
}
.entry-content:nth-child(2n+1) .entry-btn{
  background: #eb3b5a;
  color: #fff !important;
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
.entry-title {
  margin: 20px 0px;
  text-align: center;
  font-size: 30px;
  padding: 17px 0 17px 0;
}
.entry-content:nth-child(2n) .entry-title{
  border-bottom: #fff 1px solid;
}
.entry-content:nth-child(2n+1) .entry-title{
  border-bottom: #eb3b5a 1px solid;
}
.description {
  width: 75%;
  margin: auto;
  padding: 20px;
  line-height: 200%;
}
.entry-btn{
  position: absolute;
  bottom: 10px;
  border: none;
  border-radius: 20px;
  padding: 10px;
  cursor: pointer;
  text-decoration: none !important;
}
</style>
