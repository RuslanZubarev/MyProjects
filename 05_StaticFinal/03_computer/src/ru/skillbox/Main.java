package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Keyboard keyboard = new Keyboard("One language", true, 0.5, 800);
        Screen screen = new Screen(15.6, 1.5, ScreenType.IPS, 6000);
        Storage storage = new Storage(512, 0.3, StorageType.SSD, 4500);
        Ram ram = new Ram(RamType.DDR4SODIMM, RamSize.SEXTEEN_GB, 0.1, 6300);
        Cpu cpu = new Cpu(2.6, 6, CpuType.AMD, 0.1, 11200);

        Computer myPc = new Computer(cpu, ram, storage, screen, keyboard, "HP", "Pavilion");
        System.out.println(myPc);
        System.out.println();
        System.out.println("Общий вес комплектующих комплютера: " + myPc.getWeight());
        System.out.println("Стоимость компьютера на выбранных комплектующих с учетом сборки: " + myPc.getCostOfSet());
    }


}




