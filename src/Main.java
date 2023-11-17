public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Point point1 = new Point(3, 4);
        Point point2 = new Point(6, 8);
        Point first = new Point(6, 5);

        Point second = new Point(3, 1);
        Point point3 =null;

        System.out.println("distance(0,0)= " + first.distance());

        System.out.println("distance(second)= " + first.distance(second));

        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point(0,0);

        System.out.println("distance()= " + point.distance());

        System.out.println("**********************************************");


    }
}