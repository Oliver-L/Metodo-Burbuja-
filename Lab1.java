/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg1;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Lab1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        int opc,suma,resta,multi,num;
       int n1;
       int n2;
       int dia=0;
      int elementos;
     
        do{
            System.out.println("----------------------------------------------------------");
            System.out.println("----------------------------MENU--------------------------");
            System.out.println("1. JAVA IDE");
            System.out.println("2. VARIBLES OPERADORES");
            System.out.println("3. CONDICIONALES");
            System.out.println("4. CICLOS");
            System.out.println("5. ARREGLOS");
            System.out.println("6. FUNCIONES");
            System.out.println("7. SALIR");
            System.out.print("Que Opcion Desea Realizar: ");
            opc=datos.nextInt();
            System.out.println("-----------------------------------------------------------");
            System.out.println("-----------------------------------------------------------");
            switch(opc){
                case 1:
                    System.out.println("JAVA es un lenguaje de programación orientado a objetos");
                    System.out.println("Mejores IDE Para Java");
                    System.out.println("1 Eclipse, 2 Netbeans, 3 IntelliJ IDEA, 4 Codenvy");
                    System.out.println("5 IBM Rational Application Developer (RAD)");
                    System.out.println("6 JCreator, 7 jGRASP");
                    break;
                    
                case 2:
                     
                    suma=n1+n2;
                    resta=n1-n2;
                    multi=n1*n2;
                    System.out.print("Ingrese un numero: ");
                    n1=datos.nextInt();
                    System.out.print("Ingrese Otro Numero: ");
                    n2=datos.nextInt();
                    System.out.println("La Suma De Los Numeros es: "+suma);
                    System.out.println("La Resta De Los Numeros es: "+resta);
                    System.out.println("La Multiplicacion De Los Numeros es: "+multi);
                    
                    break;
                case 3:
                    System.out.print("Ingrese un numero del 1 al 7: ");
                    dia=datos.nextInt();
                    if(dia==1){
                        System.out.println("El Dia Es Lunes");
                    }
                    if(dia==2){
                        System.out.println("El Dia Es Martes");
                    }
                    if(dia==3){
                        System.out.println("El Dia Es Miercoles");
                    }
                    if(dia==4){
                        System.out.println("El Dia Es Jueves");
                    }
                    if(dia==5){
                        System.out.println("El Dia Es Viernes");
                    }
                    if(dia==6){
                        System.out.println("El Dia Es Sabado");
                    }
                    if(dia==7){
                        System.out.println("El Dia Es Domingo");
                    }
                    if(dia>=8){
                        System.out.print("Ingrese De nuevo Un numero: ");
                        dia=datos.nextInt();
                    }
                    break;
                case 4:
                    for(int i=1;i<=10;i++){
                        System.out.println(" "+i);
                    }
                    break;
                case 5:
                    System.out.print("Cuantas Letras Desea Ingresar: ");
                    elementos=datos.nextInt();
                    
                    char[] letras = new char[elementos];
                    
                    for(int i=0;i<elementos;i++){
                        System.out.print((i+1)+". Ingrese una letra: ");
                        letras[i]=datos.next().charAt(0);
                         
                    }
                   System.out.println("--------------Muestra De Letras Ingresadas----------------");
                   for(int i=0;i<elementos;i++){
                        System.out.print(letras[i]+" ");
                    }
                    System.out.println("");
                    break;
                case 6:
                    int fact=1;
                    System.out.print("Ingrese Un Numero: ");
                    num=datos.nextInt();
                    if(num<0) fact =0;
                    else if(num==0) fact=1;
                    else{ for (int i = 1; i <= num; i++){
                    fact = fact*i;
                            }
                    }
                    System.out.println("El Factorial de "+num+" Es: "+fact);
                    break;
                    
                
            }
        }while(opc!=7);
    }
    
}



 


    
    

