package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class JetSki extends Vehiculo {

    public JetSki(Categoria categoria) {
        super("JetSki", categoria);
    }

    @Override
    protected void configurarPorCategoria() {
        switch (categoria) {
            case ECONOMICO -> { velocidadMaxima = 90; precio = 15000; equipamiento = "Básico"; }
            case LUJO -> { velocidadMaxima = 130; precio = 40000; equipamiento = "Premium deportivo"; }
            case USADO -> { velocidadMaxima = 80; precio = 10000; equipamiento = "Usado estándar"; }
        }
    }
}
