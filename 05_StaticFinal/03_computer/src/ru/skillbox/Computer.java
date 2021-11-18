package ru.skillbox;

public class Computer {
    private final Cpu сpu;
    private final Ram ram;
    private final Storage storage;
    private final Screen screen;
    private final Keyboard keyboard;

    private final String vendor;
    private final String name;

    public Computer(Cpu сpu, Ram ram, Storage storage, Screen screen, Keyboard keyboard, String vendor, String name) {
        this.сpu = сpu;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public Cpu getСpu() {
        return сpu;
    }

    public Ram getRam() {
        return ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public Computer setCpu(Cpu cpu) {
        return new Computer(cpu, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setRam(Ram ram) {
        return new Computer(сpu, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setStorage(Storage storage) {
        return new Computer(сpu, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setScreen(Screen screen) {
        return new Computer(сpu, ram, storage, screen, keyboard, vendor, name);
    }

    public Computer setKeyboard(Keyboard keyboard) {
        return new Computer(сpu, ram, storage, screen, keyboard, vendor, name);
    }

    public String toString() {
        return "Производитель: " + vendor + "\n" + "Модель: " + name + "\n" + "Процессор: " + сpu + "\n" + "Оперативная память: " + ram + "\n" +
                "Накопитель: " + storage + "\n" + "Экран: " + screen + "\n" + "Клавиатура: " + keyboard;
    }
}