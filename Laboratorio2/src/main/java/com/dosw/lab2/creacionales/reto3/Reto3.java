package com.dosw.lab2.creacionales.reto3;

import com.dosw.lab2.creacionales.reto3.enums.Categoria;
import com.dosw.lab2.creacionales.reto3.factory.*;
import com.dosw.lab2.creacionales.reto3.model.Vehiculo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto3 {

    public static void ejecutar() {

        Scanner scanner = new Scanner(System.in);
        List<Vehiculo> carrito = new ArrayList<>();

        boolean continuar = true;

        while (continuar) {


            System.out.println("\nSeleccione el tipo de vehículo:");
            System.out.println("1. Tierra");
            System.out.println("2. Acuático");
            System.out.println("3. Aéreo");
            System.out.print("Ingrese opción: ");
            int tipo = Integer.parseInt(scanner.nextLine());


            System.out.println("\nSeleccione la categoría:");
            System.out.println("1. Económico");
            System.out.println("2. Lujo");
            System.out.println("3. Usado");
            System.out.print("Ingrese opción: ");
            int catInput = Integer.parseInt(scanner.nextLine());

            Categoria categoria = switch (catInput) {
                case 1 -> Categoria.ECONOMICO;
                case 2 -> Categoria.LUJO;
                case 3 -> Categoria.USADO;
                default -> throw new IllegalArgumentException("Categoría inválida");
            };

            VehiculoFactory factory = switch (tipo) {
                case 1 -> new TierraFactory(categoria);
                case 2 -> new AcuaticoFactory(categoria);
                case 3 -> new AereoFactory(categoria);
                default -> throw new IllegalArgumentException("Tipo inválido");
            };


            System.out.println("\nSeleccione el modelo de vehículo:");

            if (tipo == 1) { // Tierra
                System.out.println("1. Auto");
                System.out.println("2. Moto");
                System.out.println("3. Bicicleta");
            } else if (tipo == 2) { // Acuático
                System.out.println("1. Barco");
                System.out.println("2. Lancha");
                System.out.println("3. Yate");
            } else if (tipo == 3) { // Aéreo
                System.out.println("1. Avión");
                System.out.println("2. Avioneta");
                System.out.println("3. Helicóptero");
            }

            System.out.print("Ingrese opción: ");
            int modelo = Integer.parseInt(scanner.nextLine());

            Vehiculo vehiculo = factory.crearVehiculo(modelo);
            carrito.add(vehiculo);


            System.out.print("\n¿Desea agregar otro vehículo? (si/no): ");
            String respuesta = scanner.nextLine();
            continuar = respuesta.equalsIgnoreCase("si");
        }


        System.out.println("\n===== RESUMEN DE COMPRA =====");

        for (int i = 0; i < carrito.size(); i++) {
            carrito.get(i).mostrarInfo(i + 1);
        }

        double total = carrito.stream()
                .mapToDouble(Vehiculo::getPrecio)
                .sum();

        System.out.println("\nTotal a pagar: $" + total);

        scanner.close();
    }
}
