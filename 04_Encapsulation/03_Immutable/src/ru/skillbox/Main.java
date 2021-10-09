package ru.skillbox;

public class Main {

    public static void main(String[] args) {
        Product product = new Product("Milk", 152);
        Product product2 = new Product("Honey", 360);
        Order order = new Order();
        order.addProduct(product);
        order.addProduct(product2);
        System.out.println(product);
        System.out.println(product2);

    }
}
