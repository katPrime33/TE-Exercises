package com.techelevator;

import java.util.HashMap;
import java.util.Map;

public class Inventory {

    public Map<String, Item> getInventory() {
        Food cake = new Food("001");
        cake.setName("Cake");
        cake.setDescription("A chocolate cake");
        cake.setPerishable(true);
        cake.setPrice(10);
        cake.setTaxable(false);

        Clothing flipflops = new Clothing("002");
        flipflops.setName("Flip Flop Sandals");
        flipflops.setDescription("Protect your feet, but only the bottoms");
        flipflops.setPerishable(false);
        flipflops.setPrice(7);
        flipflops.setTaxable(false);

        Pet cat = new Pet("cat01");
        cat.setName("Cat");
        cat.setDescription("Covered in fur");
        cat.setPerishable(true);
        cat.setPrice(100);
        cat.setTaxable(true);

        Pet frog = new Pet("f22");
        frog.setName("Frog");
        frog.setDescription("Greenish and not a toad");
        frog.setPerishable(true);
        frog.setPrice(5.25);
        frog.setTaxable(true);


        Map<String, Item> inventory = new HashMap<String, Item>();

        inventory.put(cake.getSku(), cake);
        inventory.put(flipflops.getSku(), flipflops);
        inventory.put(cat.getSku(), cat);
        inventory.put(frog.getSku(), frog);

        return inventory;
    }
}
