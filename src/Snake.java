
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

    public void move(Direction dir) throws InterruptedException {
        this.direction = dir;
        for (int i = 0; i < 30 ; i++) {
            moveBody();
            moveHead();
            draw();
            Thread.sleep(80);


        }
    }

    public void moveBody() {
        for (int i = 1; i < list.size() ; i++) {
            Point body = getBody(i);
            list.remove(i);
            body.setX(body.getX() + 10);
            list.add(i, body);
        }
    }

    public void moveHead() {
        Point head = getHead();
        list.remove(0);
        head.setX( head.getX() + 10 );
        list.add(0, head);
    }

    public Point getHead() {
        return list.get(0);
    }

    public Point getBody(int i) {
        return list.get(i);
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
