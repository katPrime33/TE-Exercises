package com.techelevator.dao;

import com.techelevator.model.Venue;

import java.util.List;

public interface VenueDao {

    Venue getVenue(int venueId);

    Venue getVenueByCity(int cityId);

    List<Venue> getVenues();
}
