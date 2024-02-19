
public class point {
    private int x;
    private int y;
    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return this.x;
    }
    public int getY() {
        return y;
    }
    public int setX(int x) {
        return this.x = x;
    }
    public int setY(int y) {
        return this.y = y;
    }

    public void calculateDistancePointToOtherPoint(point p1, point p2) {
        int[] distance = { Math.abs(p1.x - p2.x), Math.abs(p1.y - p2.y) };
        System.out.println(distance[0] + ", " + distance[1]);
    }
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void displayInfo() {
        System.out.println(this.x + ", " + this.y);
    }
    public void initilaization(int x, int y) {
        this.x = x;
        this.y = y;
    }
}