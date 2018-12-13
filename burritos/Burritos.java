/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burritos;

import burritos.newpackage.Calcula;
import burritos.newpackage.Cliente;
import burritos.newpackage.Empleado;
import burritos.newpackage.Persona;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author :D
 */
public class Burritos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner xds = new Scanner(System.in);
        Empleado x = new Empleado ();
        Cliente r = new Cliente ();
        int z,ra;
        

        System.out.println("1 iniciar el programa 2 acabarlo");
        ra=xds.nextInt();
        if(ra==1){
        
        do{
              System.out.println("Elige una opción: "
              + "\n1) Empleado"           //El empleado entra
              + "\n2) Registrarse"       //Los usuarios se registran
              + "\n3) Iniciar sesion "   //Aqui pasa las opera
              + "\n4) byeee ");          //Bye 
              z=xds.nextInt();
    switch(z){
case 1:
               System.out.println("");
               System.out.println("Muy bien, ingrese sus datos");
               x.setNombre(xds.nextLine());
               System.out.println("");
               System.out.println("Ingrese su nombre");
               x.setNombre(xds.nextLine());
               System.out.println("Ingrese su apellido");
               x.setApellido(xds.nextLine());
               System.out.println("Ingrese su clave");
               x.setRfc(xds.nextLine());
               
               x.imprimirNombre();

break;
           
           
case 2:     
               
               Scanner xd = new Scanner (System.in);
               int arr;
               System.out.println("Cuantas personas ingresaremos :3 ");
               arr = xd.nextInt();
               String [] aiyolo;
               aiyolo = new String [arr];
             
               //Contraseñas
                  String [] aicontra;
                  aicontra = new String[arr];
                  for (int i = 0; i < aiyolo.length; i++) {
                   System.out.println("Nombre y Contraseña ");
                   aiyolo[i] = xd.nextLine();
                   aicontra[i]= xd.nextLine();
                                                          }
                    System.out.println("Los usuarios son: ");
                  for (int i = 0; i < aiyolo.length; i++) {
                     System.out.println("Nombre " +aiyolo[i] +" " + " Contraseña: " + aicontra[i]);
                                                          } //Aqui termina
break;


case 3:
                Scanner sc = new Scanner (System.in);
                Calcula ca = new Calcula();
                ca.cal();
break;   


default :
                if(z!=4){
                System.out.println("Opcion incorrecta");
                }
                if(z==4){
                System.out.println("Saldras del programa");
break;    
                }
 }
                }while (z !=4);
                }else{
            System.out.println("Bye");
                     }
        
}
        
    private static void imprimirDatos(Persona pPerso){
    pPerso.imprimirNombre();
    }
}

