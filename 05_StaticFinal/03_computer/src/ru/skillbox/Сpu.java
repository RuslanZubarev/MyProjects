package ru.skillbox;

public class Сpu {
    private final double cpuFrequency;
    private final int numberOfCores;
    private final String cpuVendor;
    private final double cpuWeight;

    public Сpu(double cpuFrequency, int numberOfCores, String cpuVendor, double cpuWeight) {
        this.cpuFrequency = cpuFrequency;
        this.numberOfCores = numberOfCores;
        this.cpuVendor = cpuVendor;
        this.cpuWeight = cpuWeight;
    }

    public String toString() {
        return "Тактовая частота: " + cpuFrequency + " Гц. Количество ядер: " + numberOfCores + ". Производитель процессора: "
                + cpuVendor + ". Вес процессора: " + cpuWeight + " грамм.";
    }
}
