public class ArithmeticCalculator {
    int a = 5;
    int b = 4;


    public final Operation type;


    public ArithmeticCalculator(int a, int b, Operation type) {
        this.a = a;
        this.b = b;
        this.type = type;
    }


    public ArithmeticCalculator(Operation type) {
        this.type = type;
    }

    public Operation getType() {
        return type;
    }

    public void calculate() {
    }
}
