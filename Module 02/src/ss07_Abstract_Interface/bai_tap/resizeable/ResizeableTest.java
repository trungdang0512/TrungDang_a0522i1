package ss07_Abstract_Interface.bai_tap.resizeable;

public class ResizeableTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle pre-changed: ");
        System.out.println(circle);

        System.out.println("Circle after-changed: ");
        System.out.println(circle.resize(5.0));

        Rectangle rectangle = new Rectangle(6.0,7.0);
        System.out.println("Rectangle pre-changed: ");
        System.out.println(rectangle.getArea());

        System.out.println("Rectangle after_changed: ");
        System.out.println(rectangle.resize(5.0));

    }
}
