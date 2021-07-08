<template>
  <div class="news-card">
      <div class="news-card-title">{{this.title}}</div>
      <div class="news-card-content">{{this.content}}</div>
      <a :href="this.href"><div class="news-card-url">Czytaj więcej</div></a>
  </div>
</template>

<script>
export default {
    props: ['title', 'content', 'href']
}
</script>

<style>
.news-card{
    width: 55%;
    height: 120px;
    margin-bottom: 10px;
    padding: 20px;
    
}
.news-card:nth-child(2n){
    border-radius: 3px 0px 0px 3px;
    background: #fff;
    text-align: right;
    color: #2c2c54 !important;
    float: right;
}
.news-card:nth-child(2n+1){
    border-radius: 0px 3px 3px 0px;
    background: #130f40;
    text-align: left;
    color: #fff !important;
    float: left;
}
</style>