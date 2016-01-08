
import java.awt.*;
import java.util.ArrayList;

public class Snake {
    private ArrayList<Point> list;
    private Direction direction;

    public Snake (int x, int y, Direction dir) {
        this.direction = dir;
        list = new ArrayList <>();
        list.add(0, new Point("X", x, y));
        list.add(new Point("O", x - dir.deltaX(), y - dir.deltaY()));
        list.add(new Point("O", x - dir.deltaX()*2, y - dir.deltaY()*2));
        list.add(new Point("O", x - dir.deltaX()*3, y - dir.deltaY()*3));
    }

    public void move(Direction dir) throws InterruptedException {
        this.direction = dir;
        for (int i = 0; i <10; i++) {
            moveBody();
            moveHead();
            draw();
            Thread.sleep(150);


        }
    }

    public void moveBody() {
        for (int i = 1; i < list.size() ; i++) {
            Point body = getBody(i);
            list.remove(i);
            Point body2 = getBody(i-1);

            body.setX( body2.getX());
            body.setY( body2.getY());
            //body.setX( body.getX()+10);
            //body.setY( body.getY());
            list.add(i, body);
        }
    }

    public void moveHead() {
        Point head = getHead();
        list.remove(0);
        head.setX( head.getX() + direction.deltaX() );
        head.setY( head.getY() + direction.deltaY());
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
       /* for (Point p : this.list) {
            Scene.draw(p.getString(), p.getX(), p.getY(), p.getX() - direction.deltaX(), p.getY() +  direction.deltaY());

        }*/
        Scene.drawSnake(list);
    }
}
