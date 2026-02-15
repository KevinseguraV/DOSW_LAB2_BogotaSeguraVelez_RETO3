package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Avioneta extends Vehiculo {

    public Avioneta(Categoria categoria) {
        super("Avioneta", categoria);
    }

    @Override
    protected void configurarPorCategoria() {

        switch (categoria) {

            case ECONOMICO -> {
                velocidadMaxima = 350;
                precio = 200000;
                equipamiento = "Cabina ligera básica";
            }

            case LUJO -> {
                velocidadMaxima = 500;
                precio = 800000;
                equipamiento = "Cabina ejecutiva premium";
            }

            case USADO -> {
                velocidadMaxima = 300;
                precio = 150000;
                equipamiento = "Avioneta usada funcional";
            }
        }
    }
}
