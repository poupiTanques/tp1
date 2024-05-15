package com.github.poupitanques.proyecto;

@SuppressWarnings("unused")
public class Figura {
    private String codigo;
    private double precio;
    private SuperHeroe superHeroe;
    private Dimensiones dimensiones;

    public Figura(String codigo, double precio, SuperHeroe superHeroe, Dimensiones dimensiones) {
        this.codigo = codigo;
        this.precio = precio;
        this.superHeroe = superHeroe;
        this.dimensiones = dimensiones;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public SuperHeroe getSuperHeroe() {
        return superHeroe;
    }

    public void setSuperHeroe(SuperHeroe superHeroe) {
        this.superHeroe = superHeroe;
    }

    public Dimensiones getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(Dimensiones dimensiones) {
        this.dimensiones = dimensiones;
    }

    public void subirPrecio(double cantidad) {
        this.precio = precio + cantidad;
    }

    @Override
    public String toString() {
        return "Codigo: " + codigo + '\n' + "Precio: " + precio + '\n' + "SuperHeroe: ------\n" + superHeroe.toString() + '\n' + "Dimensiones: ------\n" + dimensiones.toString() + '\n';
    }
}
