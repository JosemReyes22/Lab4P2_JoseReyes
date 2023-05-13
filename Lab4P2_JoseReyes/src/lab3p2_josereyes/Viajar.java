/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_josereyes;

import java.util.Scanner;
import static lab3p2_josereyes.Lab3P2_JoseReyes.naves;
import static lab3p2_josereyes.Lab3P2_JoseReyes.planetas;
import static lab3p2_josereyes.Lab3P2_JoseReyes.r;

/**
 *
 * @author josem
 */
public class Viajar {
    public void Viajar(Ingenieros ingeniero) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su usuario: ");
        String usuario = scanner.nextLine();
        System.out.println("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        if (ingeniero.getNombreUsuario().equals(usuario) && ingeniero.getContrasena().equals(contrasena)) {
            // Cálculos de decremento de combustible y alimento aquí
            double consumo = 0;
            boolean flag=true;
            if (naves.isEmpty()) {
                System.out.println("Vacio");
            } else {
                int num = 0;
                for (Planetas pl : planetas) {
                    System.out.println(num + " " + pl);
                }
                System.out.println("A que planeta se realizara el viaje");
                int vi = r.nextInt();
                for (int i = 0; i < naves.size(); i++) {
                    if (naves.get(i) instanceof AereoNormal) {
                        int m = (int) (Math.random() * 76) + 25;
                        consumo += (planetas.get(vi).getKm() * 0.15) + m;
                    } else if (naves.get(i) instanceof AereoNormal) {
                        int m = (int) (Math.random() * 11) + 25 + 3;
                        consumo += (planetas.get(vi).getKm() + m);
                    }
                    if(naves.get(i).getCantidadKmTanqueLleno()>consumo){
                        flag= true;
                    }else{
                        flag = false;
                    }
                }
                if(flag){
                    System.out.println("Viaje realizado con éxito.");
                }else{
                    System.out.println("Viaje fallido");
                }
            }
        }else {
            System.out.println("Credenciales incorrectas. No se puede realizar el viaje.");  
        }
    }
}
