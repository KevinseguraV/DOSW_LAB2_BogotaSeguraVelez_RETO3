package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Auto extends Vehiculo {

    public Auto(Categoria categoria) {
        super("Auto", categoria);
    }

    @Override
    protected void configurarPorCategoria() {
        switch (categoria) {
            case ECONOMICO -> { velocidadMaxima = 160; precio = 30000; equipamiento = "Básico"; }
            case LUJO -> { velocidadMaxima = 250; precio = 80000; equipamiento = "Full equipo"; }
            case USADO -> { velocidadMaxima = 140; precio = 20000; equipamiento = "Estándar usado"; }
        }
    }
}
