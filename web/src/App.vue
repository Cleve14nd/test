<template>
<div>
  <div>
    GetString:{{ get_string }}
  </div>
</div>
</template>

<script>
import $ from 'jquery';
import {ref} from 'vue';


export default {
  name:"app",
  setup:()=>{

    let get_string = ref("");

    $.ajax({
      url:"http://localhost:3000/pk/getbotinfo/",

      type:"get",
      success: resp=>{
        get_string.value=resp;
        console.log(resp);
      }

    })

    return {
      get_string
    }
  }
}

</script>

<style>
body{
  background-image: url("./assets/background.jpg") ;
  background-size: cover;
}
</style>
