package com.github.poupitanques;


import com.github.poupitanques.proyecto.Coleccion;
import com.github.poupitanques.proyecto.Dimensiones;
import com.github.poupitanques.proyecto.Figura;
import com.github.poupitanques.proyecto.SuperHeroe;


public class Main {
    public static void main(String[] args) {
        SuperHeroe superHeroe1 = new SuperHeroe("LA VENGANZA (batman)");
        superHeroe1.setDescripcion("el murcielago de la noche vengozo");
        superHeroe1.setTieneCapa(true);

        Dimensiones dimensiones1 = new Dimensiones(2.0, 3.0, 1.5);
        Figura figura1 = new Figura("DC48234", 700.0, superHeroe1, dimensiones1);


        SuperHeroe superHeroe2 = new SuperHeroe("EL HOMBRE DE ACERO (superman)");
        superHeroe2.setDescripcion("el alien de kripton");
        superHeroe2.setTieneCapa(true);

        Dimensiones dimensiones2 = new Dimensiones(2.5, 2.1, 1.4);
        Figura figura2 = new Figura("DC12398", 850.0, superHeroe1, dimensiones1);


        Coleccion coleccion1 = new Coleccion("La megacoleccion lmao");
        coleccion1.agregarFigura(figura1);
        coleccion1.agregarFigura(figura2);

        System.out.println(coleccion1);
    }
}