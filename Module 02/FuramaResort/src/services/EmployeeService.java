package services;

import models.Person.Employee;

public interface EmployeeService extends Service{
    void displayAll();

    void addNewEmployee();

    void editEmployee();

    int getEmpIndex(Employee employee);

    Employee findEmp(int inputID);

    Employee getEmpInfo();
}
