package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Bicicleta extends Vehiculo {

    public Bicicleta(Categoria categoria) {
        super("Bicicleta", categoria);
    }

    @Override
    protected void configurarPorCategoria() {
        switch (categoria) {
            case ECONOMICO -> { velocidadMaxima = 40; precio = 500; equipamiento = "Básico"; }
            case LUJO -> { velocidadMaxima = 60; precio = 2000; equipamiento = "Carbono premium"; }
            case USADO -> { velocidadMaxima = 35; precio = 300; equipamiento = "Usada estándar"; }
        }
    }
}
