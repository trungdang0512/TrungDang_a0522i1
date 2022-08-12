package exercise01.SS03_Array.thuc_hanh;

import java.util.Scanner;

public class TH_tim_gia_tri_trong_mang {
    public static void main(String[] args) {
        String[] students = {"Trung","Hung","Trinh","Thuy","Ha","Duy","Anh"};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name of student: ");
        String inputName = scanner.nextLine();

        boolean checker = false;
        for (int i =0; i < students.length; i++){
            if (students[i].equals(inputName)){
                System.out.println("Position of the student in the list " +inputName+" is: "+(i+1));
                checker = true;
                break;
            }
        }
        if (!checker){
            System.out.println("Not found " + inputName + " in the list!!");
        }
    }
}
