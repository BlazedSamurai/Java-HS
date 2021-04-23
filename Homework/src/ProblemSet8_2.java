public class ProblemSet8_2 {

    public static void main(String args[]) {
        int[] solarray = new int[4];
        for (int i = 1; i < 200; i++) {
            for (int j = 1; j < 200; j++) {
                for (int k = 1; k < 200; k++) {
                    for (int l = 1; l<200;l++){
                        if (good(i, j) && good(j, k) && good(i, k) && good(i,l) && good(j,l) && good(k, l)) {
                            append(solarray, i, j, k, l);
                        }
                    }
                }
            }
        }
        printDiophantineArray(solarray);
    }

    static boolean good(int a, int b) {
        int x = a * b + 1;
        int y = (int) (Math.sqrt(x) + .5);
        return (y * y == x);
    }

    public static void append(int[] a, int b, int c, int d, int e){
        for (int i =0; i<a.length; i+=4){
            if((a[i]==b || a[i] ==c || a[i] == d || a[i] == e) && (a[i+1]==b || a[i+1]== c || a[i+1] == d || a[i+1] == e) && (a[i+2] == b || a[i+2] == c || a[i+2] == d || a[i+2] == e) && (a[i+3]==b || a[i+3] == c || a[i+3] == d || a[i+3] == e)){
                return;
            }
        }
        for (int i=0; i<a.length; i++){
            if(a[i] == 0){
                a[i] = b;
                a[i+1] = c;
                a[i+2] = d;
                a[i+3] = e;
                return;
            }
        }
    }
    public static void printArray(int[] a){
        for (int i = 0; i<a.length; i++){
            System.out.print(a[i] + ", ");
        }
    }

    public static void printDiophantineArray(int[] a){
        for (int i=0; i<a.length; i+=4){
            System.out.println(a[i] + ", " + a[i+1] + ", " + a[i+2] + ", " + a[i+3]);
        }
    }
}


