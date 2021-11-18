package ru.skillbox;

public class Screen {
    private final double sizeOfScreen;
    private final double weightOfScreen;
    private final ScreenType type;

    public Screen(double sizeOfScreen, double weightOfScreen, ScreenType type) {
        this.sizeOfScreen = sizeOfScreen;
        this.weightOfScreen = weightOfScreen;
        this.type = type;
    }
}
