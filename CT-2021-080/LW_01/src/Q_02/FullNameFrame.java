package Q_02;
import javax.swing.*;
import java.util.*;
public class FullNameFrame {
    public static void main(String[] args){
        //Scan the user input
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter your first name:");
        String firstName = scanner.nextLine();
        System.out.print("Enter your last name:");
        String lastName = scanner.nextLine();
        scanner.close();
        //Create the JFrame
        JFrame frame= new JFrame();
        frame.setTitle(firstName +" " + lastName);
        frame.setSize(800, 600);
        frame.setVisible(true);


    }

}
