package ru.skillbox;

public class Computer {
    private final String processor;
    private final String ram;
    private final String storage;
    private final String screen;
    private final String keyboard;

    private final String vendor;
    private final String name;


    public Computer(String processor, String ram, String storage, String screen, String keyboard, String vendor, String name) {
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.screen = screen;
        this.keyboard = keyboard;
        this.vendor = vendor;
        this.name = name;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getStorage() {
        return storage;
    }

    public String getScreen() {
        return screen;
    }

    public String getKeyboard() {
        return keyboard;
    }


}
