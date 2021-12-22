public class withwhile {
    public static void main(String[] args) {
        int i = 200000;
        while (i >= 200000 && i <= 210000 || i >= 220000 && i <= 235000) {
            System.out.println(i);
            i++;
        }

    }
}