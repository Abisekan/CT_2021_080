package Q_11;
import java.util.*;
public class NameFormat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your full name (first middle last): ");
        String fullName = scanner.nextLine();

        String[] names = fullName.split(" ");
        String firstName = names[0];
        String middleName = names[1];
        String lastName = names[2];

        String formattedName = lastName + ", " + firstName + " " + middleName.charAt(0) + ".";
        System.out.println(formattedName);
    }
}

