package ss07_Abstract_Interface.thuc_hanh.TH_trien_khai_so_sanh_hinh_hoc;

import ss06_KeThua.thuc_hanh.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3.6);
        circles[1] = new Circle();
        circles[2] = new Circle("Indigo", false, 3.5);

        System.out.println("Pre-Sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-Sorted: ");
        for (Circle circle : circles){
            System.out.println(circle);
        }


    }
}
