import java.util.Random;
import java.util.Scanner;
public class Bai_5 {
    public static void main(String[] args) {
        int input;
        Scanner scanner= new Scanner(System.in);
        input= scanner.nextInt();
        int count=0;
        Random random= new Random();
        while (true){
            int randomNumber=random.nextInt(100);
            count++;
            System.out.println("Random number : " + randomNumber+ ", input: " + input);
            if (randomNumber==input){
                System.out.println("Thuc hien " + count + " lan.");
                break;
            }
        }
    }
}
