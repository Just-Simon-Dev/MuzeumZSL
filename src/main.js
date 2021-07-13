import Vue from 'vue';
import App from './App.vue';
import VueMaterial from 'vue-material'
import 'vue-material/dist/vue-material.min.css'
import 'vue-material/dist/theme/default.css'
import VueAnimateOnScroll from 'vue-animate-onscroll'
import { library } from "@fortawesome/fontawesome-svg-core";
import { FontAwesomeIcon } from "@fortawesome/vue-fontawesome";
import { faInstagram, faFacebook, faYoutubeSquare } from "@fortawesome/free-brands-svg-icons";

library.add(faInstagram, faFacebook, faYoutubeSquare);
Vue.component("font-awesome-icon", FontAwesomeIcon)

Vue.use(VueAnimateOnScroll)
Vue.use(VueMaterial)

new Vue({
    el: '#app',
    render: h => h(App),
});