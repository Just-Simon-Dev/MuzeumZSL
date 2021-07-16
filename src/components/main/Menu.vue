<template>
  <div id="nav">
    <a href="/#main" style="text-decoration: none">
      <div class="nav-title">
        Muzeum ZSŁ
      </div>
    </a>
    <div class="nav-links">
      <div class="nav-element" :key="art.title" v-for="art in arts">
        <a :href="art.href">
          {{ art.title }}
        </a>
      </div>
    </div>
  </div>
</template>

<script>
window.addEventListener("scroll", () => {
  document.getElementById("nav").classList.toggle("black", window.scrollY > 0);
});
export default {
  data: () => {
    return {
      arts: [
        { title: "kontakt", href: "/#contact" },
        { title: "eskponaty", href: "/#items" },
        { title: "aktualności", href: "/#news" },
        { title: "o muzeum", href: "/#muzeum" },
      ],
    };
  },
};
</script>

<style>
@import url("https://fonts.googleapis.com/css2?family=Quicksand&display=swap");
* {
  padding: 0;
  margin: 0;
  box-sizing: border-box;
  font-family: "Quicksand";
}
#nav {
  position: fixed;
  width: 100%;
  padding: 15px;
  background: transparent;
  display: grid;
  grid-template-columns: 1fr 1fr;
  z-index: 2;
  border-bottom: 1px solid #fff;
  transition: 0.3s ease-in-out !important;
  color: #fff !important;
}
.nav-title {
  font-size: 2em;
  opacity: 1 !important;
  color: #fff !important;
}
.nav-element a {
  color: #fff !important;
  text-decoration: none !important;
  font-size: 1.5em;
}
.nav-element {
  display: block;
  float: right;
  margin-right: 1em;
  position: relative;
}
.nav-element a::after {
  content: "";
  position: absolute;
  box-sizing: border-box;
  left: 0;
  bottom: -1px;
  width: 100%;
  height: 1px;
  background: #fff;

  transform: scaleX(0);
  transform-origin: right;
  transition: transform 250ms ease-in-out;
}
.nav-element a:hover::after {
  transform: scaleX(1);
  transform-origin: left;
}
.black {
  background-color: rgba(0, 0, 0, 0.6) !important;
  border-bottom: none !important;
}
</style>
