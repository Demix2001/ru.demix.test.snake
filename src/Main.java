
/*
 *    Основной класс, где происходит запуск игры.
 */


import java.awt.*;

public class Main {
    private static final String windowName = "СУПЕР ЗМЕЙКА 3000!";    // Константа, в которой задаем название игрового окна.

    public static void main(String[] args) throws InterruptedException {

        Scene scene = new Scene(windowName);        // Создаём объект класса Scene




        new horLine ( "+", 5, 790, 10);              // Рисуем горизонтальную линию
        new horLine ( "+", 5, 790, 570);           // Рисуем горизонтальную линию
        new verLine ("+", 20, 570, 5);               // Рисуем вертикальную линию
        new verLine ("+", 20, 570, 785);           // Рисуем вертикальную линию

        Snake snake = new Snake(350, 300, Direction.RIGHT);

        snake.draw();
        snake.move(Direction.RIGHT);











    }


}
