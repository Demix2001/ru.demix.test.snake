import java.awt.*;

public class verLine {

    public  verLine (String sym, int y1, int y2, int x) throws InterruptedException {
        for (int i = y1; i < y2 ; i+=10) {
            draw (sym, x, i);
            // Thread.sleep(30);
        }
    }

    public void draw (String str, int x, int y) {
        Scene.draw(str, x,  y);

    }
}
