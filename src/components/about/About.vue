<template>
  <div id="muzeum">
      <div class="empty"></div>
      <div class="about-content">
        <div class="about-title">O muzeum</div>
        <div class="about-text">Lorem ipsum dolor sit amet consectetur adipisicing elit. Molestias consectetur saepe alias dolor impedit ipsa! Dicta maiores provident voluptate explicabo molestiae consectetur molestias, porro ab sapiente libero aperiam. Quisquam, obcaecati.</div>
      </div>
  </div>
</template>

<script>
export default {

}
</script>

<style>
#muzeum{
    width: 100%;
    height: 100vh;
}
.empty{
    height: 10vh;
}
.about-title{
    text-align: left !important;
    color: #2c2c54;
    margin: 10px;
    font-size: 2.5em;
    text-decoration: underline;
}
.about-content{
    height: 60vh;
    /* border-top: 2px solid #2c2c54;
    border-bottom: 2px solid #2c2c54; */
}
.about-text{
    color: #2c2c54;
    margin: 10px;
}
</style>