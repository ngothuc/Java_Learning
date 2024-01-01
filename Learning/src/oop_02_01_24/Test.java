package oop_02_01_24;

public class Test {
    public static void main(String[] args) {
        Employee employee = new Employee();

        employee.setName("John");
        employee.setSalary(3.0);

        System.out.println(employee.getDetail());
    }
}
