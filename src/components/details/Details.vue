<template>
  <div id="details">
      <router-link :to="$router.back()">sus</router-link>
      <div class="details-title">nice title</div>
      <div class="details-content">
          <div class="work">
              <div class="details-title-section">Jak działał?</div>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Suscipit sed perferendis non quidem officia quo iusto incidunt aspernatur labore, modi alias nosmd-table-rowum qui sequi deleniti quasi dolorum in molestias quae?</div>
          <div class="common-details">
              <div class="details-title-section">Informacje ogólne</div>
              <md-table>
                  <md-table-row><md-table-cell>Producent:</md-table-cell><md-table-cell>123123123</md-table-cell></md-table-row>
                  <md-table-row><md-table-cell>Model:</md-table-cell><md-table-cell>1231231</md-table-cell></md-table-row>
                  <md-table-row><md-table-cell>Rok produkcji:</md-table-cell><md-table-cell>123312312</md-table-cell></md-table-row>
                  <md-table-row><md-table-cell>Miejsce produkcji:</md-table-cell><md-table-cell>12312333</md-table-cell></md-table-row>
                  <md-table-row><md-table-cell>Typ:</md-table-cell><md-table-cell>123123</md-table-cell></md-table-row>
              </md-table>
          </div>
          <div class="schema">
              <div class="details-title-section">schemat</div>
          </div>
          <div class="technical-information">
              <div class="details-title-section">dane techniczne</div>
              Lorem ipsum dolor sit amet consectetur adipisicing elit. Mollitia, illo. Sed animi neque, ex omnis, eveniet blanditiis quos corporis modi explicabo quibusdam molestias accusamus nihil. Minus accusamus ratione incidunt maxime.</div>
      </div>
  </div>
</template>

<script>
export default {
}
</script>

<style>
#details{
    height: 100vh;
    width: 100%;
    background: #2c2c54;
    color: #fff;
}
.details-title{
    font-size: 4em;
    text-align: center;
    padding: 30px;
    text-transform: uppercase;
    letter-spacing: 3px;
    border-bottom: 1px solid #fff;
}
.details-content{
    padding: 10px;
}
.work{
    max-height: 45vh;
    width: 50%;
    float: left;
}
.details-title-section{
    font-size: 1.5em;
    padding: 10px 0 10px 0;
    letter-spacing: 3px;
}
.common-details{
    max-height: calc(45vh-20px);
    width: 50%;
    float: left;
    text-align: center;
    padding: 0 0 10px 10px;
}
</style>