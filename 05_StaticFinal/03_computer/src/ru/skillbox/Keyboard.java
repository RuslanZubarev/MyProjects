package ru.skillbox;

public class Keyboard {
    private final String typeOfKeyboard;
    private final boolean withLights;
    private final double weight;

    public Keyboard(String typeOfKeyboard, boolean withLights, double weight) {
        this.typeOfKeyboard = typeOfKeyboard;
        this.withLights = withLights;
        this.weight = weight;
    }

    public String toString() {
        return "Тип клавиатуры: " + typeOfKeyboard + ". Наличие подсветки: " + withLights + ". Вес клавиатуры: " + weight + " грамм.";
    }
}
