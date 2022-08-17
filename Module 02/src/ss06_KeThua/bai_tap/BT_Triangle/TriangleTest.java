package ss06_KeThua.bai_tap.BT_Triangle;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        System.out.println(triangle);

        triangle =new Triangle("Blue", true, 5.0,4.0,3.0 );
        System.out.println(triangle);
    }
}
