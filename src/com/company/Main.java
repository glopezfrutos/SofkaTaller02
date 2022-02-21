package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Representa la clase principal, en la que corren los menúes,
 * a través de los cuales se pueden instanciar las naves.
 */
public class Main {
    /**
     * Menú principal:
     * El usuario puede elegir una de las opciones disponibles.
     * Si no introduce un número se le muestra un mensaje de error.
     * La ejecución continúa hasta que el usuario elija la opción de salir.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;

        System.out.println();
        System.out.println("Por favor, elegir una de las siguientes opciones:");
        System.out.println();
        while (!exit) {
            //Opciones
            System.out.println("Menú principal:");
            System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
            System.out.println("1. Crear un vehículo lanzadera.");
            System.out.println("2. Crear una nave tripulada");
            System.out.println("3. Crear una nave no tripulada");
            System.out.println("4. Salir.");

            try {
                System.out.println("Introducir el número de opción elegida:");
                System.out.println();
                option = scan.nextInt();

                switch (option) {
                    // Instrucciones para cada opción
                    case 1 -> {
                        messageChosen(option);
                        ShuttleVehicle shuttleVehicle = new ShuttleVehicle();
                        System.out.println("Se creo un vehículo lanzadera.");
                        System.out.println();
                    }
                    case 2 -> {
                        messageChosen(option);
                        subMenu2();
                    }
                    case 3 -> {
                        messageChosen(option);
                        UnmannedShip unmannedShip = new UnmannedShip();
                        System.out.println("Se creo una nave no tripulada.");
                        System.out.println();
                    }
                    case 4 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    default -> System.out.println("Elija una opción entre 1 y 4");
                }

            // Si no eligió un número.
            } catch (InputMismatchException e) {
                System.out.println("Por favor elegir un número");
                scan.next();
            }
        }
        System.out.println("El programa ha finalizado.");
    }

    /**
     * Muestra un mensaje con el número de opción elegida por el usuario.
     * @param option número de opción introducida por el usuario, tipo de datos int.
     */
    public static void messageChosen(int option) {
        System.out.println("Eligió la opción " + option);
        System.out.println();
    }


    /**
     * Al elegir la opción 2 (crear una nave tripulada) se presenta el subMenu2,
     * con las opciones de creación de una nave tripulada.
     */
    public static void subMenu2() {
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        int option;

        while (!exit) {
            System.out.println("¿Qué tipo de nave tripulada desea crear?");
            System.out.println("1. Crear una nave para ir a la Luna.");
            System.out.println("2. Crear una nave para investigación científica.");
            System.out.println("3. Crear una nave para realizar tareas de mantenimiento.");
            System.out.println("4. Volver al Menú Principal");

            try {
                System.out.println("Elegir un número de opción");
                option = scan.nextInt();

                switch (option) {
                    case 1 -> {
                        messageChosen(option);
                        LunarShip lunarShip = new LunarShip();
                        System.out.println("Se creo una nave para ir a la Luna.");
                        System.out.println();
                    }
                    case 2 -> {
                        messageChosen(option);
                        InvestigationShip investigationShip = new InvestigationShip();
                        System.out.println("Se creo una nave para investigación científica.");
                        System.out.println();
                    }

                    case 3 -> {
                        messageChosen(option);
                        ManteinanceShip manteinanceShip = new ManteinanceShip();
                        System.out.println("Se creo una nave para realizar tareas de mantenimiento.");
                        System.out.println();
                    }
                    case 4 -> {
                        messageChosen(option);
                        exit = true;
                    }
                    default -> {
                        System.out.println("Elija una opción entre 1 y 4");
                        System.out.println();
                    }
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor elegir un número");
                scan.next();
            }
        }
        System.out.println("Volviendo al menú principal...");
        System.out.println();
    }
}