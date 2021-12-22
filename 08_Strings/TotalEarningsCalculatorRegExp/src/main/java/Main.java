import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(calculateSalarySum(name));

    }

    public static int calculateSalarySum(String text) {
        Pattern pattern = Pattern.compile("[0-9]+");
        Matcher matcher = pattern.matcher(text);
        int sum = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            int result = Integer.parseInt(text.substring(start, end));
            sum += result;
        }
        return sum;
    }

}