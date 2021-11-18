package ru.skillbox;

public class Storage {
    private final int space;
    private final double weightOfSrtorage;
    private final StorageType storageType;

    public Storage(int space, double weightOfSrtorage, StorageType type) {
        this.space = space;
        this.weightOfSrtorage = weightOfSrtorage;
        this.storageType = type;
    }
    public String toString() {
        return "Тип накопителя: " + storageType + ". Объем памяти: " + space + " Гб. Вес: " + weightOfSrtorage + " грамм.";
    }
}
