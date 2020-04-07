
import java.util.Scanner;

public class Bai_1 {
    public static void main(String[] args) {
        int m,n;
        Scanner scanner= new Scanner(System.in);
        m= scanner.nextInt();
        n=scanner.nextInt();

        for (int i=0; i<m;i++){
            for (int j=0;j<n;j++){
                System.out.print(" 8 ");
            }
            System.out.println();
        }
    }
}

