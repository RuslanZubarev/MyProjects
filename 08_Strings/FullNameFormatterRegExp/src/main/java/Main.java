import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String regex = "^([А-Я]{1}[а-яё]+(-[А-Я]{1}[а-яё]+)?)\\s([А-Я]{1}[а-яё]+)\\s([А-Я]{1}[а-яё]+)$";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()) {
                System.out.println("Фамилия: " + matcher.group(1));
                System.out.println("Имя: " + matcher.group(3));
                System.out.println("Отчество: " + matcher.group(4));
            } else {
                System.out.println("Введенная строка не является ФИО");
                break;
            }

        }
    }

}