/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author josem
 */
public class MedioTransporte {
    
    private double cantidadCombustible;
    private double cantidadKmTanqueLleno;
    private List<Primates> listaPrimatesAsignados = new ArrayList<>();
    
    public MedioTransporte(double cantidadCombustible, double cantidadKmTanqueLlen,Primates pr) {
        this.cantidadCombustible = cantidadCombustible;
        this.cantidadKmTanqueLleno = cantidadKmTanqueLlen;
        this.listaPrimatesAsignados.add(pr);
    }
// Métodos getters y setters
    public double getCantidadCombustible() {
        return cantidadCombustible;
    }

    public void setCantidadCombustible(double cantidadCombustible) {
        this.cantidadCombustible = cantidadCombustible;
    }

    public double getCantidadKmTanqueLleno() {
        return cantidadKmTanqueLleno;
    }

    public void setCantidadKmTanqueLleno(double cantidadKmTanqueLlen) {
        this.cantidadKmTanqueLleno = cantidadKmTanqueLlen;
    }

    public List<Primates> getListaPrimatesAsignados() {
        return listaPrimatesAsignados;
    }

    public void setListaPrimatesAsignados(Primates prim) {
        this.listaPrimatesAsignados.add(prim);
    }

    @Override
    public String toString() {
        String primateList = "";
    if (listaPrimatesAsignados != null) {
        for (Primates primate : listaPrimatesAsignados) {
           primateList+=primate.toString();
        }
    } else {
        primateList = "\nNo hay primates asignados.";
    }
    return "Cantidad de combustible: " + cantidadCombustible + ", Cantidad de kilometros con tanque lleno: " + cantidadKmTanqueLleno + " km\n"
            +"Primates asignados:" + primateList;
    }
}
