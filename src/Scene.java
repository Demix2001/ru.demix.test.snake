


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*
 *  Класс, который создает окно и выводит на него информацию.
 */

public class Scene  {
    private static JPanel panel1;
    private static String text;
    private  static int x, y;

    // Конструктор класса, который создает окно.
    public Scene(String name){
        //super(name);           // вызываем метод супер класса (JFrame)
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );    // активируем остановку программы после закрытия окна.
        frame.setSize(800, 600);          // задаем размер окна.
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  //размещаем окно по центру экрана.
        JPanel panel = new JPanel(new BorderLayout());
        frame.getContentPane().add(panel);
        panel1=panel;
       //panel.setDoubleBuffered(true);
        frame.setVisible(true);          // выводим окно на экран.
       ;

    }

    public static void draw(String str, int _x, int _y) {
        text = str;
        x= _x;
        y= _y;
        paint(panel1.getGraphics());

    }

    public static void drawLine(String str, int _x, int _y) {
        text = str;
        x= _x;
        y= _y;
        paintLine(panel1.getGraphics());

    }






    // обязательный метод paint, который выводит информацию на фрейм.
        public static   void paint(Graphics g) {
      // super.paint(g);
            g.clearRect(x-10, y-10, 10, 10);
            g.setColor(Color.BLUE);
           g.drawString(text, x, y);
    }

        public static   void paintLine(Graphics g) {
      // super.paint(g);
            g.setColor(Color.RED);
           g.drawString(text, x, y);
    }

}
