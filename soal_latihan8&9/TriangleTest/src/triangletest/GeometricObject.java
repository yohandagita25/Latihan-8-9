/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triangletest;

/**
 *
 * @author Yohanda Gita Pratiwi
 */
public class GeometricObject {
    private String warna = "white";
    private boolean terisi;
    private java.util.Date dateCreated;

    public GeometricObject() {
        dateCreated = new java.util.Date();
    }

    public GeometricObject(String warna, boolean terisi) {
        dateCreated = new java.util.Date();
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {
        return "created on " + dateCreated + "\nwarna: " + warna + " and terisi: " + terisi;
    }
}
