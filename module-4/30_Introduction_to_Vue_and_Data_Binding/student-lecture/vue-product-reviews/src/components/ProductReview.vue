<template>
  <div class="main">
     <h2> Product Reviews for {{name}} </h2>
     <p class="description"> {{description}}</p>
     <div class="well-display">
         <div class="well">
             <span class="amount">
                 {{averageRating}}
             </span>
             Average Rating
             </div>
                <div class="well">
             <span class="amount">
                 {{numberOneStarReviews}}
             </span>
             1 Star Reviews
         </div>
            <div class="well">
             <span class="amount">
                 {{numberTwoStarReviews}}
             </span>
             2 Star Reviews
         </div>
            <div class="well">
             <span class="amount">
                 {{numberThreeStarReviews}}
             </span>
             3 Star Reviews
         </div>
            <div class="well">
             <span class="amount">
                 {{numberFourStarReviews}}
             </span>
             4 Star Reviews
         </div>   <div class="well">
             <span class="amount">
                 {{numberFiveStarReviews}}
             </span>
            5 Star Reviews
         
         </div>
         </div>
       <div class="review" v-for="review in reviews" v-bind:key="review.id" v-bind:class="{favorited: review.favorited}"> 
       <h4>{{review.rating}}</h4>
         <div class="rating">
           <img src="../assets/star.png" v-bind:title="review.rating + ' Star Review'" class="ratingStar"
           v-for="n in review.rating" v-bind:key="n"/>
           </div>
           <h3>{{review.title}}</h3>
           <p>{{review.review}}</p>
           <p> Favorite? <input type="checkbox" v-model="review.favorited"/></p>
           </div>
 </div>

</template>

<script>
export default {
    name:'product-review',
    data(){
        return {
            name: 'Cigar Parties for Dummies',
            description: 'host and plan the perfect cigar party for all of your squirelly friends.',
            reviews: [
                {reviewer: 'Malcolm Gladwell',
                title: 'What a book!',
                review: 'I read the whole thing. super',
                rating: 3,
                id: 0
                },
                  {reviewer: 'Katie Dwyer',
                title: 'not as fun as javascript',
                review: 'coding squirrels are better than drinking squirrels',
                rating: 3,
                id: 1
                },
            ]
        }
    },
    computed: {
        averageRating(){
            let sum = this.reviews.reduce((sum,review) => {return sum + review.rating}, 0)
            if(this.reviews.length==0){
                return 0;
            }
            return sum/this.reviews.length
        },
        numberOneStarReviews(){
            return this.reviews.reduce((count,review)=> {
                return count + (review.rating===1);
            },0);
        },
           numberTwoStarReviews(){
            return this.reviews.reduce((count,review)=> {
                return count + (review.rating===2);
            },0);
        },
           numberThreeStarReviews(){
            return this.reviews.reduce((count,review)=> {
                return count + (review.rating===3);
            },0);
        },
           numberFourStarReviews(){
            return this.reviews.reduce((count,review)=> {
                return count + (review.rating===4);
            },0);
        },
            numberFiveStarReviews(){
            return this.reviews.reduce((count,review)=> {
                return count + (review.rating===5);
            },0);
        },
        

    }

}
</script>

<style>
div.main{
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

div.main div.review {
    border: 1px black solid;
    border-radius: 6px;
    padding: 1rem;
    margin: 10px;
}

div.main div.review div.rating {
    height: 2rem;
    display: inline-block;
    vertical-align: top;
    margin: 0 0.5rem;
}

div.main div.review div.rating img {
    height: 100%;
}

div.main div.review p {
    margin: 20px;
}

div.main div.review h3 {
    display: inline-block;
}

div.main div.review h4 {
    font-size: 1rem;
}

</style>