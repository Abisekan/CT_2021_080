package Q_06;
import javax.swing.*;
import java.util.*;

public class UserDefinedFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the width of the frame (W): ");
        int W = scanner.nextInt();

        System.out.print("Enter the height of the frame (H): ");
        int H = scanner.nextInt();

        scanner.nextLine();
        System.out.print("Enter the title of the frame: ");
        String title = scanner.nextLine();

        JFrame frame = new JFrame(title);
        frame.setSize(W, H);
        frame.setVisible(true);
    }
}
