
<template>
  <div>
    <div class="loginBox">
      <transition-group name="fade" @after-leave="afterChangeLoginView">
        <login-vue v-if="loginType === '登录'" key="login"></login-vue>
        <register-vue v-if="loginType === '注册'" key="register"></register-vue>
      </transition-group>
      <el-button type="primary" @click="prepareChangeLoginView" link >{{loginType === '登录' ? '注册':'登录'}}</el-button>
    </div>

  </div>
</template>

<script>

import LoginVue from "@/components/loginVue/LoginVue.vue";
import RegisterVue from "@/components/loginVue/RegisterVue.vue";
import {ref} from "vue";

export default {
  name: 'LoginView',
  components: {
    LoginVue,
    RegisterVue
  },
  setup() {
    let loginType = ref('登录')
    let nextLoginType = ref('')

    const prepareChangeLoginView = () => {
      nextLoginType.value = loginType.value === '登录' ? '注册' : '登录'
      loginType.value = ''

    }

    const afterChangeLoginView = () => {
      loginType.value = nextLoginType.value
      nextLoginType.value = ''
    }

    return {
      loginType,
      prepareChangeLoginView,
      afterChangeLoginView
    }
  }
}


</script>

<style scoped lang="scss">
.loginBox {
  width: 50%;
  margin: 100px auto;
}
.loginBox > el-input {
  margin-bottom: 20px;
}
.fade-enter-active, .fade-leave-active {
  transition: opacity .75s;
}
.fade-enter, .fade-leave-to {
  opacity: 0;
}
.el-button {
  margin-top: 1em;
}

</style>