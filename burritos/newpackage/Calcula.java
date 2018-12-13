/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package burritos.newpackage;

import java.util.Scanner;

/**
 *
 * @author escritorio
 */
public class Calcula {
        //Creamos las variables

    private boolean encendido;
    private int cantburr;
    private int precio;
    private int bu;
    
    
    
    
    public Calcula(boolean encendido, int cantburr, int precio) {
        this.encendido = encendido;
        this.cantburr = cantburr;
        this.precio = precio;
    }

    public Calcula(){
    encendido= false;
    cantburr=0;
    precio = 0;
    }
    
    public void prendido (){   //Creamos el metodo para prenderlo
    encendido = true;
    }
    public void apagado(){
    encendido=false;
    }
    
    public void precio(){
    precio=precio;
    }
    public void aumcantburr(){
    
    if(cantburr>=0){
    cantburr=cantburr+1;
    }if(cantburr>999){
        System.out.println("Ya estas al maximo, bajale de burritos xd ");
    }
    }
    
    public void dismiburritos(){
    if(cantburr>0){
    cantburr=cantburr-1;
    }
    if(cantburr<=0){
        System.out.println("No hay burritos");
        System.out.println("No se puede disminuir mas");
    }
    
    
    }
    
    public void preci(){
                  if(encendido=true){
                  }if(cantburr>=1 || cantburr<=999 ){  
                  
                  precio = cantburr*14;
                                             }
                  if(cantburr>10){
                      System.out.println("Comprate mas de 10 burritos, te regalamos uno :D");
                  
                      precio= precio-14;
                  }
    }
    
    
    
    
    
    
    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    public int getCantburr() {
        return cantburr;
    }

    public void setCantburr(int cantburr) {
        this.cantburr = cantburr;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getBu() {
        return bu;
    }

    public void setBu(int bu) {
        this.bu = bu;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void cal() {
int x,y,z,r;

        Scanner sc = new Scanner( System.in );
        Calcula te = new Calcula();
    System.out.println("Estas listo xd 1= si  otro numero: no");
        x=sc.nextInt();
        
        if(x==1){
        do{
            
            
           
        //Verificamos si esta encendido
        if(!te.isEncendido()){   //Si no esta encendido
            te.prendido();       //Lo prendemos
            System.out.println("");
        }System.out.println("Que burrito deseas :D : "
        + "\n1) Picadillo"
        + "\n2) Discada"
        + "\n3) Chicharron "
        + "\n4) Frijolies ");
               te.setBu(sc.nextInt());
               System.out.println("");
              
               
               
        System.out.println("Tus burritos son: "  +te.getCantburr());
        System.out.println("El precio es " +te.getPrecio());
        
        
            System.out.println("");
            System.out.println("Quieres avanzar de burritos uno en uno?   1:si 2:no ");
            y=sc.nextInt();
            if(y==1){
                do{
                    te.aumcantburr();
                    System.out.println("Tus burritos son " +te.getCantburr());
                    System.out.println("Seguimos?  1: si  otro numero: nel");
                    y=sc.nextInt();
            }while(y==1);
                }
            
            System.out.println("Pon la cantidad de burritos que quieras");
            te.setCantburr(sc.nextInt());
            System.out.println("Tus burritos son " +te.getCantburr());
            
            
            
            System.out.println("Acabaste, o ya estas listo para comprarlos: 1:si 2:no ");
            z=sc.nextInt();
            if(z==1){
            do{
            te.preci();
                System.out.println("El precio es: "  +te.getPrecio());
                System.out.println("Click a un numero para salir"  );
            z=sc.nextInt();
            }while(z==1);
          
            
            }
            System.out.println("");
            System.out.println("Quieres disminuir los burritos o traes feria para poner aguacate: 1:si 2:no ");
            r=sc.nextInt();
            if(r==1){
            do{
            
            te.dismiburritos();
                System.out.println("Los burritos son: "  +te.getCantburr());
                System.out.println("Seguimos disminuyendo los burritos 1:si otro numero: nel xd ");
            r=sc.nextInt();
            }while(r==1);
            }
            te.preci();
                System.out.println("El precio es: "  +te.getPrecio());
            System.out.println("");
            
            System.out.println("Tus burritos son: "  +te.getCantburr() + " Del pedido "  +te.getBu () +"  El precio es: " +te.getPrecio());
            
        System.out.println("Quieres apagar la app  1: no  otro numero: si");
        x=sc.nextInt();
        }while(x==1);
        
        
        
        }
        System.out.println("");
        System.out.println("Genial, ahora lee un libro");
}
    
    
    
    
}
