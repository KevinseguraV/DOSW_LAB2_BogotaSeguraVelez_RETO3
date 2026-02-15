package com.dosw.lab2.creacionales.reto3.factory;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;
import com.dosw.lab2.creacionales.reto3.model.*;

public class TierraFactory implements VehiculoFactory {

    private Categoria categoria;

    public TierraFactory(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public Vehiculo crearVehiculo(int modelo) {
        return switch (modelo) {
            case 1 -> new Auto(categoria);
            case 2 -> new Bicicleta(categoria);
            case 3 -> new Moto(categoria);
            default -> throw new IllegalArgumentException("Modelo inválido");
        };
    }
}
