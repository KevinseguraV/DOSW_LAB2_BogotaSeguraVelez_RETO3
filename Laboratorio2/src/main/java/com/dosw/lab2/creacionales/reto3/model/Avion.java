package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Avion extends Vehiculo {

    public Avion(Categoria categoria) {
        super("Avión", categoria);
    }

    @Override
    protected void configurarPorCategoria() {

        switch (categoria) {
            case ECONOMICO:
                velocidadMaxima = 600;
                precio = 500000;
                equipamiento = "Cabina básica";
                break;

            case LUJO:
                velocidadMaxima = 900;
                precio = 2000000;
                equipamiento = "Jet ejecutivo";
                break;

            case USADO:
                velocidadMaxima = 550;
                precio = 350000;
                equipamiento = "Cabina estándar usada";
                break;
        }
    }
}
