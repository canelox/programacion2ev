package org.example;

import java.util.Scanner;

class Coche extends Vehiculo {
    Scanner sc = new Scanner(System.in);
    private int numPuertas;

    @Override
    public void solicitarInformacion() {
        this.solicitarInformacion(sc);
        System.out.println("Ingrese el numero de puertas: ");
        numPuertas = Integer.parseInt(sc.nextLine());
    }

    @Override
    public int calculaVidaUtil() {
        return 10;

    }

    @Override
    public void mostrarTipoVehiculo(Object coche) {
        if (numPuertas == 5) {
            System.out.println("Este coche es multiusos");
        } else if (numPuertas == 7) {
            System.out.println("Este coche es una Berlina.");
        } else if (numPuertas == 3) {
            System.out.println("Este coche es un Microcoche.");
        } else {
            System.out.println("Número de puertas no válido.");
        }
    }
}






