import javax.swing.*;
import java.awt.*;

public class SnakeGame extends JFrame {
    private static String string;
    private static  int x, y;

    public static void main(String[] args) {
        JFrame frame = new JFrame("SNAKE");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        JPanel panel = new JPanel(new BorderLayout());
        //frame.add(panel);

       frame.add(panel);

        frame.setVisible(true);










    }

}
