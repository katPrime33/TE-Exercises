package com.techelevator.dao;

import com.techelevator.model.Venue;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcVenueDao implements VenueDao{

    private final JdbcTemplate jdbcTemplate;

    public JdbcVenueDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Venue getVenue(int venueId) {
        Venue venue = null;
        String sql = "SELECT id, name, description FROM venue;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, venueId);
        if(results.next()){
            venue = mapRowToVenue(results);
        }
        return venue;
    }

    @Override
    public Venue getVenueByCity(int cityId) {
        Venue venue = null;
        String sql = "SELECT id, name, city_id FROM venue WHERE city_id = ?;";
        SqlRowSet results = jdbcTemplate.queryForRowSet(sql, cityId);
        if(results.next()){
            venue = mapRowToVenue(results);
        }
        return venue;
    }

    @Override
    public List<Venue> getAllVenues() {
        List<Venue> venues = new ArrayList<>();
        SqlRowSet results = jdbcTemplate.queryForRowSet("SELECT id, name, description FROM venue;");
        while(results.next()){
            venues.add(mapRowToVenue(results));
        }
        return venues;
    }

    @Override
    public void updateVenue(Venue updatedVenue) {
        String sql = "UPDATE venue " +
                "SET name = ?, description = ? " + "WHERE venue_id = ?;";
        jdbcTemplate.update(sql, updatedVenue.getVenueName(), updatedVenue.getDescription(), updatedVenue.getVenueId());
    }

    @Override
    public void deleteVenue(int venueId) {
        String sql = "DELETE FROM category_venue WHERE venue_id = ?;";
        jdbcTemplate.update(sql, venueId);
        sql = "DELETE FROM venue WHERE id = ?;";
        jdbcTemplate.update(sql, venueId);
    }

    private Venue mapRowToVenue(SqlRowSet rowSet){
        Venue venue = new Venue();
        venue.setVenueId(rowSet.getInt("id"));
        venue.setVenueName(rowSet.getString("name"));
        venue.setDescription(rowSet.getString("description"));
        return venue;
    }
}
