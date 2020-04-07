import java.util.Scanner;

public class Bai_10 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int i=2;
        if (i==1){
            System.out.println(n +  " = " + n);
        } else {
            System.out.print(n + " = ");
            while (n!=1){
                if (n%i==0){
                    System.out.print(i + " x ");
                    n/=i;
                } else {
                    i++;
                }
            }
            System.out.print("\b\b\b");
        }

    }
}
