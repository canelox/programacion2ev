package org.example;
import  java.util.Scanner;
public class polimorfismo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tipo de vehiculo (co o ca): ");
        String tipoVehiculo = sc.nextLine();

        Vehiculo vehiculo;

        if (tipoVehiculo.equalsIgnoreCase("co")){
            Coche coche = new Coche();
            coche.solicitarInformacion(sc);
            vehiculo = coche;
        }else{
            Camion camion = new Camion();
            camion.solicitarInformacion(sc);
            vehiculo = camion;
        }
        vehiculo.mostrarVidaUtil();
        vehiculo.mostrarTipoVehiculo(vehiculo);
        sc.close();
    }
}
