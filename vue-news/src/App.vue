<template>
  <div id="app">
    <tool-bar />
    <transition name="page">
      <router-view></router-view>
    </transition>
  </div>
</template>

<script>
import ToolBar from "./components/ToolBar";

export default {
  components: {
    ToolBar
  }
};
</script>

<style>
body {
  padding: 0;
  margin: 0;
}

a {
  color: #344952;
  text-decoration: none;
}

a:hover {
  color: #42b883;
  text-decoration: underline;
}

a.router-link-exact-active {
  text-decoration: underline;
}

.page-enter-active, .page-leave-active {
  transition: opacity .5s;
}
.page-enter, .page-leave-to {
  opacity: 0;
}
</style>
