/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_4_guia2;

import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class Ejercicio_4_Guia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Double temp;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una Temperatura");
        temp = leer.nextDouble();
        
        System.out.println("La temperatura ingresada en grados Fahrenheit es: " + (32+(9*temp/5)));
        
    }
    
}
