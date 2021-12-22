import net.sf.saxon.expr.Component;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(formatPhoneNumber(input));
    }

    public static String formatPhoneNumber(String input) {
        String clearRegex = "[^0-9]"; //создаем регулярку, которая будет отсеивать все НЕ цифры
        String secondRegex = "[7,8]?9[0-9]{9}"; // регулярка проверяет количество цифр, оно должно быть 10 или 11
        Pattern pattern = Pattern.compile(clearRegex);
        Matcher matcher = pattern.matcher(input);

        String cleanNumber = input.replaceAll(clearRegex, "");
        Pattern secondPattern = Pattern.compile(secondRegex);
        Matcher secondMatcher = pattern.matcher(cleanNumber);

        if (cleanNumber.matches(secondRegex)) {
            System.out.println("7".concat(cleanNumber.length() == 10 ? cleanNumber : cleanNumber.substring(1)));
        } else {
            System.out.println("Неверный формат номера");
        }

        return "";
    }
}
