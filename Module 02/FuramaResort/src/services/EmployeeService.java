package services;

import models.Employee;

import java.util.List;

public interface EmployeeService extends Service{
    void displayAll();

    void addNewEmployee();

    void editEmployee(int inputID);

    int getEmpIndex(Employee employee);

    Employee findEmp(int inputID);

    Employee getEmpInfo();
}
