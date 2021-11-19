package ru.skillbox;

public class Ram {
    private final String type;
    private final int size;
    private final double weight;
    private final int cost;

    public Ram(String type, int size, double weight, int cost) {
        this.type = type;
        this.size = size;
        this.weight = weight;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Тип: " + type + ". Объем: " + size + " Гб. Вес: " + weight + " грамм. Цена: " + cost + " руб.";
    }
}
