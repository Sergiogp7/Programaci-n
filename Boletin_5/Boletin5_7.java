/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin5_7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Sergio
 */
public class Boletin5_7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int n, incr=0, incr2=0;
        int tabla[] = new int [6];
        int tabla2[] = new int [6];
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Rellena la tabla con numeros: ");
            n=scanner.nextInt();
            tabla [i] = n;
        }
        Arrays.sort (tabla);
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
        
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println("Rellena la tabla con numeros: ");
            n=scanner.nextInt();
            tabla2 [i] = n;
        }
        Arrays.sort (tabla2);
        for (int i = 0; i < tabla2.length; i++) {
            System.out.println(tabla2[i]);
        }
        
        int tabla3 [] = Arrays.copyOf (tabla, tabla.length + tabla2.length);
        for (int i = 0; i < tabla3.length-1; i++) {
            if (incr2 != 5 || incr != 5){
                if (tabla[incr] > tabla2[incr2]){
                    tabla3[i]=tabla2[incr2];
                    incr2++;
                }
                else {
                    tabla3[i]=tabla[incr];
                    incr++;
                }
            }
            if(incr2==5){
                    tabla3[i]=tabla2[incr];
                    incr++;
            }
            if (incr==5){
                tabla3 [i]=tabla[incr2];
                incr2++;
        }
            
        
        }
        for (int i = 0; i < 12; i++) {
            System.out.println(tabla3[i]);
        }
    }
    
}
