public class Main {
    public static void main(String[] args) {
        Arithmetic numbers = new Arithmetic(8, 5);
        System.out.println("Сумма " + numbers.plus());
        System.out.println("Умножение " + numbers.multiply());
        System.out.println("Макс " + numbers.min());
        System.out.println("Мин " + numbers.max());
    }
}
