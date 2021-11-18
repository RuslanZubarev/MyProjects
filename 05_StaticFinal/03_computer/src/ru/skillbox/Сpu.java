package ru.skillbox;

public class Сpu {
    public final double cpuFrequency;
    public final int numberOfCores;
    public final String cpuVendor;
    public final double cpuWeight;

    public Сpu(double cpuFrequency, int numberOfCores, String cpuVendor, double cpuWeight) {
        this.cpuFrequency = cpuFrequency;
        this.numberOfCores = numberOfCores;
        this.cpuVendor = cpuVendor;
        this.cpuWeight = cpuWeight;
    }

}
