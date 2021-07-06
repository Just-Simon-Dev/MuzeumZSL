<template>
    <div class="main">
        <Menu></Menu>
    </div>
</template>

<script>
import Menu from './Menu.vue'
export default {
    components: {
        Menu
    }
}
</script>

<style>
    .main{
        background-color: #2c2c54;
        width: 100%;
        height: 200vh;
    }
</style>