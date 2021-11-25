package ru.skillbox;

public class Cpu {
    private final double weight;
    private final double cpuFrequency;
    private final int numberOfCores;
    private final double cost;
    private final CpuType type;


    public Cpu(double cpuFrequency, int numberOfCores, CpuType type, double weight, int cost) {
        this.cpuFrequency = cpuFrequency;
        this.numberOfCores = numberOfCores;
        this.type = type;
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
                + type + ". Вес процессора: " + weight + " грамм. Цена: " + cost + " руб.";
    }
}
