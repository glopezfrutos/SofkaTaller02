package com.company;

/**
 * Representa las naves tripuladas.
 */
public abstract class MannedShip extends Vehicle implements Icommunicate {
    /**
     * Método para recibir a la tripulación
     */
    abstract void receiveCrew();

    /**
     * Método para despedir a la tripulación
     */
    abstract void ejectCrew();
}
