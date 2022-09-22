import axios from 'axios';

const http = axios.create({
    baseURL: "http://localhost:3000"
});

export default {
    
    listTopics(){
        return http.get('/topics');
    },

    getTopics(id){
        return http.get(`/topics/${id}`)
    }

}