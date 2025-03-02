package Q_07;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;
public class CurrentTimeInFrameTitle {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(800, 600);

        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss a");
        String currentTime = dateFormat.format(new Date());

        frame.setTitle(currentTime);
        frame.setVisible(true);
    }
}
