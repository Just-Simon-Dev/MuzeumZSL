<template>
  <div id="not-found">
      <span class="found-title">404 not found</span>
      <font-awesome-icon v-for="i in 100" class="found-circle" :style="{animationDuration: Math.floor(Math.random() * (30 - 10)) + 10 + 's', bottom: Math.random()*100+'vh', left: Math.random()*200+'vh', fontSize: Math.floor(Math.random() * (60 - 24)) + 24 + 'px', zIndex: Math.floor(Math.random() * 2) - 1}" :icon="['fas', 'circle']" :key="i"/>
  </div>
</template>
<style>
#not-found{
    height: 100vh;
    width: 100%;
    background: #2c2c54;
    color: #fff;
    overflow: hidden;
    position: fixed;
}
.found-title{
    position: absolute;
    top: 50%;
    left: 50%;
    transform: translate(-50%, -50%);
    font-size: 4em;
    padding: 40px 60px;
    border: 1px solid #fff;
    border-radius: 10px;
    background-color: #2c2c54;
}
.found-circle{
    position: absolute;
    animation: animate1 infinite;
    transition: 1s ease-in-out;
}
@keyframes animate1 {
    100%{
        bottom: 110vh;
    }
}
</style>