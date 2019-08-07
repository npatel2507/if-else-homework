//15 WAP input any number, the print Day name of the week accordingly by using if else
import java.util.Scanner;

public class DaysOfweeks {


    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to select day");
        int week = scanner.nextInt();
        if(week==1){
           System.out.println("It is monday"); }
        else if(week==2){
            System.out.println("It is tuesday");
        }else if(week==3){
            System.out.println("It is wednesday");
        }else if(week==4){
            System.out.println("It is thursday");
        }else if(week==5) {
            System.out.println("It is friday");
        }else if(week==6){
            System.out.println("It is saturday");
        }else if (week == 7){
            System.out.println("It is sunday");
        }else System.out.println ("Invalid entry");

        }
        }


