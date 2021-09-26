public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.append("Руководство пользователя", "Бери и пользуйся.", 3);
        printer.print();
        System.out.println();
        printer.append("Java для чайников", "учим Java", 4);
        printer.print();
        System.out.println();
        printer.append("Курсовая работа", "текст Курсовой работы", 5);
        printer.print();
        System.out.println();
    }
}
