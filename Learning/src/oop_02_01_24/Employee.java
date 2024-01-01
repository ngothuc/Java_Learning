package oop_02_01_24;

public class Employee extends Person {
    private double salary;


    public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getDetail() {
        String s = this.name + ", " + this.birthday + ", " + this.salary;
        return s;
    }
}
