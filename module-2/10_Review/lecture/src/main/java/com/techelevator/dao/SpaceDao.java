package com.techelevator.dao;

import com.techelevator.model.Space;

import java.util.List;

public interface SpaceDao {

    Space createSpace(Space space);

    Space getSpace(int spaceId);

    List<Space> getSpacesByVenue(int VenueId);

    void updateSpace(Space space);

    void deleteSpace(int spaceId);
}
