package com.techelevator.hotels;

import com.techelevator.hotels.services.ConsoleService;
import com.techelevator.hotels.services.HotelService;

public class App {

    private final ConsoleService consoleService = new ConsoleService();
    private final HotelService hotelService = new HotelService();

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    private void run() {
        int menuSelection = -1;

        while (menuSelection != 0) {
            consoleService.printMainMenu();
            menuSelection = consoleService.promptForMenuSelection();
            if (menuSelection == 1) {
                consoleService.printHotels(hotelService.listHotels());
                System.out.println();
            } else if (menuSelection == 2) {
                consoleService.printReviews(hotelService.listReviews());
                System.out.println();
            } else if (menuSelection == 3) {
                String userInput = consoleService.getUserInput("Please enter Hotel ID:");
                int hotelId = Integer.parseInt(userInput);
                consoleService.printHotel(hotelService.getHotelById(hotelId));
                System.out.println();
            } else if (menuSelection == 4) {
                String userInput = consoleService.getUserInput("Please enter Hotel ID:");
                int hotelId = Integer.parseInt(userInput);
                consoleService.printReviews(hotelService.getReviewsByHotelId(hotelId));
                System.out.println();
            } else if (menuSelection == 5) {
                String userInput = consoleService.getUserInput("Please enter the star rating of the hotel:");
                int stars = Integer.parseInt(userInput);
                consoleService.printHotels(hotelService.getHotelsByStarRating(stars));
                System.out.println();
            } else if (menuSelection == 6) {
                System.out.println(hotelService.getWithCustomQuery());
                System.out.println("Not implemented - Create a custom Web API query here");
            } else if (menuSelection == 7) {
                System.out.println(hotelService.getJoke());
                System.out.println();
            } else if (menuSelection == 0) {
                continue;
            } else {
                System.out.println("Invalid Selection");
            }
            consoleService.pause();
        }
    }
}

