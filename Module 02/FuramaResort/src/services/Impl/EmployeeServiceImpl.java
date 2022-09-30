package services.Impl;

import models.Person.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Employee> employeeList = new ArrayList<>();

    @Override
    public void displayAll() {
        for (Employee employee: employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public void addNewEmployee() {
        Employee employee = this.getEmpInfo();
        employeeList.add(employee);
        System.out.println("Done!!");
    }

    @Override
    public void editEmployee() {
        System.out.println("Input Employee's ID to edit: ");
        int inputID = Integer.parseInt(scanner.nextLine());
        Employee employee = this.findEmp(inputID);
        int findIndex = this.getEmpIndex(employee);
        if (findIndex != -1){
            System.out.println(employeeList.get(findIndex).toString());
            Employee editEmployee = this.getEmpInfo();
            employeeList.remove(findIndex);
            employeeList.add(findIndex,editEmployee);
            System.out.println("Edited!");
        } else {
            System.out.println("Invalid Employee's ID!!!");
        }
    }

    @Override
    public int getEmpIndex(Employee employee) {
        int index = employeeList.indexOf(employee);
        return index;
    }

    @Override
    public Employee findEmp(int inputID) {
        Employee employee = new Employee(inputID);
        int index = employeeList.indexOf(employee);
        return employeeList.get(index);
    }

    @Override
    public Employee getEmpInfo() {
        System.out.println("Input new employee info: ");
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input Date of birth: ");
        String date = scanner.nextLine();
        System.out.println("Input gender (male/female): ");
        String gender = scanner.nextLine();
        System.out.println("Input ID number: ");
        String idNumber = scanner.nextLine();
        System.out.println("Input phone number: ");
        String phone = scanner.nextLine();
        System.out.println("Input email address: ");
        String mail = scanner.nextLine();
        System.out.println("Input Employee's ID: ");
        int empID = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Employee's education: ");
        String edu = scanner.nextLine();
        System.out.println("Input Employee's work position: ");
        String work = scanner.nextLine();
        System.out.println("Input Employee's salary: ");
        double salary = Double.parseDouble(scanner.nextLine());

        Employee newEmp = new Employee(name,date,gender,idNumber,phone,mail,empID,edu,work,salary);
        return newEmp;
    }
}
