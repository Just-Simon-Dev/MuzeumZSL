<template>
    <div class="main">
        <Menu></Menu>
        <Content></Content>
    </div>
</template>

<script>
import Menu from './Menu.vue'
import Content from './Content.vue'
export default {
    components: {
        Menu,
        Content
    }
}
</script>

<style>
    .main{
        background-color: #2c2c54;
        width: 100%;
        height: 100vh;
    }
</style>