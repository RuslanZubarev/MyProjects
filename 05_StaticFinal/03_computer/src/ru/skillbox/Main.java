package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("One language", true, 0.3);
        Screen screen = new Screen(15.6, 1.5, ScreenType.IPS);
        Storage storage = new Storage(512, 0.2, StorageType.SSD);
        Ram ram = new Ram("DDR4", 16, 0.1);
        Cpu cpu = new Cpu(2.6, 6, "AMD", 0.1);

        Computer myPc = new Computer(cpu, ram, storage, screen, keyboard, "HP", "Pavilion");
        System.out.println(myPc);
    }


}




