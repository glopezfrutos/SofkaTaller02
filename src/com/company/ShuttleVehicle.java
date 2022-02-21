package com.company;

/**
 * Representa los vehículos de lanzadera.
 */
public class ShuttleVehicle extends Vehicle {
    private Double capacity;
    private boolean isLoaded;

    /**
     * @return Devuelve la capacidad de la nave de lanzadera.
     */
    public Double getCapacity() {
        return capacity;
    }

    /**
     * Establece la capacidad del vehículo de lanzadera.
     * @param capacity Capacidad del vehículo, tipo de datos Double.
     */
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    /**
     * @return Devuelve si el vehículo de lanzadera está cargado.
     */
    public boolean isLoaded() {
        return isLoaded;
    }

    /**
     * Establece si el vehículo de lanzadera está cargado.
     * @param loaded tipo de datos boolean.
     */
    public void setLoaded(boolean loaded) {
        isLoaded = loaded;
    }


    /**
     * Método para acelerar la nave
     */
    @Override
    void speedUp() {
        velocity = 10000;
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
}
