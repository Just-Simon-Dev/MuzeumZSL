<template>
    <div class="content">
        <div class="content-title animate__animated animate__fadeInUp">
            <h1>Witamy w muzeum <br> techniki Zespołu Szkół Łączności!</h1>
            <a class="arrow" v-bind:class="{ anim: shake }" @mouseenter="shake = true" @mouseout="shake=false" href="#muzeum"></a>
        </div>
    </div>
</template>

<script>
export default {
    data: () => {
        return {
            shake: false
        }
    }
}
</script>

<style>
.content-title{
    position: absolute;
    top: 50%;
    left: 12%;
    line-height: 30px;
}
.arrow{
    position: absolute;
    border-bottom: 1px solid #fff;
    border-left: 1px solid #fff;
    width: 20px;
    height: 20px;
    rotate: -45deg;
    top: 120%;
    left: 50%;
    transform: translate(-50%, -50%);
    cursor: pointer;
}
.anim{
    animation: animate 1s ease-in-out;
}
@keyframes animate {
    50%{
        top: 110%;
    }
    0%, 100%{
        top: 120%;
    }
}
</style>