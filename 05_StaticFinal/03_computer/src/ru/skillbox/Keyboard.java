package ru.skillbox;

public class Keyboard {
    private final String typeOfKeyboard;
    private final boolean withLights;
    private final double weightOfKeyboard;

    public Keyboard(String typeOfKeyboard, boolean withLights, double weightOfKeyboard) {
        this.typeOfKeyboard = typeOfKeyboard;
        this.withLights = withLights;
        this.weightOfKeyboard = weightOfKeyboard;
    }
}
