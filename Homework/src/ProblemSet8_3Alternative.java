
public class ProblemSet8_3Alternative {

    public static void main(String args[]) {
        int counter = 0;
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                for (int k = 1; k < 100; k++) {
                    if (good(i, j, k)) {
                        System.out.println(i + " " + j + " " + k);
                        counter++;
                    }
                }
            }
        }
        System.out.println(counter);
    }

    static boolean good(int a, int b, int c) {
        return ((a*a) + (b*b) == (c*c));
    }
}