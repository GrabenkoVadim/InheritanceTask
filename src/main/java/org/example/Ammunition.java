package org.example;

public abstract class Ammunition {
    protected String name;   // назва предмета
    protected double weight; // вага в кг
    protected double price;  // ціна в у.о.

    public Ammunition(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    protected Ammunition() {
    }

    public double getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (w=" + weight + ", p=" + price + ")";
    }
}
