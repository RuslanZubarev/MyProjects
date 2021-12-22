import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Ситстема расчета стоимости топлива.");
        System.out.println("Выберите тип топлива: ");
        int fuelType = Integer.parseInt(
                (new BufferedReader(new InputStreamReader(System.in))).readLine());
        System.out.println("Введите количество литров: ");
        int amount = Integer.parseInt(
                (new BufferedReader(new InputStreamReader(System.in))).readLine());


        double fuel92price = 44.7;
        double fuel95price = 47.95;

        double fuelPrice = 0;
        if (fuelType == 92) {
            fuelPrice = fuel92price;
        } else if (fuelType == 95) {
            fuelPrice = fuel95price;
        } else {
            System.out.println("Указан неверный тип топлива. " +
                    "\nВыберите, пожалуйста, доступный тип топлива.");
        }

        if (amount <= 2) {
            System.out.println("Минимальное количество литров топлива для заправки - 3 Литра."
                    + "\nПожалуйста, увеличьте количество литров.");
            amount = 0;

        }

        System.out.println("Цена выбранного топлива: " + fuelPrice + "руб./Л");

        double totalPrice = fuelPrice * amount;
        System.out.println("Общая стоимость заправки: " + totalPrice + "Руб.");
    }
}
