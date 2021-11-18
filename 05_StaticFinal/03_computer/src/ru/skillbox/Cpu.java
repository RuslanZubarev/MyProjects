package ru.skillbox;

public class Cpu {
    private final double weight;
    private final double cpuFrequency;
    private final int numberOfCores;
    private final String cpuVendor;

    public Cpu(double cpuFrequency, int numberOfCores, String cpuVendor, double weight) {
        this.cpuFrequency = cpuFrequency;
        this.numberOfCores = numberOfCores;
        this.cpuVendor = cpuVendor;
        this.weight = weight;
    }

    public String toString() {
        return "Тактовая частота: " + cpuFrequency + " Гц. Количество ядер: " + numberOfCores + ". Производитель процессора: "
                + cpuVendor + ". Вес процессора: " + weight + " грамм.";
    }
}
