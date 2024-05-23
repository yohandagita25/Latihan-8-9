/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprogram;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Faculty extends Employee {
    private double officeHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, double officeHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Faculty [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + ", officeHours=" + officeHours + ", rank=" + rank + "]";
    }
}