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

        String clearNumber = input.replaceAll(clearRegex, "");
        Pattern secondPattern = Pattern.compile(secondRegex);
        Matcher secondMatcher = pattern.matcher(clearNumber);

        if (!input.equals(clearNumber)) {
            return clearNumber;
        }
        if (input.startsWith("8")) {
          return input.replace('8', '7');
        }
        if (input.startsWith("9")) {
            return "7".concat(input);
        }

        return "";
    }
}
