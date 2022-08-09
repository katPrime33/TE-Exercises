package com.techelevator.dao;

import com.techelevator.model.City;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.List;

public class JdbcCityDao implements CityDao {

    private final JdbcTemplate jdbcTemplate;

    //In the constructor we accept the datasource which has been set elsewhere in the project (in this case, in the CLI)
    //The datasource defines the connection to the database
    public JdbcCityDao(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }


    @Override
    public City getCity(int cityId) {
       return null;
    }

    @Override
    public List<City> getCitiesByState(String stateAbbreviation) {
       return null;
    }

    @Override
    public City createCity(City city) {
       return null;
    }

    @Override
    public void updateCity(City city) {

    }

    @Override
    public void deleteCity(int cityId) {

    }

}
