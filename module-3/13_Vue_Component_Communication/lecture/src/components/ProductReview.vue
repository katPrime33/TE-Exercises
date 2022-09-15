<template>
  <div class="main" v-bind:style="'background-color: ' + backgroundColor">
   
    
    <a href="#" v-on:click="showForm = !showForm">Show Form</a>
    <form v-on:submit.prevent="addNewReview" v-if="showForm">
      <div class="form-element">
        <label for="reviewer">Name: </label>
        <input id="reviewer" type="text" v-model="newReview.reviewer" />
      </div>
      <div class="form-element">
        <label for="title">Title: </label>
        <input id="title" type="text" v-model="newReview.title" />
      </div>
      <div class="form-element">
        <label for="rating">Rating: </label>
        <select id="rating" v-model.number="newReview.rating">
          <option value="1">1 star</option>
          <option value="2">2 stars</option>
          <option value="3">3 stars</option>
          <option value="4">4 stars</option>
          <option value="5">5 stars</option>
        </select>
      </div>
      <div class="form-element">
        <label for="review">Review: </label>
        <textarea id="review" v-model="newReview.review"></textarea>
      </div>
      <input type="submit" value="Save" />
      <input type="button" value="Cancel" v-on:click="resetForm" />
    </form>
    <div>
      <ul v-on:click="changeBackgroundColor($event)">
        <li>Red</li>
        <li>Green</li>
        <li>Blue</li>
        <li>Transparent</li>
      </ul>
    </div>
  </div>
</template>

<script>
export default {
  name: "product-review",
  data() {
    return {
      
      newReview: {},
      showForm: false,
      filterRatingValue: 0,
      backgroundColor: 'transparent',
      reviews: [
        {
          reviewer: "Malcolm Gladwell",
          title: "What a book!",
          review:
            "It certainly is a book. I mean, I can see that. Pages kept together with glue and there's writing on it, in some language.",
          rating: 3,
          favorited: false,
        },
        {
          reviewer: "Malcolm Gladwell",
          title: "Had a cigar party started in less than 4 hours.",
          review:
            "It should have been called the four hour cigar party. That's amazing. I have a new idea for muse because of this.",
          rating: 4,
          favorited: false,
        },
        {
          reviewer: "Ramit Sethi",
          title: "What every new entrepreneurs needs. A door stop.",
          review:
            "When I sell my courses, I'm always telling people that if a book costs less than $20, they should just buy it. If they only learn one thing from it, it was worth it. Wish I learned something from this book.",
          rating: 1,
          favorited: false,
        },
        {
          reviewer: "Gary Vaynerchuk",
          title: "And I thought I could write",
          review:
            "There are a lot of good, solid tips in this book. I don't want to ruin it, but prelighting all the cigars is worth the price of admission alone.",
          rating: 3,
          favorited: false,
        },
      ],
    };
  },
  computed: {
    averageRating() {
      let sum = this.reviews.reduce((currentSum, review) => {
        return currentSum + review.rating;
      }, 0);
      return (sum / this.reviews.length).toFixed(2);
    },
    numberOfOneStarReviews() {
      return this.numberOfReviews(1);
    },
    numberOfTwoStarReviews() {
      return this.numberOfReviews(2);
    },
    numberOfThreeStarReviews() {
      return this.numberOfReviews(3);
    },
    numberOfFourStarReviews() {
      return this.numberOfReviews(4);
    },
    numberOfFiveStarReviews() {
      return this.numberOfReviews(5);
    },
    filterReviews() {
      return this.reviews.filter((review) => {
        return this.filterRatingValue === 0
          ? true
          : this.filterRatingValue === review.rating;
      });
    },
  },
  methods: {
    addNewReview() {
      this.reviews.unshift(this.newReview);
      console.log(this.reviews);
      this.resetForm();
    },
    resetForm() {
      this.newReview = {};
      this.showForm = false;
    },
    numberOfReviews(numOfStars) {
      return this.reviews.reduce((currentCount, review) => {
        return currentCount + (review.rating === numOfStars);
      }, 0);
    },
    changeBackgroundColor(event){
      this.backgroundColor = event.target.innerText;
    }
  },
};
</script>

<style scoped>
ul{
  list-style: none;
}

div.main {
  margin: 1rem 0;
}

div.main div.well-display {
  display: flex;
  justify-content: space-around;
}

div.main div.well-display div.well {
  display: inline-block;
  width: 15%;
  border: 1px black solid;
  border-radius: 6px;
  text-align: center;
  margin: 0.25rem;
}

div.main div.well-display div.well span.amount {
  color: darkslategray;
  display: block;
  font-size: 2.5rem;
}

</style>

