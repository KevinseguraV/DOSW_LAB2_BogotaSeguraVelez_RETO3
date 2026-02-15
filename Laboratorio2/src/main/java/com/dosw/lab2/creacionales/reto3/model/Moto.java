package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public class Moto extends Vehiculo {

    public Moto(Categoria categoria) {
        super("Moto", categoria);
    }

    @Override
    protected void configurarPorCategoria() {
        switch (categoria) {
            case ECONOMICO -> { velocidadMaxima = 140; precio = 10000; equipamiento = "Básico"; }
            case LUJO -> { velocidadMaxima = 280; precio = 35000; equipamiento = "Deportiva premium"; }
            case USADO -> { velocidadMaxima = 120; precio = 7000; equipamiento = "Usada funcional"; }
        }
    }
}
