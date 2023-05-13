/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p2_josereyes;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author josem
 */
public class Lab3P2_JoseReyes {

    /**
     * @param args the command line arguments
     */
    static ArrayList <SeresVivos> ing=new ArrayList<>();
    static ArrayList <SeresVivos> pri=new ArrayList<>();
    static ArrayList <Planetas> planetas = new ArrayList();
    static ArrayList <MedioTransporte> naves = new ArrayList();
    
    static Scanner r= new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        int men=1;
        while(men==1){
            
            System.out.println("\n~~~Menu principal~~~");
            System.out.println("1.Agregar\n2.Modificar\n3.Elimiinar\n4.Reportes\n5.Salir");
            System.out.print("Elija su opcion: ");
            int op = r.nextInt();
            
            switch(op){
                case 1:{
                    int agre=crud();
                    agregar(agre);
                }break;
                case 2:{
                    if (ing.isEmpty() && pri.isEmpty() && planetas.isEmpty() && naves.isEmpty()) {
                        System.out.println("Vacio");
                    } else {
                        System.out.println("\n1.ingenieros\n2.primates\n3.Planetas\n4.Medio de transporte\n4.Menu principal");
                        System.out.print("Que desea modificar:");
                        int modi = r.nextInt();
                        modificar(modi);
                    }
                }break;
                case 3:{
                    System.out.println("\n1.ingenieros\n2.primates\n3.Planetas\n4.Medio de transporte");
                    System.out.print("Que desea eliminar: ");
                    int eli = r.nextInt();
                    int si =print(eli);
                    if (si == 0) {
                        System.out.println("Nada que eliminar");
                    } else {
                        System.out.println("Ingrese el numero de lo que desea eliminar");
                        int lm = r.nextInt();
                        if (eli == 1) {
                            ing.remove(lm);
                        } else if (eli == 2) {
                            pri.remove(lm);
                        } else if (eli == 3) {
                            planetas.remove(lm);
                        } else if (eli == 4) {
                            //naves
                        } else {
                            System.out.println();
                        }
                    }
                }break; 
                case 4:{
                    for (int i = 1; i < 5; i++) {
                        print(i);
                    }
                }break;
            }
        }
    }
    public static int crud(){
        System.out.println("\n1.seres vivos\n2.Planetas\n3.Medio de transporte\n4.Menu principal");
        System.out.print("ingrese su opcion: ");
        int ag=r.nextInt();
        return ag;
    }
    public static void agregar(int g) {
        switch(g){
            case 1:{
                System.out.println("1.Agregar ingeniero\n2.Agregar primates");
                int ag=r.nextInt();
                //nombre
                System.out.print("Ingrese el nombre: ");
                String nom=r.next();
                //sangre
                System.out.print("Ingrese el tipo de sangre: ");
                String san=r.next();
                //sexo
                System.out.print("Ingrese el sexo: ");
                String sex=r.next();
                //altura
                System.out.print("Ingrese la altura: ");
                double al=r.nextDouble();
                //pes
                System.out.print("Ingrese el peso: ");
                double pes=r.nextDouble();

                if(ag==1){
                    System.out.print("Agregue numero de RRHH: ");
                    int RRHH=r.nextInt();

                    System.out.print("Nombre de usuario: ");
                    r.nextLine();
                    String usu=r.nextLine();

                    System.out.print("Ingrese contrasena: ");
                    String con=r.next();

                    ing.add(new Ingenieros(RRHH,usu,con,nom,san,sex,al,pes));
                }else if(ag==2){
           
                    System.out.print("Cantidad de comida: ");
                    double com = r.nextDouble();

                    System.out.println("Cuanto come por Km: ");
                    double comKm = r.nextDouble();

                    System.out.println("Lugar de nacimiento: ");
                    String nac = r.next();
                    pri.add(new Primates(com,comKm,nac,nom,san,sex,al,pes));
                }else{
                    System.out.println(" ");
                }
            }break;
            case 2:{
                System.out.print("Nombre del planeta: ");
                String pla=r.next();
                
                System.out.print("Kilometros de la tierra: ");
                double kil=r.nextDouble();
                planetas.add(new Planetas(pla,kil));
            }break;
            case 3:{
                System.out.print("Ingrese la cantidad de combustible: ");
                double comb=r.nextDouble();
                System.out.print("Kilometros recorridos con tanque lleno: ");
                double comkm=r.nextDouble();
                
                System.out.println("1.Aereo Normal\n2.Aereo Espacial");
                System.out.print("Elija su opcion: ");
                int nav= r.nextInt();
                if(nav==1){
                    System.out.print("Ingrese cantidad maxima de pasajeros: ");
                    int pas=r.nextInt();
                    
                    System.out.print("Longitud todal:");
                    int log=r.nextInt();
                    
                    System.out.print("Cantidad de motores:");
                    int mot=r.nextInt();
                    //primates a meter
                    primates();
                    System.out.println("Que primate desea agregar a la nave");
                    int pi=r.nextInt();
                    naves.add(new AereoNormal(pas,log,mot,comb,comkm,((Primates) pri.get(pi))));
                    pri.remove(pi);
                }else if(nav==2){
                    System.out.print("Tipo de combustible:");
                    String com=r.next();
                    
                    System.out.println("1.Avion espacial de combate\n2.Avion espacial normal");
                    int av=r.nextInt();
                    primates();
                    System.out.println("Que primate desea agregar a la nave");
                    int pi=r.nextInt();
                    
                    String avi=av==1?"Avion espacial de combate":"Avion espacial normal";
                    naves.add(new AereoEspacial(com,avi,comb,comkm,((Primates) pri.get(pi))));
                    pri.remove(pi);
                }
            }break;
            default:
        }
        System.out.println("Agregados exitosamente...");
    }
    public static int print(int num){
        int ji=0;
        int nums = 0;
        switch (num) {
            case 1: {
                if (ing.isEmpty()) {
                    System.out.println("Ingenieros vacio");
                    return 0;
                } else {
                    for (SeresVivos in : ing) {
                        System.out.println(nums + " " + in);
                        nums++;
                    }
                }
            }
            break;
            case 2: {
                if (pri.isEmpty()) {
                    System.out.println("Primates vacio");
                    return 0;
                } else {
                    for (SeresVivos pr : pri) {
                        System.out.println(nums + " " + pr);
                        nums++;
                    }
                }
            }
            break;
            case 3: {
                if (planetas.isEmpty()) {
                    System.out.println("Planetas vacio");
                    return 0;
                } else {
                    for (Planetas pla : planetas) {
                        System.out.println(nums + " " + pla);
                        nums++;
                    }
                }
            }
            break;
            case 4: {
               if (naves.isEmpty()) {
                    System.out.println("Naves vacio");
                    return 0;
                } else {
                    for (MedioTransporte MT : naves) {
                        System.out.println(nums + " " + MT);
                        nums++;
                    }
                }
            }
            break;
            default:
                System.out.println("Opcion invalida");
        }
        return 1;
    } 
    public static void primates(){
        if(pri.isEmpty()){
            System.out.println("No hay primates");
        }else{
            int i = 0;
            for (SeresVivos p : pri) {
                System.out.println(i+" "+p); 
                i++;
            }
        }
    }
    public static void modificar( int m){
        int num=0;
        switch(m){
            case 1:{
                for (SeresVivos in:ing) {
                    System.out.println(num+" "+in);
                }
                System.out.print("Ingres el numero del ingeniero que desea modificar: ");
                int mof=r.nextInt();
                
                System.out.print("Ingrese contrasena: ");
                String con = r.next();
                ((Ingenieros) ing.get(mof)).setContrasena(con);
                
                System.out.print("Nombre de usuario: ");
                r.nextLine();
                String usu = r.nextLine();
                ((Ingenieros) ing.get(mof)).setNombreUsuario(usu);
                
                System.out.print("Agregue numero de RRHH: ");
                int RRHH = r.nextInt();
                ((Ingenieros) ing.get(mof)).setNumeroRRHH(RRHH);
                
                System.out.print("Ingrese el nombre: ");
                r.nextLine();
                String nom = r.nextLine();

                System.out.print("Ingrese el tipo de sangre: ");
                String san = r.nextLine();

                System.out.print("Ingrese el sexo: ");
                String sex = r.nextLine();

                System.out.print("Ingrese la altura: ");
                double al = r.nextDouble();

                System.out.print("Ingrese el peso: ");
                double pes = r.nextDouble();
                
                ing.get(mof).setAltura(al);
                ing.get(mof).setSexo(sex);
                ing.get(mof).setNombre(nom);
                ing.get(mof).setGrupoSanguineo(san);
                ing.get(mof).setPeso(pes);
            }break;
            case 2:{
                int nums =0;
                for (SeresVivos pr : pri) {
                    System.out.println(num+" "+pr);
                }
                System.out.print("Ingres el numero del primate que desea modificar: ");
                int mof = r.nextInt();

                System.out.print("Cantidad de comida: ");
                double com = r.nextDouble();
                ((Primates)pri.get(mof)).setCantidadComida(com);

                System.out.println("Cuanto come por Km: ");
                double comKm = r.nextDouble();
                ((Primates)pri.get(mof)).setCantidadComidaKm(comKm);
                
                System.out.println("Lugar de nacimiento: ");
                r.nextLine();
                String nac = r.nextLine();
                ((Primates)pri.get(mof)).setLugarNacimiento(nac);
                
                System.out.print("Ingrese el nombre: ");
                r.nextLine();
                String nom = r.nextLine();

                System.out.print("Ingrese el tipo de sangre: ");
                String san = r.nextLine();

                System.out.print("Ingrese el sexo: ");
                String sex = r.nextLine();

                System.out.print("Ingrese la altura: ");
                double al = r.nextDouble();

                System.out.print("Ingrese el peso: ");
                double pes = r.nextDouble();
                
                pri.get(mof).setGrupoSanguineo(san);
                pri.get(mof).setAltura(al);
                pri.get(mof).setNombre(nom);
                pri.get(mof).setSexo(sex);
                pri.get(mof).setPeso(pes);
            }break;
            case 3:{
                System.out.print("Ingres el numero del planeta que desea modificar: ");
                int mof = r.nextInt();
                
                System.out.print("Nombre del planeta: ");
                r.nextLine();
                String pla=r.nextLine();
                
                System.out.print("Kilometros de la tierra: ");
                double kil=r.nextDouble();
                planetas.get(mof).setKm(kil);
                planetas.get(mof).setNombredeplaneta(pla);
            }break;
            case 4:{
                int i=0;
                for (MedioTransporte md:naves) {
                    System.out.println(i+" "+md);
                }
                System.out.print("Ingres el numero de la nave que desea modificar: ");
                int mof = r.nextInt();
                
                System.out.print("Ingrese l cantidad de combustible: ");
                double comb=r.nextDouble();
                System.out.print("Kilometros recorridos con tanque lleno: ");
                double comkm=r.nextDouble();
                
                System.out.println("1.Aereo Normal\n2.Aereo Espacial");
                System.out.print("Elija su opcion: ");
                int nav= r.nextInt();
                if(nav==1){
                    System.out.print("Ingrese cantidad maxima de pasajeros: ");
                    int pas=r.nextInt();
                    
                    System.out.print("Longitud todal:");
                    int log=r.nextInt();
                    
                    System.out.print("Cantidad de motores:");
                    int mot=r.nextInt();
                    naves.get(mof).setCantidadCombustible(comb);
                    naves.get(mof).setCantidadKmTanqueLleno(comkm);
                    ((AereoNormal)naves.get(mof)).setCantmaxpas(pas);
                    ((AereoNormal)naves.get(mof)).setLogtotal(log);
                    ((AereoNormal)naves.get(mof)).setCantmotor(mot);
                }else if(nav==2){
                    System.out.print("Tipo de combustible:");
                    String com=r.next();
                    
                    System.out.println("1.Avion espacial de combate\n2.Avion espacial normal");
                    int av=r.nextInt();
                    
                    String avi=av==1?"Avion espacial de combate":"Avion espacial normal";
                    naves.get(mof).setCantidadCombustible(comb);
                    naves.get(mof).setCantidadKmTanqueLleno(comkm);
                    ((AereoEspacial)naves.get(mof)).setTipCombustible(com);
                    ((AereoEspacial)naves.get(mof)).setComba(avi);
                }
            }break;
        }
    }
}
