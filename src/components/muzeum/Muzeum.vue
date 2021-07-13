<template>
  <div id="items">
      <div class="space"></div>
      <div class="container animate__animated animate__fadeInUp">
          <Card v-for="contant in contents" :key="contant.id" :title="contant.title" :content="contant.content" :img="contant.img" :href="contant.href"></Card>
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
                {id: 1, title: 'telewizory', content: 'Lorem', img: 'tv', href: '/tvs'}, 
                {id: 2, title: 'radia', content: 'lorem', img: 'radio', href: '/radios'},
                {id: 3, title: 'magnetofony', content: 'lorem', img: 'magnetofon', href: '/magnetofons'},
                {id: 4, title: 'komputery', content: 'lorem', img: 'computer', href: '/computers'},
                {id: 5, title: 'gramofony', content: 'lorem', img: 'gramofon', href: '/gramofons'},
            ]
        }
    }
}
</script>

<style>
#items{
    position: relative;
    height: 100vh;
}
.space{
    height: 20vh;
    width: 100%;
}
.container{
    margin: auto;
    height: 60vh;
    display: flex;
    flex-wrap: wrap;
    justify-content:center;
    align-items: center;
    text-align: center;
    /* border-top: 2px solid #2c2c54;
    border-bottom: 2px solid #2c2c54; */
    background: #2c2c54;
    padding: 10px;
}
</style>