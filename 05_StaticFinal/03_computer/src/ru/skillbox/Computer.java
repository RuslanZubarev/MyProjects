package ru.skillbox;

public class Computer {
    private final Сpu сpu;
    private final Ram ram;
    private final Storage storage;
    private final Screen screen;
    private final Keyboard keyboard;

    private final String vendor;
    private final String name;


    public Computer(Сpu сpu, Ram ram, Storage storage, Screen screen, Keyboard keyboard, String vendor, String name) {
        this.сpu = сpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public String toString() {
        return "Производитель: " + vendor + "\n" + "Модель: " + name + "\n" + "Процессор: " + сpu + "\n" + "Оперативная память: " + ram + "\n" +
                "Накопитель: " + storage + "\n" + "Экран: " + screen + "\n" + "Клавиатура: " + keyboard;
    }
}
