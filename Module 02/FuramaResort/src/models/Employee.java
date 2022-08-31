package models;

public class Employee extends Person{
    String employeeID;
    String education;
    String workingPosition;
    String salary;

    public Employee(String name, String dateOfBirth, String gender, String idNumber, String phoneNumber, String emailAddress, String employeeID, String education, String workingPosition, String salary) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, emailAddress);
        this.employeeID = employeeID;
        this.education = education;
        this.workingPosition = workingPosition;
        this.salary = salary;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getWorkingPosition() {
        return workingPosition;
    }

    public void setWorkingPosition(String workingPosition) {
        this.workingPosition = workingPosition;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", education='" + education + '\'' +
                ", workingPosition='" + workingPosition + '\'' +
                ", salary='" + salary + '\'' +
                ", name='" + name + '\'' +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", gender='" + gender + '\'' +
                ", idNumber='" + idNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                '}';
    }
}
