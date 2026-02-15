package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Lancha extends Vehiculo {

    public Lancha(Categoria categoria) {
        super("Lancha", categoria);
    }

    @Override
    protected void configurarPorCategoria() {
        switch (categoria) {
            case ECONOMICO -> { velocidadMaxima = 80; precio = 20000; equipamiento = "Básico acuático"; }
            case LUJO -> { velocidadMaxima = 120; precio = 100000; equipamiento = "Lujo marítimo"; }
            case USADO -> { velocidadMaxima = 70; precio = 15000; equipamiento = "Usada estándar"; }
        }
    }
}
