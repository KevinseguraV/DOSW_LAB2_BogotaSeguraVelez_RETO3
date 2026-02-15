package com.dosw.lab2.creacionales.reto3.model;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;

public abstract class Vehiculo {

    protected String tipo;
    protected Categoria categoria;
    protected int velocidadMaxima;
    protected double precio;
    protected String equipamiento;

    public Vehiculo(String tipo, Categoria categoria) {
        this.tipo = tipo;
        this.categoria = categoria;
        configurarPorCategoria();
    }

    protected abstract void configurarPorCategoria();

    public double getPrecio() {
        return precio;
    }

    public void mostrarInfo(int numero) {
        System.out.println("\nVehículo " + numero + ":");
        System.out.println("Tipo: " + tipo);
        System.out.println("Categoría: " + categoria);
        System.out.println("Velocidad máxima: " + velocidadMaxima + " km/h");
        System.out.println("Precio: $" + precio);
        System.out.println("Equipamiento: " + equipamiento);
    }
}
