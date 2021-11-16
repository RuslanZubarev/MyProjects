public class ArithmeticCalculator {
    public int numberA = 5;
    public int numberB = 4;


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
