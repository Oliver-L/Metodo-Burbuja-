/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Metodos {
Integer n1=0, n2=0;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
  
    public void setIgual (int x, int y){
        
        this.n1=x;
        this.n2=y;
        if(n1==n2){
            System.out.print("Los numeros son iguales");
            
        }else{
            System.out.print("Los numeros son Diferentes");  
        }
    }
    public void setMayor (int x, int y){
        if(n1>n2){
            System.out.print("El Numero 1 es mayor");
        }else{
            System.out.print("El Numero 1 es menor");
            
        }
    }
     public void setMenor (int x, int y){
        if(n1<n2){
            System.out.print("El Numero 1 es menor");
        }else{
            System.out.print("El Numero 1 es mayor");
            
        }
    }
    
    public void setMaximo (int x, int y){
        if(n1>n2){
            System.out.print("El Numero 1 es maximo");
        }else{
            System.out.print("El Numero 1 es minimo");
            
        }
    }
     public void setMinimo (int x, int y){
        if(n1>n2){
            System.out.print("El Numero 1 es minimo");
        }else{
            System.out.print("El Numero 1 es maximo");
            
        }
    }
    public void setRaiz (int x, int y){
       float r1=(float) Math.sqrt(x);
       float r2=(float) Math.sqrt(y);
       System.out.print("La Raiz cuadrada del Primer Numero es: "+r1);
       System.out.print("La Raiz cuadrada del Segundo Numero es: "+r2);
       
    }
    public void setCuadratica(double  a, double b,double c){
       Scanner r=new Scanner(System.in);
       a=0;
       b=0;
       c=0;
       double x1, x2=0;
       
        System.out.print("Ingrese el Valor de a:");
        a= r.nextInt();
        System.out.print("Ingrese el Valor de b:");
        b= r.nextInt();
        System.out.print("Ingrese el Valor de c:");
        c= r.nextInt();
       
        double d= Math.pow(b, 2)-4*a*c;
        
        if (d<0){
            System.out.print("La solucion no es Correcta");
        } else{
            x1= (-b+Math.sqrt(d))/2*a;
            x2= (-b-Math.sqrt(d))/2*a;
            System.out.print("\nLa Solucion es:" );
            System.out.print("\nx1:"+x1 ); 
            System.out.print("\nx2:"+x2 ); 
        
        }
    }
    public void setSuma (int x, int y){
        int r=x+y;
        System.out.print("EL Resultado es: "+r);
    }    
    
    
    public void setResta (int x, int y){
        int r=x-y;
        System.out.print("EL Resultado es: "+r);
    }    
    
    public void setMulti (int x, int y){
        int r=x*y;
        System.out.print("EL Resultado es: "+r);
    }    
    
    public void setDivision (int x, int y){
        int r=x/y;
        System.out.print("EL Resultado es: "+r);
    }    
    
    public void setAnd (int x, int y){
        int r=x*y;
        System.out.print("EL Resultado es: "+r);
    }    
    public void setOr(int x, int y){
        int r=x+y;
        System.out.print("EL Resultado es: "+r);
    }    
   public void setNot (int x){
        if(x==0){
            x=1;
          System.out.print("La negacion es:"+x);
          
    }
   }
}
    

