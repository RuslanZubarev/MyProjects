import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine().trim();
            int start = input.indexOf(' ');
            int end = input.lastIndexOf(' ');
            if (input.equals("0")) {
                break;
            }
            int spaceCount = 0;
            int i = 0;
            for (; i < input.length(); i++) {
                char str = input.charAt(i);

                if (Character.isWhitespace(str)) {
                    spaceCount++;
                    continue;
                }

                if ((str != ' ') && (str != '-') && (!Character.UnicodeBlock.of(str).equals(Character.UnicodeBlock.CYRILLIC))) {
                    break;
                }
            }
            if (spaceCount != 2) {
                System.out.println("Введенная строка не является ФИО");
            } else {
                String lastName = input.substring(0, start).trim();

                String firstName = input.substring(lastName.length() + 1, end).trim();

                String patronymic = input.substring(start + firstName.length() + 1).trim();

                String templay = "Фамилия: %s%nИмя: %s%nОтчество: %s%n";
                System.out.printf(templay, lastName, firstName, patronymic);
            }
        }
    }
}


//TODO:напишите ваш код тут, результат вывести в консоль.
//При невалидном ФИО вывести в консоль: Введенная строка не является ФИО



