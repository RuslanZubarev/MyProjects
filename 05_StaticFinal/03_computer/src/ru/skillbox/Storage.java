package ru.skillbox;

public class Storage {
    private final int space;
    private final double weight;
    private final StorageType storageType;
    private final int cost;

    public Storage(int space, double weight, StorageType type, int cost) {
        this.space = space;
        this.weight = weight;
        this.storageType = type;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Тип накопителя: " + storageType + ". Объем памяти: " + space + " Гб. Вес: " + weight + " грамм. Цена: " + cost + " руб.";
    }
}
