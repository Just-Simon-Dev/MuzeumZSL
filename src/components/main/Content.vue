<template>
  <div class="content-comp">
    <div v-animate-onscroll.repeat="'animate__animated animate__fadeInUp'" class="content-title">
      <h1>
        Witamy w muzeum <br />
        techniki Zespołu Szkół Łączności!
      </h1>
      <a
        class="arrow"
        v-bind:class="{ anim: shake }"
        @mouseenter="shake = true"
        @mouseout="shake = false"
        href="#muzeum"
      ></a>
    </div>
    <img class="img parallax" src="https://i.imgur.com/WypAtUb.png">
  </div>
  
</template>

<script>
export default {
  data: () => {
    return {
      shake: false,
    };
  },
};
</script>

<style>
.img{
  position: absolute;
  right: -30px;
  top: 50px;
}nt-comp{
    height: 100vh;
}
.content-title{
    position: absolute;
    top: 50%;
    left: 12%;
    line-height: 30px;
    color: #fff !important;
}
.arrow {
  position: absolute;
  border-bottom: 1px solid #fff;
  border-left: 1px solid #fff;
  width: 20px;
  height: 20px;
  top: 120%;
  left: 50%;
  transform: translate(-50%, -50%) rotate(-45deg);
  cursor: pointer;
}
.anim {
  animation: animate 1s ease-in-out;
}
@keyframes animate {
  50% {
    top: 110%;
  }
  0%,
  100% {
    top: 120%;
  }
}
</style>
