package ss10_StackQueue.Demerging;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class ArrangeGender {
    public static void main(String[] args) {
        People people01 = new People("Noah", "Male", "14.02.1990");
        People people02 = new People("Oliver", "Male", "16.05.1991");
        People people03 = new People("Elijah", "Male", "21.11.1993");
        People people04 = new People("James", "Male", "30.12.1997");

        People people05 = new People("Emma", "Female", "31.12.1991");
        People people06 = new People("Charlotte", "Female", "3.2.1993");
        People people07 = new People("Amelia", "Female", "10.1.1994");
        People people08 = new People("Ava", "Female", "12.12.1995");

        ArrayList<People> list = new ArrayList<>();
        list.add(people01);
        list.add(people02);
        list.add(people03);
        list.add(people04);
        list.add(people05);
        list.add(people06);
        list.add(people07);
        list.add(people08);

        Queue<People> male = new LinkedList<>();
        Queue<People> female = new LinkedList<>();

        for (People people : list) {
            if (people.getGender() == "Male") {
                male.add(people);
            } else {
                female.add(people);
            }
        }

        System.out.println("Output: ");
        while (!female.isEmpty()){
            System.out.println(female.poll());
        }
        while (!male.isEmpty()){
            System.out.println(male.poll());
        }
    }
}
