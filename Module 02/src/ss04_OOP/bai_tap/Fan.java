package ss04_OOP.bai_tap;

public class Fan {
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    public int speed = 1;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public static int getSLOW() {
        return SLOW;
    }

    public static int getMEDIUM() {
        return MEDIUM;
    }

    public static int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String info() {
        if (on == true){
            return "Fan is ON {" +
                    "speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }else {
            return "Fan is OFF {" +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
