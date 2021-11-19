package ru.skillbox;

public class Screen {
    private final double sizeOfScreen;
    private final double weight;
    private final ScreenType type;
    private final int cost;

    public Screen(double sizeOfScreen, double weight, ScreenType type, int cost) {
        this.sizeOfScreen = sizeOfScreen;
        this.weight = weight;
        this.type = type;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Диагональ: " + sizeOfScreen + " дюймов. Тип матрицы: " + type + ". Вес монитора: " + weight + " грамм. Цена: " + cost + " руб.";
    }
}
