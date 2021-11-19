package ru.skillbox;

public class Computer {
    private Cpu сpu;
    private Ram ram;
    private Storage storage;
    private Screen screen;
    private Keyboard keyboard;

    private final String vendor;
    private final String name;
    private final double costOfSet = 2000;

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

    public void setСpu(Cpu сpu) {
        this.сpu = сpu;
    }

    public Ram getRam() {
        return ram;
    }

    public void setRam(Ram ram) {
        this.ram = ram;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return сpu.getWeight() + ram.getWeight() + storage.getWeight() + screen.getWeight() + keyboard.getWeight();
    }

    public double getCostOfSet() {
        return costOfSet + сpu.getCost() + ram.getCost() + storage.getCost() + screen.getCost() + keyboard.getCost();
    }

    public String toString() {
        return "Производитель: " + vendor + "\n" + "Модель: " + name + "\n" + "Процессор: " + сpu + "\n" + "Оперативная память: " + ram + "\n" +
                "Накопитель: " + storage + "\n" + "Экран: " + screen + "\n" + "Клавиатура: " + keyboard;
    }
}