package za.ac.cput.domain;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void objectEqualityTest(){
        List<Employee> employeeList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            Employee e = new Employee("John", "Doe", "101");
            employeeList.add(e);
        }
        assertEquals(10, employeeList.size());
    }
    @Test
    public void objectIdentityTest(){
        Employee employee = new Employee("Mike", "Oxmall","111");
        Employee employee1 = employee;
        Employee employee2 = new Employee("Ben", "Dover", "112");

        assertSame(employee, employee1);
        assertNotSame(employee, employee2);
    }
    @Test
    public void failTest(){
        Employee employee1 = new Employee("Vanessa", "Jackson","102");
        Employee employee2 = new Employee("Jemma", "White","103");
        assertEquals(employee1, employee2);
    }
    @Test
    public void timeoutTest() throws InterruptedException{
        TimeUnit.SECONDS.sleep(2);
    }
    @Test
    public void disablingTest(){
        Employee employee1 = new Employee();
        assertNotNull(employee1);
    }

}
