package Programs;
import java.util.Scanner;
public class Greatest {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = a;

        if(b > max){
                 max = b;
        }
        if(c > max){
            max = c;
        }

        System.out.println("The greatest of three numbers is: " +max);



    }
}
