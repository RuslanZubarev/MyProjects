public class Main {

    public static void main(String[] args) {

        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String digits = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isDigit(i)) {
                digits += i;
            }
        }
    }
}


//TODO: напишите ваш код, результат вывести в консоль

