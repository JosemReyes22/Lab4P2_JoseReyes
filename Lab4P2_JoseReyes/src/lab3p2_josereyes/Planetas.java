/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

/**
 *
 * @author josem
 */
public class Planetas {
        private String nombredeplaneta;
    private double Km;
    
    public Planetas(){
    }
    public Planetas(String nombredeplaneta, double Km) {
        this.nombredeplaneta = nombredeplaneta;
        this.Km = Km;
    }

    public String getNombredeplaneta() {
        return nombredeplaneta;
    }

    public void setNombredeplaneta(String nombredeplaneta) {
        this.nombredeplaneta = nombredeplaneta;
    }

    public double getKm() {
        return Km;
    }

    public void setKm(double Km) {
        this.Km = Km;
    }
    @Override
    public String toString() {
        return "Planetas{" + "nombredeplaneta=" + nombredeplaneta + ", Km=" + Km + '}';
    }
}
