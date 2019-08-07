//10. Input any alphabet from a to f and print their city name accordingly (use if else)
// any other alphabet should be invalid entry
import java.util.Scanner;
public class CityName {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Alphabet from a to f");
        char city = scanner.next().charAt(0);
        if (city == 'a') {
            System.out.println("The city name is Ahmedabad");
        } else if (city == 'b') {
            System.out.println("The city name is Baroda");
        } else if (city == 'c') {
            System.out.println("The city name is calcuta");
        } else if (city == 'd') {
            System.out.println("The city name is Daheradun");
        } else if (city == 'e') {
            System.out.println("The city name is England");
        } else if (city == 'f') {
            System.out.println("The city name is Faridabad");
        } else {
            System.out.println("Invalid entery");}
        }
    }