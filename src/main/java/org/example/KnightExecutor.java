package org.example;

import java.util.List;

public class KnightExecutor {
    public void execute() {
        try {
            Knight knight = new Knight();

            knight.addAmmunition(new Helmet("Steel Helmet", 2.1, 120));
            knight.addAmmunition(new Armor("Plate Armor", 10.5, 450));
            knight.addAmmunition(new Sword("Longsword", 3.2, 200));
            knight.addAmmunition(new Boots("Leather Boots", 1.3, 80));

            System.out.println("Knight equipment:");
            for (Ammunition a : knight.getEquipment()) {
                System.out.println(" - " + a);
            }

            double total = knight.getTotalPrice();
            System.out.println("\nTotal price: " + total);

            knight.sortByWeight();
            System.out.println("\nEquipment sorted by weight:");
            for (Ammunition a : knight.getEquipment()) {
                System.out.println(" - " + a);
            }

            double from = 100;
            double to = 250;
            System.out.println("\nItems in price range " + from + " - " + to + ":");
            List<Ammunition> found = knight.findByPriceRange(from, to);
            if (found.isEmpty()) {
                System.out.println("No items found.");
            } else {
                for (Ammunition a : found) {
                    System.out.println(" - " + a);
                }
            }

        } catch (Exception e) {
            System.out.println("Error during knight equipment processing: " + e.getMessage());
        }
    }
}
