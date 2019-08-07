//12 Input any alphabet in uppercase and print it in lowercase

import java.util.Scanner;

public class UpperAndLowercase {
   public static void main(String[]args){
       char ch;
       int number;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any Uppercase letter");
        ch =scanner.next().charAt(0);

        number = ch;
        number = number + 32;
        ch =(char)number;
        System.out.println("Any character in lowercase"+" "+ ch);



    }
}
