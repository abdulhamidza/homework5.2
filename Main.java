
public class Main {
    public static void main(String[] args) {
        Circle[] circles = {
                new Circle(5),
                new Circle(10),
                new Circle(15),
        };

        for (Circle circle : circles) {
            double area = circle.computeArea();
            System.out.println("Area: " + area);
        }
    }
}