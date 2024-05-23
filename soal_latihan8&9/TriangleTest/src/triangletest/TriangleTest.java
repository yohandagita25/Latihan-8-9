/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package triangletest;

import java.util.Scanner;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class TriangleTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan tiga sisi dari segitiga: ");
        double sisi1 = input.nextDouble();
        double sisi2 = input.nextDouble();
        double sisi3 = input.nextDouble();

        System.out.print("Masukkan warna segitiga: ");
        String warna = input.next();
        System.out.print("Apakah segitiga terisi (true/false)? ");
        boolean terisi = input.nextBoolean();

        Triangle triangle = new Triangle(sisi1, sisi2, sisi3);
        triangle.setWarna(warna);
        triangle.setTerisi(terisi);
        
        System.out.println("Luas: " + triangle.getLuas());
        System.out.println("Keliling: " + triangle.getKeliling());
        System.out.println("Warna: " + triangle.getWarna());
        System.out.println("Terisi: " + triangle.isTerisi());
    }
    
}
