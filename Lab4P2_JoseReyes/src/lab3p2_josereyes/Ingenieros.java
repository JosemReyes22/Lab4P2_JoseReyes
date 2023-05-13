/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

/**
 *
 * @author josem
 */
public class Ingenieros extends SeresVivos {
    private int numeroRRHH;
    private String nombreUsuario;
    private String contrasena;
   
    public Ingenieros(int numeroRRHH, String nombreUsuario, String contrasena, String nombre, String grupoSanguineo, String sexo, double altura, double peso) {
        super(nombre, grupoSanguineo, sexo, altura, peso);
        this.numeroRRHH = numeroRRHH;
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena; 
    }

    public int getNumeroRRHH() {
        return numeroRRHH;
    }

    public void setNumeroRRHH(int numeroRRHH) {
        this.numeroRRHH = numeroRRHH;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    @Override
    public String toString() {
        return "Ingeniero{" + "numeroRRHH=" + numeroRRHH + ", nombreUsuario=" + nombreUsuario + ", contrasena=" + contrasena +", "+ super.toString();
    }
}
