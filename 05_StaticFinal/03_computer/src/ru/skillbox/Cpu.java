package ru.skillbox;

public class Cpu {
    private final double weight;
    private final double cpuFrequency;
    private final int numberOfCores;
    private final String cpuVendor;
    private final double cost;

    public Cpu(double cpuFrequency, int numberOfCores, String cpuVendor, double weight, int cost) {
        this.cpuFrequency = cpuFrequency;
        this.numberOfCores = numberOfCores;
        this.cpuVendor = cpuVendor;
        this.weight = weight;
        this.cost = cost;
    }

    public double getWeight() {
        return weight;
    }

    public double getCost() {
        return cost;
    }

    public String toString() {
        return "Тактовая частота: " + cpuFrequency + " Гц. Количество ядер: " + numberOfCores + ". Производитель процессора: "
                + cpuVendor + ". Вес процессора: " + weight + " грамм. Цена: " + cost + " руб.";
    }
}
