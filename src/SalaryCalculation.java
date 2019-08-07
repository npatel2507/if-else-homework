//6. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross salary
//HRA = basic salary 10%
// DA = Basic salary 8%
// TA = Basic salary 9%
//PF= Basic salary 20%
//Gross salary = basic salary + HRA + TA + DA -PF
import java.util.Scanner;

public class SalaryCalculation {
    public static void main(String[] args) {
        String name;
        String Employerid;
        double basicsalary;
        double HRA;
        double DA;
        double TA;
        double PF;
        double Grosssalary;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Employer id");
        Employerid = scanner.next();
        System.out.println("Enter Employee name");
        name = scanner.next();
        System.out.println("Enter basic salary (£):");
        basicsalary = scanner.nextDouble();

        HRA = basicsalary * 0.10;
        DA = basicsalary * 0.08;
        TA = basicsalary * 0.09;
        PF = basicsalary * 0.20;
        //Grosssalary = basicsalary + HRA + DA + TA - PF;
        System.out.println(Grosssalary = basicsalary + HRA + DA + TA - PF);

    }
}
