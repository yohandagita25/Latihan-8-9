/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprogram;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }

    @Override
    public String toString() {
        return "Staff [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", office=" + office + ", salary=" + salary + ", hireDate=" + hireDate + ", title=" + title + "]";
    }
}