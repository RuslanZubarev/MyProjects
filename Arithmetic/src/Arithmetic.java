public class Arithmetic {
    int a = -1;
    int b = -1;

    public Arithmetic(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int plus() {
        return a + b;
    }

    public int multiply() {
        return a * b;
    }

    public int max() {
        return Math.max(a, b);
    }

    public int min() {
        return Math.min(a, b);
    }
}
