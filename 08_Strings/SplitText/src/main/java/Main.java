import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        String name1 = "";
        System.out.println(splitTextIntoWords(name1));
    }

    public static String splitTextIntoWords(String text) {
        String regex = "[^a-zA-Z'’]+"; // создаем шаблон.
        return text.replaceAll(regex, System.lineSeparator()).trim(); //применяем шаблон в первом параметре и вместо указанных в нем значений(. , ; : ' ' '\n') используем перенос строки, а так же убираем пробелы перед и после слова.
    }
}