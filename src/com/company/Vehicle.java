package com.company;

/**
 * Representa la clase abstracta Vehículo, con los atributos y métodos
 * comunes para los distintos tipos de naves.
 */
public abstract class Vehicle {
    /**
     * País de la nave.
     */
    private String country;

    /**
     * Peso de la nave.
     */
    private Double weight;

    /**
     * Altura de la nave.
     */
    private Double height;

    /**
     * Año de inicio de actividades de la nave.
     */
    private int startYear;

    /**
     * Año de fin de actividades de la nave.
     */
    private int endYear;

    /**
     * Compañía/s a la/s que pertenece la nave
     */
    private String[] company;

    /**
     * ¿La nave sigue en actividad?
     */
    private boolean isActive;

    /**
     * ¿La nave está destruída?
     */
    private boolean isDestroyed;

    /**
     * Velocidad de la nave.
     */
    protected int velocity;

    /**
     * Método para acelerar la nave
     */
    abstract void speedUp();

    /**
     * Método para calcular la trayectoria de la nave.
     */
    abstract void calculateTrajectory();

    /**
     * Método para frenar la nave.
     */
    abstract void stop();

    /**
     * @return Devuelve nombre del país
     */
    public String getCountry() {
        return country;
    }

    /**
     * Establece el nombre del país.
     * @param country: nombre del país, tipo de datos String.
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return Devuelve el peso de la nave
     */
    public Double getWeight() {
        return weight;
    }

    /**
     * Establece el peso de la nave
     * @param weight: peso de la nave, tipo de datos Double.
     */
    public void setWeight(Double weight) {
        this.weight = weight;
    }

    /**
     * @return Devuelve la altura de la nave.
     */
    public Double getHeight() {
        return height;
    }

    /**
     * Establece la altura de la nave
     * @param height: altura de la nave, tipo de datos Double.
     */
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * @return Devuelve el año de inicio de actividades de la nave.
     */
    public int getStartYear() {
        return startYear;
    }

    /**
     * Establece el año de inicio de actividades de la nave
     * @param startYear: año, tipo de datos Int.
     */
    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    /**
     * @return Devuelve el año de fin de actividad de la nave.
     */
    public int getEndYear() {
        return endYear;
    }

    /**
     * Establece el año de fin de actividad de la nave.
     * @param endYear: año, tipo de datos Int.
     */
    public void setEndYear(int endYear) {
        this.endYear = endYear;
    }

    /**
     * @return Devuelve la/s compañía/s a la/s que pertenece la nave.
     */
    public String[] getCompany() {
        return company;
    }

    /**
     * Establece la/s compañía/s a la/s que pertenece la nave.
     * @param company: compañía/s a la/s que pertenece la nave, tipo de datos Array de Strings.
     */
    public void setCompany(String[] company) {
        this.company = company;
    }

    /**
     * @return Devuelve verdadero si la nave sigue en actividad.
     */
    public boolean isActive() {
        return isActive;
    }

    /**
     *  Establece verdadero o falso, si la nave sigue o no en actividad
     * @param active tipo de datos boolean.
     */
    public void setActive(boolean active) {
        isActive = active;
    }

    /**
     * @return Devuelve verdadero si la nave está destruída.
     */
    public boolean isDestroyed() {
        return isDestroyed;
    }

    /**
     * Establece si la nave está destuída o no.
     * @param destroyed tipo de datos boolean.
     */
    public void setDestroyed(boolean destroyed) {
        isDestroyed = destroyed;
    }
}
