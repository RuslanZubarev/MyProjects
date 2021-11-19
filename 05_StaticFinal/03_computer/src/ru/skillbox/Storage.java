package ru.skillbox;

public class Storage {
    private final int space;
    private final double weight;
    private final StorageType storageType;

    public Storage(int space, double weight, StorageType type) {
        this.space = space;
        this.weight = weight;
        this.storageType = type;
    }

    public double getWeight() {
        return weight;
    }

    public String toString() {
        return "Тип накопителя: " + storageType + ". Объем памяти: " + space + " Гб. Вес: " + weight + " грамм.";
    }
}
