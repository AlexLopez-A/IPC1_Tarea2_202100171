/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tarea_2;
import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Tarea_2 {

   




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Seleccione la operación a realizar:");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            int opcion = scanner.nextInt();

            double num1, num2;
            switch (opcion) {
                case 1:
                    num1 = obtenerNumero(scanner, "Ingrese el primer número:");
                    num2 = obtenerNumero(scanner, "Ingrese el segundo número:");
                    System.out.println("La suma es: " + (num1 + num2));
                    break;
                case 2:
                    num1 = obtenerNumero(scanner, "Ingrese el primer número:");
                    num2 = obtenerNumero(scanner, "Ingrese el segundo número:");
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    num1 = obtenerNumero(scanner, "Ingrese el primer número:");
                    num2 = obtenerNumero(scanner, "Ingrese el segundo número:");
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    num1 = obtenerNumero(scanner, "Ingrese el primer número:");
                    num2 = obtenerNumero(scanner, "Ingrese el segundo número:");
                    if (num2 != 0)
                        System.out.println("La división es: " + (num1 / num2));
                    else
                        System.out.println("No se puede dividir por cero.");
                    break;
                case 5:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }

            if (continuar) {
                System.out.println("¿Desea realizar otro cálculo? (Sí/No)");
                String respuesta = scanner.next();
                if (respuesta.equalsIgnoreCase("No")) {
                    continuar = false;
                }
            }
        }
    }

    private static double obtenerNumero(Scanner scanner, String mensaje) {
        System.out.println(mensaje);
        while (!scanner.hasNextDouble()) {
            System.out.println("Por favor, ingrese un número válido:");
            scanner.next(); // Limpiar el buffer del scanner
        }
        return scanner.nextDouble();
    }
}
