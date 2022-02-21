package com.company;

/**
 * Representa las naves no tripuladas.
 */
public class UnmannedShip extends Vehicle implements Icommunicate {

    /**
     * Método para comunicarse con el planeta Tierra.
     */
    @Override
    public void communicate() {
        System.out.println("Se ha establecido la comunicación con a la Tierra.");
    }

    /**
     * Método para acelerar la nave
     */
    @Override
    void speedUp() {
        velocity = 1000;
        System.out.println("La nave ha acelerado.");
    }

    /**
     * Método para calcular la trayectoria de la nave.
     */
    @Override
    void calculateTrajectory() {
        System.out.println("Se ha calculado la trayectoria.");
    }

    /**
     * Método para frenar la nave.
     */
    @Override
    void stop() {
        velocity = 0;
        System.out.println("La nave ha frenado.");
    }

    public void openPanels() {
        System.out.println("Se abrieron los paneles solares.");
    }
}
