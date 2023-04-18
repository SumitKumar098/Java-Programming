
public class Circle {
    double radius;
    double[] center = new double[2];

    public Circle() {
        radius = 0.0;
        center[0] = 0.0;
        center[1] = 0.0;
    }

    public Circle(double r, double[] c) {
        radius = r;
        center[0] = c[0];
        center[1] = c[1];
    }

    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.radius + ", Center: (" + circle1.center[0] + ", " + circle1.center[1] + ")");

        double[] center2 = {3.0, 4.0};
        Circle circle2 = new Circle(5.0, center2);
        System.out.println("Circle 2 - Radius: " + circle2.radius + ", Center: (" + circle2.center[0] + ", " + circle2.center[1] + ")");
    }
}
