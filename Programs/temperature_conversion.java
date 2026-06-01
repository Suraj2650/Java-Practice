package Programs;
import java.util.Scanner;
public class temperature_conversion {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Temperature in Celsius:");
        float tempc = input.nextFloat();
        float tempf = (tempc*9/5) + 32;
        System.out.println("The temperature converted to Fahrenheit is: " +tempf);
    };
}
