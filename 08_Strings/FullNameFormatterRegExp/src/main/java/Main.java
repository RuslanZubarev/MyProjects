import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String regex = "^([А-Я][а-яё]+(-[А-Я][а-яё]+)?)\\s([А-Я][а-яё]+)\\s([А-Я][а-яё]+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        if (matcher.find()) {
            System.out.println("Фамилия: " + matcher.group(1) + "\r\n"
                    + "Имя: " + matcher.group(3) + "\r\n" +
                    "Отчество: " + matcher.group(4));

        } else {
            System.out.println("Введенная строка не является ФИО");
        }


    }

}