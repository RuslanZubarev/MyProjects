import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(formatPhoneNumber(input));
//    while (true) {
//      String input = scanner.nextLine();
//      String regex = "[^0-9]";
//      if (input.equals("0")) {
//        break;
//      }

//    }
    }

    public static String formatPhoneNumber(String input) {
        String regex = "[^0-9]"; //создаем регулярку, которая будет отсеивать все НЕ цифры
        String secondRegex = "[0-9]{10,11}"; // регулярка проверяет количество цифр, оно должно быть 10 или 11
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        Pattern secondPattern = Pattern.compile(secondRegex);
        Matcher secondMatcher = pattern.matcher(input);
        if (!matcher.matches()) {
            System.out.println("Неверный формат номера");
        }
        return input.replaceAll(regex, ""); // удаляем НЕ символы найденые регуляркой
    }

}
