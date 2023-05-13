/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

/**
 *
 * @author josem
 */
public class Primates extends SeresVivos {
    private double cantidadComida;
    private double cantidadComidaKm;
    private String lugarNacimiento;

    public Primates( double cantidadComida, double cantidadComidaKm, String lugarNacimiento, String nombre, String grupoSanguineo, String sexo, double altura, double peso) {
        super(nombre, grupoSanguineo, sexo, altura, peso);
        this.cantidadComida = cantidadComida;
        this.cantidadComidaKm = cantidadComidaKm;
        this.lugarNacimiento = lugarNacimiento;
    }
    public double getCantidadComida() {
        return cantidadComida;
    }

    public void setCantidadComida(double cantidadComida) {
        this.cantidadComida = cantidadComida;
    }

    public double getCantidadComidaKm() {
        return cantidadComidaKm;
    }

    public void setCantidadComidaKm(double cantidadComidaKm) {
        this.cantidadComidaKm = cantidadComidaKm;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }
    @Override
    public String toString() {
        return "Primate{"+"cantidadComida=" + cantidadComida + ", cantidadComidaKm=" + cantidadComidaKm + ", lugarNacimiento=" + lugarNacimiento + super.toString();
    }
}
