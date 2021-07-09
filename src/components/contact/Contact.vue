<template>
  <div id="contact">
      <form novalidate class="md-layout" style="padding: 10px;" @submit.prevent="validateUser">
          <md-card class="md-layout-item md-size-50 md-small-size-100">
            <md-card-header>
                <div class="md-title">Kontakt</div>
            </md-card-header>
            <md-card-content>
                <md-field>
                    <label>imie</label>
                    <md-textarea v-model="autogrow" md-autogrow></md-textarea>
                </md-field>
                <md-field>
                    <label>nazwisko</label>
                    <md-textarea v-model="autogrow" md-autogrow></md-textarea>
                </md-field>
                <md-field>
                    <label>treść</label>
                    <md-textarea v-model="autogrow" md-autogrow></md-textarea>
                </md-field>
                <md-button type="submit" class="md-primary">Wyślij do nas!</md-button>
            </md-card-content>
        </md-card>
    </form>
  </div>
</template>

<script>
export default {

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