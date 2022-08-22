package ss07_Abstract_Interface.thuc_hanh.TH_trien_khai_so_sanh_hinh_hoc;

import ss06_KeThua.thuc_hanh.Circle;

import java.util.Comparator;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()){
            return 1;
        }else if (c1.getRadius() < c2.getRadius()){
            return -1;
        }else {
            return 0;
        }
    }

}
