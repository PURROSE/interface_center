<script setup>
import { ref }from 'vue'

let loginForm = ref({username: '', password: ''})
let loginErrorMsg = ref('')
</script>

<template>
  <div>
    <el-row>
      <el-col :span="4">
        用户名:
      </el-col>
      <el-col :span="18">
        <el-input v-model="loginForm.username" placeholder="请输入用户名"></el-input>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="4">
        密码:
      </el-col>
      <el-col :span="18">
        <el-input v-model="loginForm.password" placeholder="请输入密码"></el-input>
      </el-col>
    </el-row>
    <el-row>
      <el-col :span="24">
        <el-text v-show="loginErrorMsg == null " type="warning">{{loginErrorMsg}}</el-text>
      </el-col>
    </el-row>
    <el-button type="primary">登录</el-button>
    </div>
</template>

<style scoped lang="scss">
.el-input {
  margin-bottom: 1em;
}
.el-button {
  margin-top: 1em;
}
</style>