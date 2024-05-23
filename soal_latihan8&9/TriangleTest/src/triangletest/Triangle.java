/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangletest;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class Triangle extends GeometricObject {
    private double sisi1 = 1.0;
    private double sisi2 = 1.0;
    private double sisi3 = 1.0;

    public Triangle() {
    }

    public Triangle(double sisi1, double sisi2, double sisi3) {
        this.sisi1 = sisi1;
        this.sisi2 = sisi2;
        this.sisi3 = sisi3;
    }

    public double getSisi1() {
        return sisi1;
    }

    public void setSisi1(double sisi1) {
        this.sisi1 = sisi1;
    }

    public double getSisi2() {
        return sisi2;
    }

    public void setSisi2(double sisi2) {
        this.sisi2 = sisi2;
    }

    public double getSisi3() {
        return sisi3;
    }

    public void setSisi3(double sisi3) {
        this.sisi3 = sisi3;
    }

    public double getLuas() {
        return sisi1 * sisi2 * 0.5;
    }

    public double getKeliling() {
        return sisi1 + sisi2 + sisi3;
    }

    @Override
    public String toString() {
        return "Triangle: sisi1 = " + sisi1 + " sisi2 = " + sisi2 + " sisi3 = " + sisi3;
    }
}
