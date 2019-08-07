//9. WAP input sales id, seller's name, sales amount, salary basic and then find this sales commission
// sales amount >= 50,000 35%
//sales amount >= 30,000 20%
//>= 20,000 10% >= 10,000 5% < 10,000 2%
import java.util.Scanner;

public class SalesCommission {
    public static void main(String[]args){
        String salesid;
        String salesname;
        double salesamount;
        double basicsalary;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter saleid");
        salesid = scanner.next();
        System.out.println("Enter sellers  name");
        salesname = scanner.next();
        System.out.println("Enter sales amount");
        salesamount =scanner.nextDouble();
        System.out.println("Enter basic salary");
        basicsalary = scanner.nextDouble();

        if(salesamount>=50000){System.out.println("Total commission is"  +" " + (salesamount*35/100));}
        else if(salesamount>=30000){System.out.println("Total commission is"+" " + (salesamount*20/100));}
        else if(salesamount>=20000){System.out.println("Total commission is"+" " + (salesamount*10/100)); }
        else if(salesamount>=10000){System.out.println("Total commission is"+" " + (salesamount*5/100));}
        else if(salesamount<10000){System.out.println("Total commission is"+" " + (salesamount*2/100));}
        else System.out.println();

    }
}
