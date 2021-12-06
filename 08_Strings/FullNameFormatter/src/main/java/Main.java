import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите ФИО");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input.trim();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char str = input.charAt(i);
            if (Character.isWhitespace(str)) {
                count++;
            }

//            int start = input.indexOf(' ', 1);
//            int end = input.indexOf(' ', 5);
//            String encoding = input.substring(start, end);
//            System.out.println(encoding);
        }
        //TODO:напишите ваш код тут, результат вывести в консоль.
        //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
//        }
//        String firstName = "";
//        String lastName = "";
//        String thirdName = "";
//        String tamplate = "Фамилия: %s\n" +
//                "Имя: %s\n " +
//                "Отчество: %s";
//        System.out.printf(tamplate, firstName, lastName, thirdName);
    }
}


