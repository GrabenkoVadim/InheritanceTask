package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Knight {
    private List<Ammunition> equipment; // список спорядження

    public Knight() {
        this.equipment = new ArrayList<>();
    }

    // додати предмет
    public void addAmmunition(Ammunition item) {
        if (item == null) {
            throw new IllegalArgumentException("Ammunition is null");
        }
        equipment.add(item);
    }

    // повернути все спорядження
    public List<Ammunition> getEquipment() {
        return equipment;
    }

    // загальна вартість
    public double getTotalPrice() {
        double sum = 0;
        for (Ammunition a : equipment) {
            sum += a.getPrice();
        }
        return sum;
    }

    // сортування за вагою
    public void sortByWeight() {
        equipment.sort(Comparator.comparingDouble(Ammunition::getWeight));
    }

    // пошук за діапазоном цін
    public List<Ammunition> findByPriceRange(double min, double max) {
        List<Ammunition> result = new ArrayList<>();
        for (Ammunition a : equipment) {
            if (a.getPrice() >= min && a.getPrice() <= max) {
                result.add(a);
            }
        }
        return result;
    }
}
