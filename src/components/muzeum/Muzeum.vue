<template>
  <div id="muzeum">
      <div class="container animate__animated animate__fadeInUp">
          <div class="dash"></div>
          <Card v-for="contant in contents" :key="contant.id" :title="contant.title" :content="contant.content" :img="contant.img" :href="contant.href"></Card>
          <div class="dash"></div>
      </div>
  </div>
</template>

<script>
import Card from '../cards/Card.vue'
export default {
    components:{
        Card,
    },
    data: () => {
        return {
            contents: [
                {id: 1, title: 'telewizory', content: 'lorem', img: 'eoo', href: '/tvs'}, 
                {id: 2, title: 'radia', content: 'lorem', img: 'eoo', href: '/radios'},
                {id: 3, title: 'magnetofony', content: 'lorem', img: 'eoo', href: '/magnetofons'},
                {id: 4, title: 'komputery', content: 'lorem', img: 'eoo', href: '/computers'},
                {id: 5, title: 'gramofony', content: 'lorem', img: 'eoo', href: '/gramofons'},
            ]
        }
    }
}
</script>

<style>
#muzeum{
    position: relative;
    height: 100vh;
}
.container{
    height: 100vh;
    display: flex;
    flex-wrap: wrap;
    justify-content:center;
    align-items: center;
}
</style>