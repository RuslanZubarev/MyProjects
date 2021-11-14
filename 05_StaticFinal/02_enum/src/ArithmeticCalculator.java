public class ArithmeticCalculator {

    public final Operation type;

    public ArithmeticCalculator(int a, int b, Operation type) {
        this.type = type;
        this.a = a;
        this.b = b;
    }


    public Operation getType() {
        return type;
    }
}
