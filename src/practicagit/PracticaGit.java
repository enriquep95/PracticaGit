/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagit;

import java.util.Scanner;

/**
 *
 * @author ol
 */
public class PracticaGit {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           
        double area;
        double r;
        System.out.println("Estoy en modo heeeeeeeey!!!!");
        System.out.println("Hola mundo");
        
        Scanner sc=new Scanner(System.in);
                
       
                
        System.out.println("Ingresa el radio");
        r=sc.nextDouble();
        area=(Math.PI*Math.pow(r, 2));
        
        System.out.println("El area del circulo es: "+area);
 
        
        
      
       
    }
    
}
