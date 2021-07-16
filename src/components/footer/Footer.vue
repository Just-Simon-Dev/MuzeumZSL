<template>
  <div id="footer">
      <div class="footer-comp footer-left">
          <div class="footer-quote"><span style="color: #ff5252">Historia</span> według <span style="color: #ff5252">Zespołu Szkół Łączności</span> w Gdańsku</div>
          <div class="footer-social-media">
            <a class="footer-icon"><font-awesome-icon class="ic" :icon="['fab', 'facebook']" /> <span class="ic-text">Facebook</span></a>
            <a class="footer-icon"><font-awesome-icon class="ic" :icon="['fab', 'instagram']" /> <span class="ic-text">Instagram</span></a>
            <a class="footer-icon"><font-awesome-icon class="ic" :icon="['fab', 'youtube-square']" /> <span class="ic-text">Youtube</span></a>
          </div>
      </div>
      <div class="footer-comp footer-right">
        <table class="footer-tb">
          <td class="footer-nav" :key="art.title" v-for="art in arts">
            <a :href="art.href"
              ><div class="art-title">{{ art.title }}</div></a
            >
            <tr
              class="column"
              :key="comp.title"
              if="art.isSelect"
              v-for="comp in art.comps"
            >
              <router-link :to="'/eksponaty/'+comp.title" class="footer-links">{{ comp.title }}</router-link>
            </tr>
          </td>
        </table>
        <div class="footer-rights">
          Wszelkie prawa zastrzeżone &copy;
          <span style="letter-spacing: 1px;">MuzeumZSŁ</span> 2021
        </div>
      </div>
    </div>
    
</template>

<script>
export default {
    data: () => {
        return{
            arts: [{title: 'o muzeum', href: '#muzeum', isSelect: false}, {title: 'aktualności', href:'#news', isSelect: false}, {title: 'eskponaty', href: '#items', isSelect: true, comps: [{title: 'telewizory'}, {title: 'radia'}, {title: 'magnetofony'}, {title: 'komputery'}, {title: 'gramofony'}]}, {title: 'kontakt', isSelect: false}]
        }
    }
}
</script>

<style>
#footer {
  position: relative;
  width: 100%;
  height: 60vh;
  background: #2c2c2c;
  padding: 50px;
  color: #fff;
}
.footer-comp {
  float: left;
}
.footer-left {
  border-right: 1px solid #fff;
  width: 35%;
  height: 100%;
}
.footer-right {
  height: 100%;
  width: 65%;
}
.footer-quote {
  font-size: 3em;
  line-height: 40px;
  width: 400px;
  font-weight: bold;
  letter-spacing: 5px;
  padding: 0 0 10px 0;
  border-bottom: 1px solid #fff;
  margin: 15px;
}
.footer-social-media {
  margin: 0 0 0 15px;
}
.footer-icon{
    display: block;
    color: #fff !important;
    cursor: pointer;
    text-decoration: none !important;
    height: 24px !important;
    transition: 0.3s ease-in-out !important;
}
.footer-icon:hover, .ic, .ic-text{
    font-size: 1.1em;
}
.footer-nav {
  display: inline-block;
  margin-left: 40px;
  color: #fff;
}
.footer-tb {
  margin-left: auto;
  margin-right: auto;
}
.column,
.art-title {
  height: 40px;
  line-height: 40px;
}
.art-title {
  color: #fff;
}
.footer-links {
  color: #fff !important;
  padding-top: 15px !important;
}
.footer-rights {
  text-align: center;
  border-top: 1px solid #fff;
  margin-top: 10px;
  padding: 15px 0 0 15px;
  line-height: 50px;
  height: 100px;
}
.ic, .ic-text{
    font-size: 1.2em;
}
.ic-text{
    letter-spacing: 1px;
}
</style>
