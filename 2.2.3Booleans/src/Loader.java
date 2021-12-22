
public class Loader {
    public static void main(String[] args) {
        int milkAmount = 1000; // ml
        int powderAmount = 500; // g
        int eggsCount = 5; // items
        int sugarAmount = 500; // g
        int oilAmount = 500; // ml
        int appleCount = 2;

        boolean pancakes = powderAmount >= 400 && sugarAmount >= 10 && milkAmount >= 1000 && oilAmount >= 30;
        boolean omelette = milkAmount >= 300 && powderAmount >= 5 && eggsCount >= 5;
        boolean applePie = appleCount >= 3 && milkAmount >= 100 && powderAmount >= 300 && eggsCount >= 4;

        //powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        System.out.println(pancakes ? "You can cook the Pancakes" : "Not enough ingredients for pancakes");
        //milk - 300 ml, powder - 5 g, eggs - 5
        System.out.println(omelette ? "Omelette" : "Not enough ingredients for Omelette");
        //apples - 3, milk - 100 ml, powder - 300 g, eggs - 4
        System.out.println(applePie ? "Ypu can cool apple pie" : "not enough ingredients for apple pie");
    }
}

