package za.ac.cput.domain;

public class Employee {
    private String firstName;
    private String lastName;
    private String empNumber;

    public Employee(){}

    public Employee(String firstName, String lastName, String empNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.empNumber = empNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmpNumber() {
        return empNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", empNumber='" + empNumber + '\'' +
                '}';
    }
}
