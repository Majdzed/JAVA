/* ///Procedural : 
public class hello{
    public static void main(String[] args) {
        int[] point = initialisation(3, 4);
        display(point[0], point[1]);
        initialisation(5, 7);
        display(5 , 7);
    }

    public static int[] initialisation(int x, int y) {
        return new int[]{x , y};
    }

    public static void display(int x , int y) {
        System.out.println(x + ", " + y);
    }
} */
public class hello {
    public static void main(String[] args) {
        point p1 = new point(5,7);
        point p2 = new point(9,3);
        /* p1.calculateDistancePointToOtherPoint(p1, p2); */
        System.out.println(p1.getX() + " " + p2.getY());
        System.out.println(p1.setX(15) + " " + p2.setY(46));

    }
}

