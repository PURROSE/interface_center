<script setup>
import { ref } from 'vue';

let registerForm = ref({username: '', password: '', confirmPassword: '', email: '', phone: ''});

</script>

<template>
    <div>
      <el-row>
        <el-col :span="4">
          用户名:
        </el-col>
        <el-col :span="18">
          <el-input v-model="registerForm.username" placeholder="请输入用户名"></el-input>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="4">
          密码:
        </el-col>
        <el-col :span="18">
          <el-input v-model="registerForm.password" placeholder="请输入密码"></el-input>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="4">
          确认密码:
        </el-col>
        <el-col :span="18">
          <el-input v-model="registerForm.confirmPassword" placeholder="请确认密码"></el-input>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="4">
          邮箱:
        </el-col>
        <el-col :span="18">
          <el-input v-model="registerForm.email" placeholder="请输入邮箱"></el-input>
        </el-col>
      </el-row>
      <el-row>
        <el-col :span="4">
          手机号:
        </el-col>
        <el-col :span="18">
          <el-input v-model="registerForm.phone" placeholder="请输入手机号"></el-input>
        </el-col>
      </el-row>
      <el-button type="primary">注册</el-button>
    </div>
</template>

<style scoped lang="scss">
.el-row {
  margin-bottom: 1em;
}
</style>