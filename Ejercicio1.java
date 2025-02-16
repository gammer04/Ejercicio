/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //1.1. Escribir un programa que solicite un valor entero al usuario y determine si es par o impar.
        Scanner valor = new Scanner(System.in);
          System.out.print("Menu");
           System.out.print(" Ejercicio 1\n ");
           System.out.print("Ejercicio 2\n ");
           System.out.print("cerrar 0\n");
        

        int opcion = valor.nextInt();
        do {

            switch(opcion) {
                case 1:
                    System.out.print("Ingrese un numero entero ");
                    int nu = valor.nextInt();

                    if (nu % 2 == 0) {
                        System.out.println("El número " + nu + " es par. ");
                    } else {
                        System.out.println("El número es impar ");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese un numero entero ");
                    int nu1 = valor.nextInt();

                    if (nu1 > 0) {
                        System.out.print("El numero es positivo.\n " + nu1 + "\n");
                    } else if (nu1 < 0) {
                        System.out.println("El numero es negativo " + nu1);
                    } else {
                        System.out.print("EL numero es cero");
                    }

                    break;
                case 0:
                      System.out.print("cerrar");
                    break;
                default:
                    break;

            }

        } while (opcion != 0);

    }

}
