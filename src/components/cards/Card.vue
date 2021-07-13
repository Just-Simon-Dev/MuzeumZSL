<template>
  <div class="card content-title">
    <a class="btn" :href="this.href">
      <div class="title">{{ this.title }}</div>
      <div class="content">
        <div class="content-text">{{ this.content }}</div>
      </div>
      <div
        class="background"
        :style="{ backgroundImage: `url(../assets/images/${this.img}.jpg)` }"
      ></div>
    </a>
  </div>
</template>

<script>
export default {
  props: ["title", "content", "img", "href"],
};
</script>

<style>
* {
  box-sizing: border-box;
}
.card {
  position: relative;
  background: #000;
  margin: 20px 10px;
  overflow: hidden;
  color: #fff !important;
  height: 300px;
  width: 250px;
  text-align: center;
  z-index: -1;
  transform: translate(-75%, -75%);
}
.background {
  position: absolute;
  top: 0;
  height: 300px;
  width: 250px;
  background-size: cover !important;
  background-repeat: no-repeat !important;
  background-attachment: fixed !important;
  background-position: center !important;
  z-index: 0;
  transition: 0.3s ease-in-out;
}
.card:hover .background {
  filter: blur(5px) !important;
  transform: scale(1.2);
}
.card:hover .title {
  height: 20%;
  line-height: 60px;
  background: rgba(0, 0, 0, 0.6);
}
.title {
  position: relative;
  line-height: 300px;
  font-size: 2em;
  width: 100%;
  height: 100%;
  border-bottom: 1px solid #fff;
  transition: 1s ease-in-out;
  background: rgba(0, 0, 0, 0.3);
  z-index: 1 !important;
}
.content {
  position: relative;
  background: rgba(0, 0, 0, 0.6);
  z-index: 1 !important;
}
.content-text {
  height: 205px;
  line-height: 15px;
}
.btn {
  text-decoration: none !important;
  color: #fff !important;
}
</style>
