package Q_03;
import java.util.*;
public class FullNameFormatter {
    public static void main(String[] args) {
        //Scan the user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter your middle name:");
        String middlename = scanner.nextLine();
        System.out.print("Enter your middle name:");
        String lastName = scanner.nextLine();
        scanner.close();
        //Take first letter of middle name
        char middleInitial = middlename.charAt(0);
        String formattedname = firstName+ " "+middleInitial+"."+lastName;
        System.out.println("Formatted Name: "+formattedname);
    }
}
