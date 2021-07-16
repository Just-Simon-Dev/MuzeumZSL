import Vue from "vue";
import App from "./App.vue";
import VueMaterial from "vue-material";
import "vue-material/dist/vue-material.min.css";
import "vue-material/dist/theme/default.css";
import VueAnimateOnScroll from "vue-animate-onscroll";
import { library } from "@fortawesome/fontawesome-svg-core";
import { FontAwesomeIcon } from "@fortawesome/vue-fontawesome";
import {
    faInstagram,
    faFacebook,
    faYoutubeSquare,
} from "@fortawesome/free-brands-svg-icons";
import VueRouter from 'vue-router'
import Items from './components/items/Items.vue'
import Home from './components/home/Home.vue'

library.add(faInstagram, faFacebook, faYoutubeSquare);
Vue.component("font-awesome-icon", FontAwesomeIcon);

Vue.use(VueAnimateOnScroll);
Vue.use(VueMaterial);
Vue.use(VueRouter)

const router = new VueRouter({
    routes: [
        {path: '/', component: Home},
        { path: '/eksponaty/:category', component: Items}
    ],
    mode: 'history'
})

new Vue({
    el: "#app",
    router: router,
    render: (h) => h(App),
});