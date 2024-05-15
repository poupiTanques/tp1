package com.github.poupitanques.proyecto;

@SuppressWarnings("unused")
public class Dimensiones {
    private double alto;
    private double ancho;
    private double profundidad;

    public Dimensiones() {
        this.alto = 0.0;
        this.ancho = 0.0;
        this.profundidad = 0.0;
    }

    public Dimensiones(double alto, double ancho, double profundidad) {
        this.alto = alto;
        this.ancho = ancho;
        this.profundidad = profundidad;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    public double getVolumen() {
        return alto * ancho * profundidad;
    }

    @Override
    public String toString() {
        return "Alto: " + alto + '\n' + "Ancho: " + ancho + '\n' + "Profundidad: " + profundidad + '\n' + "Volumen: " + this.getVolumen() + '\n';
    }
}
