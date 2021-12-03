public class Main {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";

        System.out.println(getIncome(text));
    }

    public static String getIncome(String string) {
        StringBuilder result = new StringBuilder();
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            char str = string.charAt(i);
            if (Character.isDigit(str)) {
                result.append(str);
            } else if (!result.toString().isEmpty()) {
                count += Integer.parseInt(result.toString());
                result = new StringBuilder();
            }
            if (count < 0) {
                return "";
            }
        }
        return Integer.toString(count);
    }
}


//TODO: напишите ваш код, результат вывести в консоль

