<template>
  <div id="login" class="text-center component-main">
    <form class="form-signin" @submit.prevent="login">
      <h1 class="h3 mb-3 font-weight-normal">Please Sign In</h1>
      <div id="container">
        <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
          Invalid username and password!
        </div>
        <div
          class="alert alert-success"
          role="alert"
          v-if="this.$route.query.registration"
        >
          Thank you for registering, please sign in.
        </div>
        <div class="form-group">
          <label for="username" class="sr-only">Username</label>
          <input
            type="text"
            id="username"
            class="form-control"
            placeholder="Username"
            v-model="user.username"
            required
            autofocus
          />
        </div>
        <div class="form-group">
          <label for="password" class="sr-only">Password</label>
          <input
            type="password"
            id="password"
            class="form-control"
            placeholder="Password"
            v-model="user.password"
            required
          />
        </div>
        <div class="form-group">
          <button id="submitBtn" type="submit">Sign in</button>
          <router-link id="regLink" :to="{ name: 'register' }"
            >Need an account?</router-link
          >
        </div>
      </div>
    </form>
  </div>
</template>
 
<script>
import authService from "../services/AuthService";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: "",
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      authService
        .login(this.user)
        .then((response) => {
          if (response.status == 200) {
            this.$store.commit("SET_AUTH_TOKEN", response.data.token);
            this.$store.commit("SET_USER", response.data.user);
            this.$router.push("/");
          }
        })
        .catch((error) => {
          const response = error.response;

          if (response.status === 401) {
            this.invalidCredentials = true;
          }
        });
    },
  },
};
</script>

<style>
/* #login{
  margin-top: 80px;
} */
#container {
  display: flex;
  justify-content: space-around;
}

.form-control {
  margin-left: 8px;
  height: 25px;
}

h1 {
  margin-left: 10px;
}

#regLink {
  color: rgb(180, 180, 200);
  margin-left: 8px;
}

#submitBtn{
  width: 150px;
}
</style>