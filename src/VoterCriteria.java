// 11 Write Java program to allow the user to input his/her age. Then the program will show if the person is eligible to vote. A person who is eligible to vote must be older than or equal to 18 years old.

import java.util.Scanner;

public class VoterCriteria {

    public static void main(String[]args){
        int age;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the age");
       age = scanner.nextInt();
       if(age>=18) {
           System.out.println("Person of this age is eligible for voting");
       }else if(age<=18){
           System.out.println("Person of this age is not eligible for voting ");
        }

    }

}
