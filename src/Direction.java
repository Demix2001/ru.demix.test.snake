
public enum Direction {
    UP,
    DOWN,
    RIGHT,
    LEFT;

    public int deltaX() {
        switch (this) {
            case LEFT:
                return -10;
            case RIGHT:
                return 10;
            default:
                return 0;
        }
    }
    public int deltaY() {
        switch (this) {
            case UP:
                return -10;
            case DOWN:
                return 10;
            default:
                return 0;
        }
    }
}
