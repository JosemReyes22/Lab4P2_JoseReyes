/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

/**
 *
 * @author josem
 */
public class AereoEspacial extends MedioTransporte {
     private String tipCombustible;
    private String comba;
    
    public AereoEspacial(String tipCombustible, String comba, double cantidadCombustibl, double cantidadKmTanqueLleno,Primates pri) {
        super(cantidadCombustibl, cantidadKmTanqueLleno,pri);
        this.tipCombustible = tipCombustible;
        this.comba = comba;
    }
    
    public String getTipCombustible() {
        return tipCombustible;
    }
    public void setTipCombustible(String tipCombustible) {
        this.tipCombustible = tipCombustible;
    }

    public String getComba() {
        return comba;
    }

    public void setComba(String comba) {
        this.comba = comba;
    }
  @Override
    public String toString() {
       String result = "AereoEspacial{" +
            "Tipo De combustible=" + tipCombustible +
            ",Tipo de avion=" + comba +
            ", " + super.toString() +
            "}";
    return result;
    }
}
