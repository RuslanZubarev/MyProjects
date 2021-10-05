package ru.skillbox;

public class Country {
    private String nameOfCountry;
    private int population;
    private double square;
    private int nameOfCapital;
    private boolean exitToTheBeach;

    public Country(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public void setNameOfCountry(String nameOfCountry) {
        this.nameOfCountry = nameOfCountry;
    }

    public String getNameOfCountry() {
        return nameOfCountry;
    }


    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public int getNameOfCapital() {
        return nameOfCapital;
    }

    public void setNameOfCapital(int nameOfCapital) {
        this.nameOfCapital = nameOfCapital;
    }

    public boolean isExitToTheBeach() {
        return exitToTheBeach;
    }

    public void setExitToTheBeach(boolean exitToTheBeach) {
        this.exitToTheBeach = exitToTheBeach;
    }
}

