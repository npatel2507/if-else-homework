//8
import java.util.Scanner;

public class PositiveNegativeNumber {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number you want");
        int a = scanner.nextInt();
        if(a>0)
        {System.out.println("Given number "+a+" is positive");}
        else if(a<0)
        {System.out.println("Given number "+a+" is Negative");}
        else
            {System.out.println("Given number is Zero");}
        }
        }
