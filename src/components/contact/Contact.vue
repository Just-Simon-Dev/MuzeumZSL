<template>
  <div id="contact">
      <form novalidate class="md-layout" style="padding: 10px;" v-on:submit="sendEmail">
          <md-card class="md-layout-item md-size-50 md-small-size-100">
            <md-card-header>
                <div v-animate-onscroll.repeat="'animate__animated animate__fadeInUp'" class="md-title">Kontakt</div>
            </md-card-header>
            <md-card-content>
                <md-field v-animate-onscroll.repeat="'animate__animated animate__fadeInUp'">
                    <label>imie</label>
                    <md-textarea v-model="name" md-autogrow></md-textarea>
                </md-field>
                <md-field v-animate-onscroll.repeat="'animate__animated animate__fadeInUp'">
                    <label>nazwisko</label>
                    <md-textarea v-model="surname" md-autogrow></md-textarea>
                </md-field>
                <md-field v-animate-onscroll.repeat="'animate__animated animate__fadeInUp'">
                    <label>treść</label>
                    <md-textarea v-model="message" md-autogrow></md-textarea>
                </md-field>
                <md-button type="submit" value="send" class="md-primary" v-animate-onscroll.repeat="'animate__animated animate__fadeInUp'">Wyślij!</md-button>
            </md-card-content>
        </md-card>
    </form>
  </div>
</template>

<script>
import emailjs from 'emailjs-com';

export default {
    data: () => {
        return {
            name: '',
            surname: '',
            message: '',
        }
    },
    methods:{
        sendEmail(e){
            
            try{
                emailjs.send("service_ca0z6e7","template_8j9o7qs",{
                    name: this.name,
                    surname: this.surname,
                    message: this.message,
                }, 'user_XUZrjETHjBTTI7osGhUmH');
            }
            catch(err){
                console.error(err)
            }
            this.name = ''
            this.surname = ''
            this.message = ''
        }
    }
}
</script>

<style>
#contact{
    width: 100%;
    height: 100vh;
    background: #2c2c54;
    color: #fff !important;
    text-align: center;
}
.md-layout{
    align-items: center !important;
    justify-content: center !important;
    height: 100vh;
}
</style>