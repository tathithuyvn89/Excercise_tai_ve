import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;
public class Bai_6 {
    public static void main(String[] args) {
        int n , i;
        Scanner scanner= new Scanner(System.in);
        n=scanner.nextInt();
        if (n%2==0){
            i=2;
        } else {
            i = 1;
        }
        int sum=0;
        for ( ; i<=n;i+=2){
            sum+=i;
            System.out.println("Lan thu "+ i/2 + " tong la " + sum);
        }
        System.out.println("RESULT = "+sum);
    }
}
