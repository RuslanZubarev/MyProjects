package ru.skillbox;

public class Main {


    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(1, 1, 1);
        Dimensions dimensions2 = dimensions.setWidth(2);
        System.out.println(dimensions2);
        System.out.println();
        Cargo cargo = new Cargo(dimensions2, 10, "Address", true, "AA001", false);
        System.out.println(cargo);
        System.out.println();
        Cargo cargo2 = cargo.setDeliveryAddress("Address2");
        System.out.println(cargo2);
    }
}