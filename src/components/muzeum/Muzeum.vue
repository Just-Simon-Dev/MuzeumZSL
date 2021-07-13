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
                {id: 1, title: 'telewizory', content: 'Lorem', img: 'https://i.imgur.com/GtIfYh7.jpg', href: '/tvs'}, 
                {id: 2, title: 'radia', content: 'lorem', img: 'https://i.imgur.com/E7FLS18.png', href: '/radios'},
                {id: 3, title: 'magnetofony', content: 'lorem', img: 'https://i.imgur.com/O8PTPEG.png', href: '/magnetofons'},
                {id: 4, title: 'komputery', content: 'lorem', img: 'https://i.imgur.com/aZKEOg9.png', href: '/computers'},
                {id: 5, title: 'gramofony', content: 'lorem', img: 'https://i.imgur.com/6cqv5ud.png', href: '/gramofons'},
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