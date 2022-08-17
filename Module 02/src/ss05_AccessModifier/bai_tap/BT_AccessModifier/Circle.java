package ss05_AccessModifier.bai_tap.BT_AccessModifier;

public class Circle {
    private double radius = 1.0;
    public String color = "red";

    public Circle() {
    }

    public Circle(double r) {
        this.radius = r;
    }

    protected double getRadius(){
        return this.radius;
    }

    protected double getArea(){
        return this.radius*3.14;
    }


}
