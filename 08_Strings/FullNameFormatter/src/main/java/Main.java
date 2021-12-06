import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char str = input.charAt(i);
            if (Character.isWhitespace(str)) {
                count++;
            }
        }
        //TODO:напишите ваш код тут, результат вывести в консоль.
        //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
//        }
    }


}
//            System.out.printf("Фамилия: %s%n" +
//                    "Имя: %s%n" +
//                    "Отчество: %s", input);

//    public static String getName(String name) {
//        return "";
//    }