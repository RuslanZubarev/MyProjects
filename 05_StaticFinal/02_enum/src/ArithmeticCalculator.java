public class ArithmeticCalculator {
    public static final int NUMBER_A = 5;
    public static final int NUMBER_B = 4;


    public final Operation type;

    public ArithmeticCalculator(Operation type){
        this.type = type;
    }

    public Operation getType(){
        return type;
    }

}
