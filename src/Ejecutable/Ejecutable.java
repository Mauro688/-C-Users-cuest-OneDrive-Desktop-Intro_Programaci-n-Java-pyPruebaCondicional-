/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutable;

import java.util.Scanner;

/**
 *
 * @author cuesta
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer un numero y determinar si es par o no par: 
        int num;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el numero: ");
        num = entrada.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El número es PAR: ");
        
        } else {
            System.out.println("El numero NO es PAR: ");
        
            
            }       
    
    }
    
   
}
