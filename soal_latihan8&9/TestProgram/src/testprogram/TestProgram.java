/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testprogram;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class TestProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person person = new Person("Keenan Ghazi", "123 Jakarta", "555-1234", "ghazi@email.com");
        System.out.println(person.toString());

        Student student = new Student("Zaki Asfa", "456 Tokyo", "555-5678", "zaki@email.com", Student.JUNIOR);
        System.out.println(student.toString());

        MyDate hireDate = new MyDate(05, 22, 2020);
        Employee employee = new Employee("Ridzky Ardiansyah", "789 London", "555-9012", "iky@email.com", "Office 101", 50000.0, hireDate);
        System.out.println(employee.toString());

        Faculty faculty = new Faculty("Yohanda Gita", "321 Roma", "555-3456", "gitaa@email.com", "Office 201", 60000.0, hireDate, 10.0, "Associate Professor");
        System.out.println(faculty.toString());

        Staff staff = new Staff("Aretha Luisa", "159 Paris", "555-7890", "lului@email.com", "Office 301", 40000.0, hireDate, "Administrative Assistant");
        System.out.println(staff.toString());
    }
    
}
