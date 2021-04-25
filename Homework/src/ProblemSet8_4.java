public class ProblemSet8_4 {
    public static int GCD(int a, int b){
        while (a!=b){
            if (a<b){
                b-=a;
            }
            if(b<a){
                a-=b;
;            }
        }
        return a;
    }
}
