//16. Write a Java program that takes the user to provide a single character from the
//alphabet. Print Vowel or Consonant, depending on the user input.
//For eg: Input an alphabet: p
//Expected Output : Input letter is Consonant
import java.util.Scanner;

public class VowelAndConsonant {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Alphabet");
        char ch = scanner.next().charAt(0);

        if (ch =='a'||ch =='e'|| ch =='i'||ch =='o'||ch =='u'||ch =='A'||ch =='E'||ch =='I'||ch =='O'||ch =='U'){
            System.out.println("Entered Character" +" "+ ch + " is vowel");}
            else if((ch >='a'&& ch<='z')||(ch >='A'&& ch<='Z'))
            {System.out.println("Entered Character" +" "+ ch + " is Consonant");}
            else System.out.println("Not an Alphabet");

    }
}
