package com.github.poupitanques.proyecto;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
public class Coleccion {
    private String nombre;
    private final ArrayList<Figura> figuras;

    public Coleccion(String nombre) {
        this.nombre = nombre;
        this.figuras = new ArrayList<>();
    }

    public Coleccion(String nombre, ArrayList<Figura> figuras) {
        this.nombre = nombre;
        this.figuras = figuras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarFigura(Figura figura) {
        figuras.add(figura);
    }

    public void subirPrecio(double cantidad, String id) {
        for (Figura figura : figuras) {
            if (figura.getCodigo() == id) {
                figura.subirPrecio(cantidad);
            }
        }
    }

    public Figura masValioso() {
        Figura figuraMasValiosa = null;
        double max = 0.0;
        for (Figura figura : figuras) {
            if (figura.getPrecio() > max) {
                max = figura.getPrecio();
                figuraMasValiosa = figura;
            }
        }
        return figuraMasValiosa;
    }

    public double getValorColeccion() {
        double valor_total = 0.0;
        for (Figura figura : figuras) {
            valor_total = valor_total + figura.getPrecio();
        }
        return valor_total;
    }

    public double getVolumenColeccion() {
        double volumen_total = 0.0;
        for (Figura figura : figuras) {
            volumen_total = volumen_total + figura.getDimensiones().getVolumen();
        }
        return volumen_total + 200.0;
    }

    public String conCapa() {
        String figurasConCapa = "";

        for (Figura figura : figuras) {
            if (figura.getSuperHeroe().getTieneCapa()) {
                figurasConCapa += figura.toString() + '\n';
            }
        }
        return figurasConCapa;
    }

    @Override
    public String toString() {
        String objeto = "Nombre de Coleccion: " + nombre + '\n' + "Figuras: " + '\n';

        for (Figura figura : figuras) {
            objeto += '\n';
            objeto += figura.toString();
            objeto += '\n';
        }

        return objeto;
    }
}
