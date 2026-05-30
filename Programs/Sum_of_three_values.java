package Programs;
import java.util.Scanner;
public class Sum_of_three_values {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("The sum of three values: ");
        System.out.print("Enter first value: ");
        float a = input.nextFloat();
        System.out.print("Enter second value: ");
        float b = input.nextFloat();
        System.out.print("Enter third value: ");
        float c = input.nextFloat();
        float sum = a+b+c;
        System.out.println("The sum of three value is: " +sum);
    }
}
