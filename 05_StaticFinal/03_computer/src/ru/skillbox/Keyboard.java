package ru.skillbox;

public class Keyboard {
    private final String typeOfKeyboard;
    private final boolean withLights;
    private final double weight;
    private final int cost;

    public Keyboard(String typeOfKeyboard, boolean withLights, double weight, int cost) {
        this.typeOfKeyboard = typeOfKeyboard;
        this.withLights = withLights;
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
        return "Тип клавиатуры: " + typeOfKeyboard + ". Наличие подсветки: " + withLights + ". Вес клавиатуры: " + weight + " грамм. Цена: " + cost + " руб.";
    }
}
