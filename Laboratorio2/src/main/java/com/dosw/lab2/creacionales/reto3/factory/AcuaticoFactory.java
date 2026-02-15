package com.dosw.lab2.creacionales.reto3.factory;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;
import com.dosw.lab2.creacionales.reto3.model.*;

public class AcuaticoFactory implements VehiculoFactory {

    private Categoria categoria;

    public AcuaticoFactory(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public Vehiculo crearVehiculo(int modelo) {

        return switch (modelo) {
            case 1 -> new Lancha(categoria);
            case 2 -> new Velero(categoria);
            case 3 -> new JetSki(categoria);
            default -> throw new IllegalArgumentException("Modelo inválido");
        };
    }
}
