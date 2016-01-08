


import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/*
 *  Класс, который создает окно и выводит на него информацию.
 */

public class Scene  {
    private static JPanel panel1;
    private static String text;
    private  static int x, y, clearX, clearY;
    private  static ArrayList<Point> snake;


    // Конструктор класса, который создает окно.
    public Scene(String name){
        //super(name);           // вызываем метод супер класса (JFrame)
        JFrame frame = new JFrame(name);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );    // активируем остановку программы после закрытия окна.
        frame.setSize(800, 600);          // задаем размер окна.
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);  //размещаем окно по центру экрана.
        JPanel panel = new JPanel(new BorderLayout());
        frame.add(panel);
        panel1=panel;
       //panel.setDoubleBuffered(true);
        frame.setVisible(true);          // выводим окно на экран.
       ;

    }

    public static void draw(String str, int _x, int _y, int x2, int y2) {
        text = str;
        x= _x;
        y= _y;
        clearX = x2;
        clearY = y2;
        paint(panel1.getGraphics());

    }

    public static void drawLine(String str, int _x, int _y) {
        text = str;
        x= _x;
        y= _y;
        paintLine(panel1.getGraphics());

    }

    public static void drawSnake(ArrayList<Point> list) {
        snake = list;
        paint(panel1.getGraphics());


    }






    // обязательный метод paint, который выводит информацию на фрейм.
        public static  void paint(Graphics g) {
         //super.paint(g);
            g.clearRect(10,10,770,550);
           g.setColor(Color.BLUE);
            for (int i = 0; i < snake.size(); i++ ) {
                Point p = snake.get(i);
                g.drawString(p.getString(), p.getX(), p.getY());
            }



    }

        public static   void paintLine(Graphics g) {
      // super.paint(g);
            g.setColor(Color.RED);
           g.drawString(text, x, y);
    }

}
