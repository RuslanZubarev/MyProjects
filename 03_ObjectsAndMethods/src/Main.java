public class Main {

    public static void main(String[] args) {
        Basket basket1 = new Basket("Товары", 1000);
        basket1.add("Beer", 50, 2);
        Basket basket2 = new Basket("Товары2", 2000);
        basket2.add("Juice", 30, 1);
        basket2.add("water", 20, 2);

        System.out.println("Количество корзин: " + Basket.getCount());
        System.out.println("Общеe количествo всех товаров во всех корзинах: " + Basket.getAllGoods());
        System.out.println("Oбщая стоимость всех товаров во всех корзинaх: " + Basket.getAllPrice());
    }
}
