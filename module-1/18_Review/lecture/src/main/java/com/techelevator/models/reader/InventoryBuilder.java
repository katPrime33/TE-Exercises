package com.techelevator.models.reader;

import com.techelevator.models.inventory.Clothing;
import com.techelevator.models.inventory.Food;
import com.techelevator.models.inventory.Homegood;
import com.techelevator.models.inventory.Item;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class InventoryBuilder {

    public Map<String, Item> getInventory() {
        Food cake = new Food("001");
        cake.setName("Cake");
        cake.setDescription("A chocolate cake");
        cake.setPrice(new BigDecimal("10"));

        Clothing flipflops = new Clothing("002");
        flipflops.setName("Flip Flop Sandals");
        flipflops.setDescription("Protect your feet, but only the bottoms");
        flipflops.setPrice(new BigDecimal("7"));

        Homegood catClock = new Homegood("cat01");
        catClock.setName("Cat O'Clock");
        catClock.setDescription("Covered in fur");
        catClock.setPrice(new BigDecimal("100"));

        Homegood frogMug = new Homegood("f22");
        frogMug.setName("Frog Mug");
        frogMug.setDescription("Greenish and not a toad");
        frogMug.setPrice(new BigDecimal("5.25"));


        Map<String, Item> inventory = new HashMap<String, Item>();

        inventory.put(cake.getSku(), cake);
        inventory.put(flipflops.getSku(), flipflops);
        inventory.put(catClock.getSku(), catClock);
        inventory.put(frogMug.getSku(), frogMug);

        return inventory;
    }
}
