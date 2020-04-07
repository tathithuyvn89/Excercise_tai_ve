import java.util.Scanner;

public class Bai_12 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        long f1=0,f2=1,f3;
        for (int i=0; i<=n;i++){
            if (i<2){
                System.out.print(i + " ");
            } else {
                f3=f1+f2;
                f1=f2;
                f2=f3;
                System.out.print(f3 + " ");
            }
        }
    }

}
