
import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Point> list;
    private Direction direction;

    public Snake (int x, int y, Direction dir) {
        this.direction = dir;

        list = new ArrayList <>();
        list.add(0, new Point("X", x, y));
        list.add(new Point("O", x-10, y));
        list.add(new Point("O", x-20, y));
    }

    public void move() {
        moveBody();
        moveHead();
    }

    public void moveBody() {

    }

    public void moveHead() {

    }

    public Point getHead() {
        return list.get(0);
    }

    public ArrayList<Point> getBody() {
        return list;
    }

    public void setDirection(Direction dir) {
        this.direction = dir;
    }

    public Direction getDirection() {
        return direction;
    }

    public void draw () {
        for (Point p : this.list) {
            Scene.draw(p.getString(), p.getX(), p.getY());
        }

    }
}
