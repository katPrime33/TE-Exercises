package com.techelevator.dao;

import com.techelevator.model.Space;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.DataSource;
import java.util.List;

public class JdbcSpaceDao implements SpaceDao {

    private final JdbcTemplate jdbcTemplate;

    public JdbcSpaceDao(DataSource dataSource){
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public Space createSpace(Space newSpace) {
        String sql = "INSERT INTO space (name, is_accessible, open_from, open_to, daily_rate, max_occupancy) " +
                "VALUES (?, ?, ?, ?, ?, ?) RETURNING id;";
       // Integer spaceId = this.jdbcTemplate.queryForObject(sql, Integer.class, newSpace.getSpaceName(), newSpace.getBoolean)
        return newSpace;
    }

    @Override
    public Space getSpace(int spaceId) {
        return null;
    }

    @Override
    public List<Space> getSpacesByVenue(int VenueId) {
        return null;
    }

    @Override
    public void updateSpace(Space space) {

    }

    @Override
    public void deleteSpace(int spaceId) {

    }

    private Space mapRowToSpace(SqlRowSet rowSet){
        Space space = new Space();
        space.setSpaceId(rowSet.getInt("id"));
        space.setSpaceName(rowSet.getString("name"));
        space.setOpenFrom(rowSet.getInt("open_from"));
        space.setOpenTo(rowSet.getInt("open_to"));
        space.setAccessible(rowSet.getBoolean("is_accessible"));
        space.setDailyRate(rowSet.getBigDecimal("daily_rate"));
        space.setMaxOccupancy(rowSet.getInt("max_occupancy"));
        return space;
    }
}
