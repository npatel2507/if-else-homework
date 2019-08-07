// 1 Input any two number and find out its odd or even use turnery operator (? :)


import java.util.Scanner;

public class OddAndEven {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please select First Number");
        int a = scanner.nextInt();
        System.out.println("Plaese select second Number");
        int b = scanner.nextInt();
          //turnery operator
        System.out.println((a%2==0)?"This number is even":"This number is odd");
        System.out.println((b%2==0)?"This number is even":"This number is odd");

    }
}
