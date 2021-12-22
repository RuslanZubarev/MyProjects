import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money = 100.0;
        Scanner in = new Scanner(System.in);
        System.out.println("Make a bet");

        double bet = in.nextInt();

        while (money >= bet) {
            System.out.println("playing...");
            double result = Math.random() * 4.0;
            if (result > 2.0) {
                money = money + bet;
                System.out.println("win");
            }
            if (result < 2.0) {
                money = money - bet;
                System.out.println("lose");

            } else if (money == 200) {
                System.out.println("u won 200$ lets party");
                break;
            }
            System.out.println("Balance: " + money);
            if (money < bet || money == 0) {
                System.out.println("u dont have enough money for this game");
            }
        }
    }
}

