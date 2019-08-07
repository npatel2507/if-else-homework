//14 Enter any value and the find out if it is number (0-9) or an alphabet or symbol

import java.util.Scanner;

public class NumberAndSymbols {
    public static void main(String []args){

        Scanner scanner = new Scanner (System.in);
        System.out.println("Select any number albhabet and symbol");
        char ch = scanner.next().charAt(0);

        if(ch>='0'&&ch<='9'){
        System.out.println(" This is number");}
        else if(ch>='a'&&ch<='z'){
        System.out.println(" This is alphabet");}
        else
            System.out.println("This is symbol");
    }




}




