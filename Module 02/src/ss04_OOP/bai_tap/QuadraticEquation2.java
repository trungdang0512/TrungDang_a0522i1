package ss04_OOP.bai_tap;

public class QuadraticEquation2 {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta = Math.pow(b,2) - 4*a*c;
        return delta;
    }

    public double getRoot1(){
        double r1 = (-b + Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        return r1;
    }
    public double getRoot2(){
        double r2 = (-b - Math.sqrt(Math.pow(b,2) - 4*a*c))/2*a;
        return r2;
    }

}
