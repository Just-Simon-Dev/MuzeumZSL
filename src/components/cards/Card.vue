<template>
  <div class="card content-title" :style="{backgroundImage: 'url(' + this.img ? this.img : '' + ')' }">
      <div class="title">{{this.title}}</div>
      <div class="content">
          {{this.content}} 
          <a class="btn" :href="this.href">Czytaj więcej</a>
        </div>
      
  </div>
</template>

<script>
export default {
    props: ['title', 'content', 'img', 'href']
}
</script>

<style>
.card{
    position: static;
    background: #000;
    margin: 20px 10px;
    overflow: hidden;
    color: #fff;
    height: 300px;
    width: 250px;
    text-align: center;
}
.card:hover .title{
    height: 20%;
    line-height: 60px;
}
.title{
    line-height: 300px;
    font-size: 2em;
    width: 100%;
    height: 100%;
    border-bottom: 1px solid #fff;
    transition: 1s ease-in-out;
    background: rgba(0, 0, 0, .3);
}
.content{
    position: relative;
}
.btn{
    position: absolute;
    top: 35%;
    left: 5px;
    border: 1px solid #fff;
    border-radius: 30px;
    background: transparent;
    padding: 2px 5px;
    text-decoration: none !important;
    transition: 0.3s ease-in-out !important;
}
.btn:hover{
    background: #fff;
    color: #000 !important;
}
</style>