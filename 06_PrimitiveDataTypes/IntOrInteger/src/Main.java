public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.
        for (int i = 1040; i < 1104; i++) {
            char symbol = (char) i;
            System.out.println("Номер символа: " + i + " - " + "Символ: " + symbol);
        }
        char symbol1 = (char) 1105;
        System.out.println("Номер символа: " + "1105 - Символ: " + symbol1);
        char symbol2 = (char) 203;
        System.out.println("Номер символа: " + "203 - Символ: " + symbol2);
    }
}
