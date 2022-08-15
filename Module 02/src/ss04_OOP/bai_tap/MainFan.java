package ss04_OOP.bai_tap;

public class MainFan {
    public static void main(String[] args) {
        Fan fan01 = new Fan(1,true , 10, "yellow");
        Fan fan02 = new Fan(2, false,5,"blue");

        System.out.println(fan01.info());
        System.out.println(fan02.info());


    }
}
