package ss09_DSA.bai_tap.BT_Them01.controllers;

import ss09_DSA.bai_tap.BT_Them01.models.Person;
import ss09_DSA.bai_tap.BT_Them01.models.Student;
import ss09_DSA.bai_tap.BT_Them01.models.Teacher;
import ss09_DSA.bai_tap.BT_Them01.services.AddNewInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    static List<Person> personList = new ArrayList<>();
    static Teacher teacher;
    static Student student;
    static Person person;


    public static void mainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("1. Add new Teacher or Student info");
            System.out.println("2. Delete the Teacher or Student info");
            System.out.println("3. Display the Teacher or Student list");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1:{
                    addNewInfo();
                    break;
                }
                case 2:{
                    deleteInfo();
                    break;
                }
                case 3:{
                    displayList();
                    break;
                }
                case 4:{
                    System.exit(0);
                }
            }
        }
    }

    public static void addNewInfo() {
        boolean check = true;
        while (check) {
            System.out.println("Chose the opion: ");
            System.out.println("1. Add new Student Info: ");
            System.out.println("2. Add new Teacher Info: ");
            System.out.println("3. Back to Main Menu");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    Student newStudentInfo = AddNewInfo.addNewStudentInfo();
                    personList.add(newStudentInfo);
                    break;
                }
                case 2: {
                    Teacher newTeacherInfo = AddNewInfo.addNewTeacherInfo();
                    personList.add(newTeacherInfo);
                    break;
                }
                case 3: {
                    mainMenu();
                    break;
                }
            }
        }
    }

    public static void deleteInfo(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input ID to find: ");
        int inputId = scanner.nextInt();
        boolean checkCorrect = false;
        for (int i = 0; i<personList.size(); i++){
            if (personList.get(i).getId() == inputId) {
                checkCorrect = true;
                boolean check = true;
                while (check) {
                    System.out.println("Remove: " + personList.get(i).toString());
                    System.out.println("Are you sure to delete this info?");
                    System.out.println("1. Yes");
                    System.out.println("2. No");
                    switch (scanner.nextInt()){
                        case 1: {
                            personList.remove(i);
                            mainMenu();
                            break;
                        }
                        case 2: {
                            mainMenu();
                            break;
                        }
                    }
                }
            break;}
        }
        if (checkCorrect = false){
            System.out.println("Can't find Student or Teacher Info with input ID !!!");
        }
    }

    public static void displayList(){
        for (Person person: personList ){
            System.out.println(person);;
        }
    }

    public static void main(String[] args) {
        mainMenu();
    }
}
