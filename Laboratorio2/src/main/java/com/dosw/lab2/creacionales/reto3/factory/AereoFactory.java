package com.dosw.lab2.creacionales.reto3.factory;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;
import com.dosw.lab2.creacionales.reto3.model.*;

public class AereoFactory implements VehiculoFactory {

    private Categoria categoria;

    public AereoFactory(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public Vehiculo crearVehiculo(int modelo) {

        return switch (modelo) {
            case 1 -> new Avion(categoria);
            case 2 -> new Avioneta(categoria);
            case 3 -> new Helicoptero(categoria);
            default -> throw new IllegalArgumentException("Modelo inválido");
        };
    }
}
