public class ProblemSet8_5 {

    public static void main(String args[]) {
        int[] solarray = new int[201];
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j < 100; j++) {
                for (int k = 1; k < 100; k++) {
                    if (good(i, j, k)) {
                        append(solarray, i, j, k);
                    }
                }
            }
        }
        printDiophantineArray(solarray);
    }
    static boolean good(int a, int b, int c) {
        a*=a;
        b*=b;
        int x = a + b;
        int y = c*c;
        return (x == y);
    }

    public static int GCD(int a, int b){
        while (a!=b){
            if (a<b){
                b-=a;
            }
            if(b<a){
                a-=b;
            }
        }
        return a;
    }

    public static void removeThree(int[] a, int i){
        for (int j =i; j<a.length-3; j++){
            a[j] = a[j+3];
        }
    }

    public static void append(int[] a, int b, int c, int d){
        for (int i =0; i<a.length; i+=3){
            int x = 0;
            if((a[i]==b || a[i] ==c || a[i] == d) && (a[i+1]==b || a[i+1]== c || a[i+1] == d) && (a[i+2] == b || a[i+2] == c || a[i+2] == d)){
                return;
            }
            x  = GCD(d, GCD(b, c));
            if(x==1){
                break;
            }le
            else if ((a[i]%x==0) && (a[i+1]%x==0) && (a[i+2]%x==0)){
                return;
            }
        }
        for (int i=0; i<a.length; i++){
            if(a[i] == 0){
                a[i] = b;
                a[i+1] = c;
                a[i+2] = d;
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
        for (int i=0; i<a.length; i+=3){
            System.out.println(a[i] + ", " + a[i+1] + ", " + a[i+2]);
        }
    }
}


