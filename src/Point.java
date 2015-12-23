import java.awt.*;


public class Point  {
    private String symbol;
    private int x, y;

    public  Point (String str, int x, int y) {
        this.symbol = str;
        this.x = x;
        this.y = y;
    }

     public  String getString(){
         return symbol;
     }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setString(String s) {
        this.symbol = s;
    }


}
