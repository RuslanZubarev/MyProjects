public class Basket {
    private double totalWeight = 0.0;
    private String items = "";
    private int totalPrice = 0; // цена всех товаров в одной корзине.
    private int limit;
    private int countProduct = 0; // количество товаров в одной корзине.
    private static int count = 0; // общее количество корзин.
    private static int allGoods = 0; // общеe количествo всех товаров во всех корзинах.
    private static int allPrice = 0; // общая стоимость всех товаров во всех корзинaх.

    public Basket() {
        increaseCount(1);
        items = "Список товаров:";
        this.limit = 10000;
        this.totalWeight = 0.0;
    }

    public Basket(int limit) {
        this();
        this.limit = limit;
    }

    public Basket(String items, int limit) {
        this();
        this.items = this.items + items;
        this.limit = limit;
    }

    public static int getCount() {
        return count;
    }

    public static int getAllGoods() {
        return allGoods;
    }

    public static int getAllPrice() {
        return allPrice;
    }


    public static int getAverageBasketPrice() {
        return allPrice / count;
    }

    public static int getAverageCountPrice() {
        return allPrice / allGoods;
    }


    public static void increaseCount(int count) {
        Basket.count = Basket.count + count;
    }

    public static void increaseAllGoods(int allGoods) {
        Basket.allGoods = Basket.allGoods + allGoods;
    }

    public static void increaseAllPrice(int allPrice) {
        Basket.allPrice = Basket.allPrice + allPrice;
    }

    public void add(String name, int price) {
        add(name, price, 1, 0);
    }

    public void add(String name, int price, int countProduct) {
        add(name, price, countProduct, 0);
    }

    public void add(String name, int price, int countProduct, double weight) {
        boolean error = false;
        if (contains(name)) {
            error = true;
        }

        if (totalPrice + countProduct * price >= limit) {
            error = true;
        }

        if (error) {
            System.out.println("Превышен лимит :(");
            return;
        }
        items = items + "\n" + name + " - " + countProduct + " шт. - "
                + price + " - " + weight + " Грамм ";
        totalPrice = totalPrice + price * countProduct;
        totalWeight = totalWeight + weight;
        this.countProduct = this.countProduct + countProduct;
        increaseAllPrice(totalPrice);
        increaseAllGoods(countProduct);
    }

    public void clear() {
        items = "";
        increaseAllPrice(-totalPrice);
        increaseAllGoods(-countProduct);
        totalPrice = 0;
        totalWeight = 0;
        countProduct = 0;
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
