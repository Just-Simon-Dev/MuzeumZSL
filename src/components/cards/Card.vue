<template>
  <div class="card content-title" >
      
      <div class="title">{{this.title}}</div>
      <div class="content">
          <div class="content-text">{{this.content}}</div>
          <div class="content-btn"><a class="btn" :href="this.href">Czytaj więcej</a></div>
          
        </div>
        <div class="background" :style="{backgroundImage: `url(${images[this.img]})`}"></div>
  </div>
</template>

<script>
import computer from './imgs/computer.jpg'
import gramofon from './imgs/gramofon.jpg'
import magnetofon from './imgs/magnetofon.jpg'
import radio from './imgs/radio.jpg'
import tv from './imgs/tv.jpg'

export default {
    props: ['title', 'content', 'img', 'href'],
    data: () => {
        return {
            images: {'computer': computer, 'gramofon':  gramofon, 'magnetofon':  magnetofon, 'radio':  radio, 'tv':  tv},
        }
    }
}
</script>

<style>
*{
    box-sizing: border-box;
}
.card{
    position:relative;
    background: #000;
    margin: 20px 10px;
    overflow: hidden;
    color: #fff;
    height: 300px;
    width: 250px;
    text-align: center;
    z-index: -1;
    transform: translate(-75%, -75%);
    
}
.background{
    position: absolute;
    top: 0;
    height: 300px;
    width: 250px;
    background-size: cover !important;
    background-repeat: no-repeat !important;
    background-attachment: fixed !important;
    background-position: center !important; 
    z-index: 0;
    transition: .3s ease-in-out;
}
.card:hover .background{
    filter: blur(5px) !important;
    transform: scale(1.2);
}
.card:hover .title{
    height: 20%;
    line-height: 60px;
    background: rgba(0, 0, 0, .6);
}
.title{
    position: relative;
    line-height: 300px;
    font-size: 2em;
    width: 100%;
    height: 100%;
    border-bottom: 1px solid #fff;
    transition: 1s ease-in-out;
    background: rgba(0, 0, 0, .3);
    z-index: 1 !important;
}
.content{
    position: relative;
    background: rgba(0, 0, 0, .6);
    z-index: 1 !important;
}
.content-text{
    height: 205px;
    line-height: 15px;
}
.btn{
    padding-top: 5px;
    border: 1px solid #fff;
    border-radius: 30px;
    background: transparent;
    padding: 2px 5px;
    text-decoration: none !important;
    transition: 0.2s ease-in-out !important;
}
.btn:hover{
    background: #fff;
    color: #000 !important;
}
.content-btn{
    padding-top: 5px;
    position: relative;
    height: 15%;
    width: 100%;
    text-align: left;
    z-index: 1 !important;
    padding-left: 5px;
}
</style>