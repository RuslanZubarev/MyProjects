package ru.skillbox;

public class Ram {
    private final String type;
    private final int size;
    private final double weight;

    public Ram(String type, int size, double weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }
    public String toString() {
        return "Тип: " + type + ". Объем: " + size + " Гб. Вес: " + weight + " грамм.";
    }
}
