/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial.progra;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ParcialProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acum=0;
        Scanner a = new Scanner(System.in);
        
        System.out.println("Ingrese Carne del Estudiante. \n");
        int ca1 = a.nextInt();
        int ca2 = a.nextInt();
        int ca3 = a.nextInt();
        
        
        System.out.println("Ingrese Notas: ");
        int No1 = a.nextInt();
        System.out.println("\n Ingrese Nota 2: ");
        int No2 = a.nextInt();
        System.out.println("\n Ingrese Nota 3: ");
        int No3 = a.nextInt();
        System.out.println("\n Ingrese Nota 4: ");
        int No4 = a.nextInt();
        
        
        /*int arr[]=new int [4];
        System.out.println();
        int j=0;
        for (int i=0; i<arr.length;i++)
        {
            j+=1;
            System.out.println("Nota"+j+" : ");
            arr[i] = a.nextInt();
        }
        burbuja (arr);
        */
        int pro = No1+No2+No3+No4/4;
        
        if (No1<No2){
           acum=No2;
           No2=No1;
           No1=acum;
        } 
            if (No1<No3){
                 acum=No3;
                No3=No1;
                 No1=acum;
            }
          if (No1<No4){
            acum=No4;
           No4=No1;
           No1=acum;
          }
          if (No2<No3){
           acum=No3;
           No3=No2;
           No2=acum;
          }
          
          if (No2<No4){
           acum=No4;
           No4=No2;
           No2=acum;
          }
          
          if (No3<No4){
           acum=No4;
           No4=No2;
           No2=acum;
          }
          
          System.out.println("\n Datos Del Estudiante: ");
        System.out.println("\n Carne : "+ca1+" - "+ca2+" - "+ca3);
        System.out.println("\n  Notas: "+No1+" "+No2+" "+No3+" "+No4);
        System.out.println("\n Promedio: "+pro);
    }
}
    
    
    

