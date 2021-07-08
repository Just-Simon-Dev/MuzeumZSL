<template>
  <div id="news">
      <div class="news-title">Aktualności</div>
      <Card title="lorem" content="ipsum" href="/dolor"></Card>
      <Card title="lorem" content="ipsum" href="/dolor"></Card>
      <Card title="lorem" content="ipsum" href="/dolor"></Card>
      <Card title="lorem" content="ipsum" href="/dolor"></Card>
      <Card title="lorem" content="ipsum" href="/dolor"></Card>
  </div>
</template>

<script>
import Card from './Card.vue'
export default {
  components:{
    Card
  }
}
</script>

<style>
#news{
    background: #2c2c54;
    width: 100%;
    height: 100vh;
    color: #fff !important;
}
.news-title{
  height: 100px;
  line-height: 140px;
  font-size: 2em;
  text-align: center;
}
</style>