package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Helicoptero extends Vehiculo {

    public Helicoptero(Categoria categoria) {
        super("Helicóptero", categoria);
    }

    @Override
    protected void configurarPorCategoria() {

        switch (categoria) {

            case ECONOMICO -> {
                velocidadMaxima = 250;
                precio = 400000;
                equipamiento = "Cabina básica aérea";
            }

            case LUJO -> {
                velocidadMaxima = 320;
                precio = 1500000;
                equipamiento = "Helicóptero ejecutivo VIP";
            }

            case USADO -> {
                velocidadMaxima = 220;
                precio = 300000;
                equipamiento = "Helicóptero usado estándar";
            }
        }
    }
}
