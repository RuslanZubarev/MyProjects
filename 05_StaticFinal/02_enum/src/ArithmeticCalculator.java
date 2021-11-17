public class ArithmeticCalculator {
    private final int numberA;
    private final int numberB;

    public ArithmeticCalculator(int numberA, int numberB) {
        this.numberA = numberA;
        this.numberB = numberB;
    }

    public int calculate(Operation operation) {
        if (operation == Operation.ADD) {
            return numberA + numberB;
        }
        if (operation == Operation.SUBTRACT) {
            return numberA - numberB;
        }
        if (operation == Operation.MULTIPLY) {
            return numberA * numberB;
        }
        return 0;
    }
}
