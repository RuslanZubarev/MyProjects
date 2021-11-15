package ru.skillbox;

public class Main {


    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(1, 1, 1);
        Dimensions dimensions2 = dimensions.setWidth(2).setHeight(2).setLenght(2);
        System.out.println("До изменения: \n" + dimensions);
        System.out.println();
        System.out.println("После изменения: \n" + dimensions2);
        System.out.println();
        Cargo cargo = new Cargo(dimensions2, 10, "Address", true, "AA001", false);
        Cargo cargo1 = cargo.setWeight(30).setDeliveryAddress("Another address");
        System.out.println("Информация о грузе №1: \n" + cargo);
        System.out.println();
        System.out.println("Информация о грузе №2: \n" + cargo1);

    }
}