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
        // Cerrar el Scanner
        //scanner.close();
        Scanner valor = new Scanner(System.in);
        System.out.print("------------------Menu--------------------\n "
                + "1 : --Ejercicio--\n " + "2 : --Ejercicio--\n "
                + "3 : --Ejercicio--\n" + "4 : --Ejercicio--\n"
                + "5 : --Ejercicio--\n" + "6 : --Ejercicio--\n"
                + "7 : --Ejercicio--\n" + "8 : --Ejercicio--\n"
                + "9 : --Ejercicio--\n"
                + "0 : --Cerrar el menu\n"
                + "-------------------------------------------");

        int opcion;
        do {

            System.out.print("\nIngrese una opcion\n ");
            opcion = valor.nextInt();
            switch (opcion) {
                //1.1. Escribir un programa que solicite un valor entero al usuario y determine si es par o impar.
                case 1:
                    System.out.println("Ingrese un numero entero\n");
                    int nu = valor.nextInt();

                    if (nu % 2 == 0) {
                        System.out.println("El número " + nu + " es par.\n");
                    } else {
                        System.out.println("El número es impar \n");
                    }
                    break;

                case 2:
                    //1.2. Escribir un programa que solicite un valor entero al usuario y determine si es positivo o negativo.
                    System.out.print("Ingrese un numero entero \n");
                    int nu1 = valor.nextInt();

                    if (nu1 >= 0) {
                        System.out.print("El numero es positivo.\n " + nu1 + "\n");
                    } else if (nu1 < 0) {
                        System.out.println("El numero es negativo\n " + nu1);
                    }

                    break;

                case 3:
                    //Pedir al usuario un valor. Si el valor es positivo, pedir un segundo valor y calcular la suma, resta y producto de
                    //ambos.Mostrar los resultados por pantalla.
                    System.out.print("Ingrese el un numero positivo\n");
                    int numero10 = valor.nextInt();
                    System.out.print("Ingrese otro numero positivo\n");
                    int numero11 = valor.nextInt();
                    int res = numero10 + numero11;
                    int res1 = numero10 - numero11;
                    int res2 = numero10 / numero11;
                    System.out.print("Total : " + res + "\n" + "Total : " + res1 + "\n" + "Total : " + res2);
                    break;
                case 4:
                    //1.4. Calcular el mayor de dos números enteros introducidos por teclado.

                    System.out.print("Ingrese el primer numero\n ");
                    int nu3 = valor.nextInt();
                    System.out.print("Ingrese el segundo numero\n ");
                    int nu4 = valor.nextInt();
                    if (nu3 > nu4) {
                        System.out.print("El numero es mayor\n " + nu3);
                    } else if (nu4 > nu3) {
                        System.out.print("El numero es mayor\n " + nu4);
                    } else {
                        System.out.print("Los numeros son iguales\n ");
                    }
                    break;

                case 5:
                    //1.5. Calcular el mayor de tres números enteros introducidos por teclado.
                    Scanner scanner = new Scanner(System.in);

                    // Solicitar al usuario que ingrese los tres números
                    System.out.print("Ingrese el primer número: ");
                    int numero1 = scanner.nextInt(); // Leer el primer número

                    System.out.print("Ingrese el segundo número: ");
                    int numero2 = scanner.nextInt(); // Leer el segundo número

                    System.out.print("Ingrese el tercer número: ");
                    int numero3 = scanner.nextInt(); // Leer el tercer número

                    // Determinar cuál de los tres números es el mayor
                    if (numero1 > numero2 && numero1 > numero3) {
                        System.out.println("El número mayor es: " + numero1);
                    } else if (numero2 > numero1 && numero2 > numero3) {
                        System.out.println("El número mayor es: " + numero2);
                    } else if (numero3 > numero1 && numero3 > numero2) {
                        System.out.println("El número mayor es: " + numero3);
                    } else {
                        System.out.println("Los números son iguales.");
                    }

                    break;

                case 6:
                    //1.6. Calcular el mayor de cuatro números enteros introducidos por teclado.

                    // Solicitar al usuario que ingrese los tres números
                    System.out.print("Ingrese el primer número: ");
                    int numero4 = valor.nextInt(); // Leer el primer número

                    System.out.print("Ingrese el segundo número: ");
                    int numero5 = valor.nextInt(); // Leer el segundo número

                    System.out.print("Ingrese el tercer número: ");
                    int numero6 = valor.nextInt(); // Leer el tercer número

                    System.out.print("Ingrese el cuarto numero: ");
                    int numero7 = valor.nextInt();

                    // Determinar cuál de los tres números es el mayor
                    if (numero4 > numero5 && numero4 > numero6 && numero4 > numero7) {
                        System.out.println("El número mayor es: " + numero4);
                    } else if (numero5 > numero4 && numero5 > numero6 && numero5 > numero7) {
                        System.out.println("El número mayor es: " + numero5);
                    } else if (numero6 > numero4 && numero6 > numero5 && numero6 > numero7) {
                        System.out.println("El número mayor es: " + numero6);
                    } else if (numero7 > numero4 && numero7 > numero5 && numero7 > numero6) {
                        System.out.println("Los números mayor es: " + numero7);
                    } else {
                        System.out.println("Los números son iguales.");

                    }

                    break;

                case 7:
                    /**
                     * Determinar en que estado está el agua en función de su
                     * temperatura . Si es negativa el estado será sólido , si
                     * es menor que 100 será líquido y si es mayor que 100 será
                     * gas . Pedir al usuario el valor de la temperatura .
                     *
                     */
                    System.out.print("Ingrese la temperatura del agua en grados Celsius\n ");

                    float temperatura = valor.nextFloat();

                    if (temperatura < 0) {
                        System.out.print("El agua está en estado sólido (hielo).\n ");

                    } else if (temperatura >= 0 && temperatura < 100) {
                        System.out.print("El agua está en estado líquido.\n ");

                    } else {
                        System.out.print("El agua está en estado gaseoso (vapor).\n ");
                    }

                    break;
                case 8:
                    //Un año es bisiesto si es divisible por 4 y no es por 100, o si es divisible por 400. Escribe un programa que lea un
                    //año y devuelva si es bisiesto o no
                   
                    // Solicitar al usuario que ingrese un año
                    System.out.print("Ingrese un año: ");
                    int año = valor.nextInt(); // Leer el año ingresado

                    // Determinar si el año es bisiesto
                    if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
                        System.out.println("El año " + año + " es bisiesto.");
                    } else {
                        System.out.println("El año " + año + " no es bisiesto.");
                    }
                    break;
                case 9:
                    System.out.print("Ingrese el mes\n");
                    int mes = valor.nextInt();

                    switch (mes) {
                        case 1:
                            System.out.print("Enero\n");
                            break;
                        case 2:
                            System.out.print("Febrero\n");

                            break;
                        case 3:
                            System.out.print("Marzo\n");
                            break;
                        case 4:
                            System.out.print("Abril\n");
                            break;
                        case 5:
                            System.out.print("Mayo\n");
                            break;
                        case 6:
                            System.out.print("Junio\n");
                            break;
                        case 7:
                            System.out.print("Julio\n");
                            break;
                        case 8:
                            System.out.print("Agosto\n");
                            break;
                        case 9:
                            System.out.print("Septiembre\n");
                            break;
                        case 10:
                            System.out.print("Octubre\n");
                            break;
                        case 11:
                            System.out.print("Nobiembre\n");
                            break;
                        case 12:
                            System.out.print("Diciembre\n");
                            break;
                        case 13:
                            
                            break;

                        default:
                            break;
                    }
                    break;

                case 0:
                    System.out.print("cerrar\n");
                    break;
                default:
                    break;

            }

        } while (opcion != 0);

    }

}
