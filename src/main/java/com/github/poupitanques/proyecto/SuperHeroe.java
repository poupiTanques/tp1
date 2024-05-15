package com.github.poupitanques.proyecto;

@SuppressWarnings("unused")
public class SuperHeroe {
    private String nombre;
    private String descripcion;
    private boolean tieneCapa;

    public SuperHeroe(String nombre) {
        this.nombre = nombre;
        this.descripcion = "";
        this.tieneCapa = false;
    }

    public SuperHeroe(String nombre, String descripcion, boolean capa) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tieneCapa = capa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean getTieneCapa() {
        return tieneCapa;
    }

    public void setTieneCapa(boolean tieneCapa) {
        this.tieneCapa = tieneCapa;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + '\n' + "Descripcion: " + descripcion + '\n' + "Tiene Capa: " + tieneCapa + '\n';
    }
}
