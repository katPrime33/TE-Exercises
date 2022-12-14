package com.techelevator.hotels.services;

import com.techelevator.hotels.model.City;
import com.techelevator.hotels.model.Hotel;
import com.techelevator.hotels.model.Joke;
import com.techelevator.hotels.model.Review;
import org.springframework.web.client.RestTemplate;

public class HotelService {

    private static final String API_BASE_URL = "http://localhost:3000/";
    private static final String API_JOKE_URL = "http://v2.jokeapi.dev/joke/Any?safe-mode";
    private final RestTemplate restTemplate = new RestTemplate();

    public Hotel[] listHotels() {
        // String response = restTemplate.getForObject(endpointUrl, String.class)
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels", Hotel[].class);
        return hotels;
    }

    public Review[] listReviews() {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "reviews", Review[].class);
        return reviews;
    }

    public Hotel getHotelById(int id) {
        Hotel hotel = restTemplate.getForObject(API_BASE_URL + "hotels/" + id, Hotel.class);
        return hotel;
    }

    public Review[] getReviewsByHotelId(int hotelID) {
        Review[] reviews = restTemplate.getForObject(API_BASE_URL + "hotels/" + hotelID + "/reviews", Review[].class);
        return reviews;
    }

    public Hotel[] getHotelsByStarRating(int stars) {
        Hotel[] hotels = restTemplate.getForObject(API_BASE_URL + "hotels/?stars=" + stars, Hotel[].class);
        return hotels;
    }

    public City getWithCustomQuery(){
        City hotelCity = restTemplate.getForObject("https://api.teleport.org/api/cities/geonameid%3A5128581/", City.class);
        return hotelCity;
    }

    public Joke getJoke(){
        Joke joke = restTemplate.getForObject(API_JOKE_URL, Joke.class);

        return joke;
    }

}
