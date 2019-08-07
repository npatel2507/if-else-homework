// WAP to input any two numbers and then print their interchangedvalue
import java.util.Scanner;

public class InterchangeNumber {
    public static void main(String[]args){
        int a= 10;
        int b= 20;
        System.out.println("Before Interchange");
        //Scanner scanner = new Scanner(System.in);
        System.out.println("Value of a: "+a);
        //a =scanner.nextInt();
        System.out.println("Value of b:"+b);
        //b =scanner.nextInt();
        System.out.println("After Interchange");
        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("Value of a: "+a);
        System.out.println("Value of b:"+b);
        //(a=(a+b)){}
    }
}
