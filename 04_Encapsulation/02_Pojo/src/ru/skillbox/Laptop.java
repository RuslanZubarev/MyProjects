package ru.skillbox;

public class Laptop {
    private String nameOfModel;
    private int price;
    private double weight;
    private boolean abilityToUpgrade;

    public Laptop(String nameOfModel, int price) {
        this.nameOfModel = nameOfModel;
        this.price = price;
    }

    public String getNameOfModel() {
        return nameOfModel;
    }

    public void setNameOfModel(String nameOfModel) {
        this.nameOfModel = nameOfModel;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAbilityToUpgrade() {
        return abilityToUpgrade;
    }

    public void setAbilityToUpgrade(boolean abilityToUpgrade) {
        this.abilityToUpgrade = abilityToUpgrade;
    }
}

