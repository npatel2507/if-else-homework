//13. WAP to input enter any two number and ask user to enter their symbol (+, -, /, *)
// find addition, subtraction, multiplication and division according to their symbol (using if else)
import java.util.Scanner;
public class ChooseSymbol {
    public static void main(String []args){
        //initialised int and char
        int a,b;
        char ch;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose First number");
        a =scanner.nextInt();
        System.out.println("Choose second number");
        b =scanner.nextInt();
        System.out.println("Enter any calculation sigh from (+,-,/,*)");
        ch = scanner.next().charAt(0);
        if(ch== '+'){
        System.out.println("The result is "+ (a+b));}
        else if(ch=='-'){
           System.out.println("The result is "+ (a-b));}
        else if (ch== '/')
       {System.out.println("The result is "+ (a/b)); }
       else if (ch=='*'){System.out.println("The result is "+ (a*b));}
       else {System.out.println("invalid entry");}
       }

}

