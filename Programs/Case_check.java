package Programs;
import java.util.Scanner;
public class Case_check {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an Alphabet:");
        char ch = in.next().trim().charAt(0);
        if(ch >= 'a' && ch <= 'z'){
            System.out.println("The Alphabet entered is a lower case");
        }
        else
            System.out.println("The Alphabet entered UPPER CASE");
    }
}
