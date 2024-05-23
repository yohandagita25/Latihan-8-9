/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprogram;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Employee extends Person {
    String office;
    protected double salary;
    protected MyDate hireDate;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + "]";
    }
}