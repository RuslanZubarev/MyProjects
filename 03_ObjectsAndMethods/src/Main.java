public class Main {

    public static void main(String[] args) {
        Basket basket = new Basket("Товары", 45000);
      basket.add("Beer", 50, 2, 0.75);

        System.out.println(Basket.getCount());
        System.out.println(Basket.getAllGoods());
    }
}
