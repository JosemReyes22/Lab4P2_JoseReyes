/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

import java.util.ArrayList;

/**
 *
 * @author josem
 */
public class AereoNormal extends MedioTransporte {
     private int cantmaxpas;
    private int logtotal;
    private int cantmotor;

    public AereoNormal(int cantmaxpas, int logtotal, int cantmotor, double cantidadCombustibl, double cantidadKmTanqueLleno,Primates pri) {
        super(cantidadCombustibl, cantidadKmTanqueLleno,pri);
        this.cantmaxpas = cantmaxpas;
        this.logtotal = logtotal;
        this.cantmotor = cantmotor;
    }

    public int getCantmaxpas() {
        return cantmaxpas;
    }

    public void setCantmaxpas(int cantmaxpas) {
        this.cantmaxpas = cantmaxpas;
    }

    public int getLogtotal() {
        return logtotal;
    }

    public void setLogtotal(int logtotal) {
        this.logtotal = logtotal;
    }

    public int getCantmotor() {
        return cantmotor;
    }

    public void setCantmotor(int cantmotor) {
        this.cantmotor = cantmotor;
    }
    @Override
    public String toString() {
       String result = "AereoNormal{" +
            "Cantidad Maxima De Pasajeros=" + cantmaxpas +
            ", Longitud Total=" + logtotal +
            ", cantidad de motores=" + cantmotor +
            ", " + super.toString() +
            "}";
    return result;
    }
}
