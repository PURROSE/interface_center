import { createRouter, createWebHashHistory } from 'vue-router'
import HomeView from '../views/HomeView.vue'
import  LoginView from '../views/LoginView.vue'
import AdminControllerView from "@/views/AdminControllerView.vue";

const routes = [
  {
    path: '/',
    name: 'home',
    component: HomeView
  },
  {
    path: '/login',
    name: 'login',
    component: LoginView
  },
  {
    path: '/admin',
    name: 'admin',
    component: AdminControllerView
  }
]

const router = createRouter({
  history: createWebHashHistory(),
  routes
})

export default router
