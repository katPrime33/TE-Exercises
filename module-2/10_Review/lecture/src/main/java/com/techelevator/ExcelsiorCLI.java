package com.techelevator;

import javax.sql.DataSource;

import com.techelevator.dao.ReservationDao;
import com.techelevator.dao.SpaceDao;
import com.techelevator.dao.VenueDao;
import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.dao.*;
import com.techelevator.model.*;
import com.techelevator.view.Menu;

import java.util.List;


public class ExcelsiorCLI {

    private final ReservationDao reservationDao;
    private final VenueDao venueDao;
    private final SpaceDao spaceDao;
    private Menu menu;

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/excelsior_venues");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        ExcelsiorCLI application = new ExcelsiorCLI(dataSource);
        application.run();
    }

    public ExcelsiorCLI(DataSource datasource) {
        reservationDao = new JdbcReservationDao(datasource);
        venueDao = new JdbcVenueDao(datasource);
        spaceDao = new JdbcSpaceDao(datasource);
        menu = new Menu();
    }

    public void run() {

        while (true) {
            String userChoice = menu.getSelectionFromMainMenu();

            if (userChoice.equals("1")) {
                //show all venues
                List<Venue> venues = venueDao.getAllVenues();
                listVenues(venues);
            } else if (userChoice.equalsIgnoreCase("Q")) {
                break;
            }
        }

    }


    private void listVenues(List<Venue> venues) {
        System.out.println();
        if (venues.size() > 0) {
            for (Venue venue : venues) {
                System.out.println(venue);
            }
        }
    }
}


