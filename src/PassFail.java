import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = scanner.next();
        System.out.println("Enter roll number");
        int rollnumber = scanner.nextInt();

        System.out.println("Enter the english marks");
        int em = scanner.nextInt();
        System.out.println("Enter maths marks");
        int mm = scanner.nextInt();
        System.out.println("Enter science marks");
        int sm = scanner.nextInt();
        if(em>=35){System.out.println("Result is pass");}
        else if(em<35){System.out.println("Result is Fail");}
        else if(mm>=35){System.out.println("Result is pass");}
        else if(mm<35){System.out.println("Result is Fail");}
        else if(sm>=35){System.out.println("Result is pass");}
        else if(sm<35){System.out.println("Result is Fail");}
        else System.out.println();

    }
}