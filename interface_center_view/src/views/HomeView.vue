<template>
  <div class="home">
    <img alt="Vue logo" src="../assets/logo.png">
    <HelloWorld msg="Welcome to Your Vue.js App"/>
  </div>
</template>

<script>
// @ is an alias to /src
import HelloWorld from '@/components/HelloWorld.vue'
import { useRouter } from 'vue-router'

export default {
  name: 'HomeView',
  components: {
    HelloWorld
  },
  setup() {
    const router = useRouter()
    router.push({ path: '/login' })
  }
}
</script>
