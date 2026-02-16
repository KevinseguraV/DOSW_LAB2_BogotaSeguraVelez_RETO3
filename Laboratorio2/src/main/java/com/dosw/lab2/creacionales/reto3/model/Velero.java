package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Velero extends Vehiculo {

    public Velero(Categoria categoria) {
        super("Velero", categoria);
    }

    @Override
    protected void configurarPorCategoria() {
        switch (categoria) {
            case ECONOMICO -> { velocidadMaxima = 50; precio = 30000; equipamiento = "Velas básicas"; }
            case LUJO -> { velocidadMaxima = 70; precio = 150000; equipamiento = "Velas premium"; }
            case USADO -> { velocidadMaxima = 45; precio = 20000; equipamiento = "Velero usado"; }
        }
    }
}
