package Programs;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of iterations(n): ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        for(int count = 2;count <= n; count++){
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println("The number at nth term is:" + b);
    }
}
