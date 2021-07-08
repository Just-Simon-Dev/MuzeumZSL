<template>
  <div class="contentComp">
    <div class="content-title animate__animated animate__fadeInUp">
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
.Content{
    height: 100vh;
}
.content-title{
    position: absolute;
    top: 50%;
    left: 12%;
    line-height: 30px;
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
