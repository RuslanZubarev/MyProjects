package ru.skillbox;

public class Screen {
    private final double sizeOfScreen;
    private final double weight;
    private final ScreenType type;

    public Screen(double sizeOfScreen, double weight, ScreenType type) {
        this.sizeOfScreen = sizeOfScreen;
        this.weight = weight;
        this.type = type;
    }

    public String toString() {
        return "Диагональ: " + sizeOfScreen + " дюймов. Тип матрицы: " + type + ". Вес монитора" + weight + " грамм.";
    }
}
