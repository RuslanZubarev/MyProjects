public class Basket {
    private double totalWeight = 0;
    private static String items = "";
    private int totalPrice = 0;
    private int limit;

    private static int count = 0;
    public static int allGoods = 0; // общеe количествo всех товаров во всех корзинах


    public Basket() {
        increaseCount(1);
        increaseAllGoods(1);
        items = "Список товаров:";
        this.limit = 1000000;
        this.totalWeight = 0.0;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int totalPrice) {
        this();
        this.items = this.items + items;
        this.totalPrice = totalPrice;
    }

    public static int getCount() {
        return count;
    }

    public static int getAllGoods(){
        return allGoods;
    }

    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }
    public static void increaseAllGoods(int allGoods){
        Basket.allGoods = Basket.allGoods + allGoods;
    }

    public void add(String name, int price) {
        add(name, price, 1);
    }

    public void add(String name, int price, int count) {
        add(name, price, 1, 1);
    }

    public void add(String name, int price, int count, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + count * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Error occured :(");
            return;
        }

        items = items + "\n" + name + " - " + count + " шт. - "
                + price + " - " + weight + " Грамм ";
        totalPrice = totalPrice + count * price;
        totalWeight = totalWeight + weight;
        allGoods = allGoods * count;

    }

    public void clear() {
        items = "";
        totalPrice = 0;
        totalWeight = 0;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public double getTotalWeight() {
        return totalWeight;
    }

    public boolean contains(String name) {
        return items.contains(name);
    }

    public void print(String title) {
        System.out.println(title);
        if (items.isEmpty()) {
            System.out.println("Корзина пуста");
            System.out.println("Вес корзины - 0");
        } else {
            System.out.println(items);
            System.out.println(" Вес корзины " + totalWeight + " Грамм ");
        }
    }
}
