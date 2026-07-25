package Programs;
import java.util.Scanner;
public class Fibonacci_series {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of iterations(n): ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        System.out.println("Fibonacci series: ");
        for(int count = 1;count <= n; count++){
            System.out.println(a + " ");
            int temp = b;
            b = b + a;
            a = temp;
        }
    }
}
