public class Main {
    public static void main(String[] args) {
        int vasyaAge = 3;
        int katyaAge = 10;
        int mishaAge = 5;

        int min = 0;
        int middle = 0;
        int max = 0;

        if (vasyaAge < mishaAge && vasyaAge < katyaAge) {
            min = vasyaAge;
            if (katyaAge < mishaAge) {
                middle = katyaAge;
                max = mishaAge;
            } else {
                middle = mishaAge;
                max = katyaAge;
            }
        }

        if (katyaAge < mishaAge && katyaAge < vasyaAge) {
            min = katyaAge;
            if (mishaAge < vasyaAge) {
                middle = mishaAge;
                max = vasyaAge;
            } else {
                middle = vasyaAge;
                max = mishaAge;
            }
        }
        if (mishaAge < katyaAge && mishaAge < vasyaAge) {
            min = mishaAge;
            if (katyaAge < vasyaAge) {
                middle = katyaAge;
                max = vasyaAge;
            } else {
                middle = vasyaAge;
                max = katyaAge;
            }
        }
        System.out.println(min);
        System.out.println(middle);
        System.out.println(max);

    }
}
