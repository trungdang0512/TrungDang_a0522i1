package models.Person;

public class Employee extends Person{
    int employeeID;
    String education;
    String workingPosition;
    double salary;

    public Employee(int employeeID){
        this.employeeID = employeeID;
    }

    public Employee(String name, String dateOfBirth, String gender, String idNumber, String phoneNumber, String emailAddress, int employeeID, String education, String workingPosition, double salary) {
        super(name, dateOfBirth, gender, idNumber, phoneNumber, emailAddress);
        this.employeeID = employeeID;
        this.education = education;
        this.workingPosition = workingPosition;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeID == employee.employeeID;
    }
}
