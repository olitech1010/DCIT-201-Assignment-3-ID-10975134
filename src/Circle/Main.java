package Circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        Circle circle2 = new Circle(7.5);

        System.out.println("Circle 1 has a radius of " + circle1.getRadius());
        System.out.println("Circle 1 has an area of " + circle1.getArea());
        System.out.println("Circle 1 has a circumference of " + circle1.getCircumference());

        System.out.println("Circle 2 has a radius of " + circle2.getRadius());
        System.out.println("Circle 2 has an area of " + circle2.getArea());
        System.out.println("Circle 2 has a circumference of " + circle2.getCircumference());
    }
}
