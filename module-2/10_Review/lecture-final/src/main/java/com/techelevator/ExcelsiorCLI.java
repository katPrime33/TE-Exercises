package com.techelevator;

import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.view.Menu;




public class ExcelsiorCLI {


    private Menu menu = new Menu();

    public ExcelsiorCLI(DataSource datasource) {

    }

    public void run() {

        while(true) {
            String userChoice = menu.getSelectionFromMainMenu();

            if (userChoice.equals("1")) {
                //show all venues
            } else if (userChoice.equalsIgnoreCase("Q")) {
                break;
            }
        }

    }

    public static void main(String[] args) {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:postgresql://localhost:5432/excelsior_venues");
        dataSource.setUsername("postgres");
        dataSource.setPassword("postgres1");

        ExcelsiorCLI application = new ExcelsiorCLI(dataSource);
        application.run();
    }
}
