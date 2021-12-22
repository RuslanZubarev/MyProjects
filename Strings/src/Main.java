import java.util.StringJoiner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String number = "А677МР197";
        String lettersList = "[АВЕКМНОРСТУХ]";
        String regex = lettersList + "[0-9]{3}" + lettersList + "{2}[0-9]{2,3}";
        System.out.println(number.matches(regex));


//        String text = "Alex, hello! \nThis is my gitlab - https://gitlab.com/, and also link on my personnel site - https://skillbox.ru/ " +
//                "\nIf u feel some difficulties and question, write me, i am always online";
//        String regex = "https:\\/\\/[^,\\s]+";
//
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(text);
//        while (matcher.find()) {
//            int start = matcher.start();
//            int end = matcher.end();
//            System.out.println(text.substring(start, end));
//        }

//        String text = "I  know     something          about    it";
//        String[] words = text.split("\\s+");
//        System.out.println(words[3]);
//        for (int i = 0; i < words.length; i++) {
//            System.out.println(words[i]);
//        }


//        String phone1 = "+7 927 778-59-77 ";
//        String phone2 = "7 (927) 778-59-77";
//        String phone3 = "7927-778-59-77";
//        String phone4 = "7(927)7785977";
//
//        System.out.println(formatPhoneNumber(phone1));
//        System.out.println(formatPhoneNumber(phone2));
//        System.out.println(formatPhoneNumber(phone3));
//        System.out.println(formatPhoneNumber(phone4));
    }

//    public static String formatPhoneNumber(String phoneNumber) {
//        String regex = "[^0-9]";
//        return phoneNumber.replaceAll(regex, "");
//    }
}

