package ss05_AccessModifier.bai_tap.BT_xay_dung_lop_chi_ghi;

public class Student {

    private String name = "John";
    private String class1 = "C02";

    public Student() {
    }

    public String getName() {
        return name;
    }

    public String getClass1() {
        return class1;
    }

    public void setClass1(String class1) {
        this.class1 = class1;
    }


    public String setName() {
        return this.name;
    }
    public String setClasses(){
        return this.class1;
    }
}
