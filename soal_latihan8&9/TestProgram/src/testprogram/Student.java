/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testprogram;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Student extends Person {
    public static final int FRESHMAN = 1;
    public static final int SOPHOMORE = 2;
    public static final int JUNIOR = 3;
    public static final int SENIOR = 4;

    private int classStatus;

    public Student(String name, String address, String phoneNumber, String email, int classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    @Override
    public String toString() {
        String status;
    switch (classStatus) {
        case FRESHMAN:
            status = "Freshman";
            break;
        case SOPHOMORE:
            status = "Sophomore";
            break;
        case JUNIOR:
            status = "Junior";
            break;
        case SENIOR:
            status = "Senior";
            break;
        default:
            status = "Unknown";
    }
    return "Student [name=" + name + ", address=" + address + ", phoneNumber=" + phoneNumber + ", email=" + email + ", classStatus=" + status + "]";
    }
}
