public class Main {

    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(5, 2);
        calculator.calculate(Operation.ADD);
        System.out.println(Operation.ADD);


    }

}

