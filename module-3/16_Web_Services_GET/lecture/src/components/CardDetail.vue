<template>
  <div>
    <h1>{{card.title}}</h1>
    <p>{{card.description}}</p>
    <comments-list v-bind:comments="card.comments"/>
  </div>
</template>

<script>
import BoardService from '../services/BoardService';
import CommentsList from './CommentsList.vue';

export default {
  components: { CommentsList },
  name: "card-detail",
  data(){
    return {
      card: {
        title: '',
        description: '',
        status: '',
        comments: []
      }
    }
  },
  created(){
    BoardService.getCard(this.$route.params.boardID, this.$route.params.cardID).then((response) => {
      this.card = response;
    })
  },
};
</script>
