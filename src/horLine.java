import java.awt.*;

public class horLine {

    public  horLine (String sym, int x1, int x2, int y) throws InterruptedException {
        for (int i = x1; i < x2 ; i+=10) {
            draw (sym, i, y);
           //  Thread.sleep(30);
        }
    }

    public void draw (String str, int x, int y) {
        Scene.drawLine(str, x,  y);
    }
}
