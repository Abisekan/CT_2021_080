package Q_08;
import java.util.*;
public class RemoveExclamationMark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string with one exclamation mark: ");
        String input = scanner.nextLine();

        int exclamationIndex = input.indexOf('!');
        String beforeExclamation = input.substring(0, exclamationIndex).trim();
        String afterExclamation = input.substring(exclamationIndex + 1).trim();

        System.out.println(beforeExclamation);
        System.out.println(afterExclamation);
    }
}
