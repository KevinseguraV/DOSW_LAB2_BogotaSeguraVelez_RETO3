package com.dosw.lab2.creacionales.reto3.factory;

import com.dosw.lab2.creacionales.reto3.model.Vehiculo;

public interface VehiculoFactory {
    Vehiculo crearVehiculo(int modelo);
}
