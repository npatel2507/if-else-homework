//WAP to input student name, roll no, 3 subjects marks..and find out total, percentage and result if he is pass or fail
// on basis of percentage (pass>=35) and also give them grade >= 80 A+ >= 60 A >= 50 B >= 35 C

import java.util.Scanner;

import java.util.Scanner;

public class Result {
    public static void main(String[]args){
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter student name");
      String name =scanner.next();
      System.out.println("Enter roll number");
      int rollnumber =scanner.nextInt();

      System.out.println("Enter the english marks");
      int em =scanner.nextInt();
      System.out.println("Enter maths marks");
      int mm =scanner.nextInt();
      System.out.println("Enter science marks");
      int sm =scanner.nextInt();
      //find out the total
      System.out.println("Total marks of three subject is" +" "+"="+(em+mm+sm));
      //find out the percentage
      System.out.println("Total Percentage of three subject is" +" "+"="+((em+mm+sm)/(3)) + "%");
      //find out the result
      if((em+mm+sm)/(3)>=35){
          System.out.println("The result is Pass");}
          else{System.out.println("The result is Fail");
          //find out the grade
      }System.out.println("the grade is");
          if((em+mm+sm)/(3)>=80){
              System.out.println("A+");}
          else if((em+mm+sm)/(3)>=60){
              System.out.println("A");}
          else if((em+mm+sm)/(3)>=50){
              System.out.println("B");}
          else if ((em+mm+sm)/(3)>=35){
              System.out.println("C");}


          }






        // if(science<35){
       //    System.out.println("Fail");
       //else if(science>35){
         // System.out.println("pass");
        //if(maths<35){
          //  System.out.println("Fail");
        //}else if(maths>35){
          // System.out.println("Pass");
        }




