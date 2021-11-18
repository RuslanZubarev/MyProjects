package ru.skillbox;

public class Storage {
    private final int space;
    private final double weightOfSrtorage;
    private StorageType type;

    public Storage(int space, double weightOfSrtorage, StorageType type) {
        this.space = space;
        this.weightOfSrtorage = weightOfSrtorage;
        this.type = type;
    }
}
