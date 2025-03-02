package Q_10;
import java.util.*;
public class MiddleCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an odd-length word: ");
        String word = scanner.nextLine();

        if (word.length() % 2 == 0) {
            System.out.println("The word must have an odd length.");
        } else {
            int middleIndex = word.length() / 2;
            char middleChar = word.charAt(middleIndex);
            System.out.println(middleChar);
        }
    }
}
