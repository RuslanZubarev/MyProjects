package ru.skillbox;

public class Main {


    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(1,1,1);
        dimensions.setWidth(1);
        dimensions.setHight(1);
        dimensions.setLenght(1);
        Cargo cargo = new Cargo(dimensions,20, "address", true, "aaa001", false);
        //some code
        dimensions.setLenght(2);
        dimensions.setHight(2);
        dimensions.setWidth(2);
        System.out.println(cargo);

    }
}
