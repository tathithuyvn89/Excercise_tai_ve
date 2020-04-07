import java.util.Scanner;

public class Bai_3 {
    public static void main(String[] args) {
        int h,x,output;
        Scanner scanner = new Scanner(System.in);
        h = scanner.nextInt();
        for (int i=1;i<=h;i++){
            for (int j=1; j<=2*h;j++){
                x=j-h;
                if (x<0){
                    x*=-1;
                }
                output = i - x;
                if (output>0){
                    System.out.printf("%3d",output);
            } else {
                    System.out.printf("   ");
                }

            }
            System.out.println();
        }
    }
}

