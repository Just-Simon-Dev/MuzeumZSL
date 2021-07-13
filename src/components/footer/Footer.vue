<template>
  <div id="footer">
    <div class="footer-comp footer-left">
      <div class="footer-quote">
        Historia według Zespołu Szkół Łączności w Gdańsku
      </div>
      <div class="footer-social-media">
        <a class="footer-icon"
          ><md-icon style="color: #fff">facebook</md-icon> Facebook</a
        >
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
            <a :href="comp.href" class="footer-links">{{ comp.title }}</a>
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
    return {
      arts: [
        { title: "kontakt", href: "#contact", isSelect: false },
        {
          title: "eskponaty",
          href: "#items",
          isSelect: true,
          comps: [
            { title: "telewizory", href: "/tvs" },
            { title: "radia", href: "/radios" },
            { title: "magnetofony", href: "/magnetofons" },
            { title: "komputery", href: "/computers" },
            { title: "gramofony", href: "/gramofons" },
          ],
        },
        { title: "aktualności", href: "#news", isSelect: false },
        { title: "o muzeum", href: "#muzeum", isSelect: false },
      ],
    };
  },
};
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
.footer-icon {
  color: #fff !important;
  cursor: pointer;
  text-decoration: none !important;
  line-height: 24px;
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
</style>
