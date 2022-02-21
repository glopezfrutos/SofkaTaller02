package com.company;

/**
 * Representa las naves tripuladas que realizan tareas de mantenimiento.
 */
public class ManteinanceShip extends MannedShip {
    /**
     * Método para comunicarse con el planeta Tierra.
     */
    @Override
    public void communicate() {
        System.out.println("Se ha establecido la comunicación con a la Tierra.");
    }

    /**
     * Método para recibir a la tripulación.
     */
    @Override
    void receiveCrew() {
        System.out.println("La tripulación ha accedido a la nave.");
    }

    /**
     * Método para despedir a la tripulación.
     */
    @Override
    void ejectCrew() {
        System.out.println("La tripulación se ha retirado de la nave.");
    }

    /**
     * Método para acelerar la nave.
     */
    @Override
    void speedUp() {
        velocity = 100;
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

    public void initiateOperations() {
        System.out.println("Se han iniciado las operaciones de mantenimiento.");
    }
}
