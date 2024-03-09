package org.example;
import java.util.Scanner;
 class Camion extends Vehiculo{
     Scanner sc = new Scanner(System.in);
     private int tonelaje;
     private double altura;
     @Override
     public void solicitarInformacion(Scanner sc) {
        this.solicitarInformacion(sc);
         System.out.println("Ingrese el tonelaje: ");
         tonelaje = Integer.parseInt(sc.nextLine());
         System.out.println("Ingrese la altura");
         altura = Double.parseDouble(sc.nextLine());

     }

     @Override
     public void solicitarInformacion() {

     }

     @Override
    public int calculaVidaUtil(){
         return 5;
    }

     @Override
     public void mostrarTipoVehiculo(Object coche) {

     }
 }
