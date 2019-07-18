import java.io.*;

public class EmployeeTest{
    public static void main(String[] args){
        Employee empOne = new Employee("Zhang");
        Employee empTwo = new Employee("Li");

        empOne.empAge(26);
        empOne.empDesignation("程序员");
        empOne.empSalary(1000);
        empOne.printEmployee();

        empTwo.empAge(27);
        empTwo.empDesignation("科学家");
        empTwo.empSalary(2000);
        empTwo.printEmployee();
    }
}