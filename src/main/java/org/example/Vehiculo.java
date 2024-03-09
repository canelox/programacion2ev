package org.example;

import java.util.Scanner;

public abstract class Vehiculo {
    protected String matricula;
    protected int km;
    protected int anoMatriculacion;

    public void solicitarInformacion(Scanner sc) {
        System.out.println("Identifica matricula: ");
        matricula = sc.nextLine();
        System.out.println("Identifica km: ");
        km = Integer.parseInt(sc.nextLine());
        System.out.println("Identifica año matricula");
        anoMatriculacion = sc.nextInt();
    }

    public abstract void solicitarInformacion();

    public int calculaVidaUtil() {
        return 0;
    }

    public void mostrarVidaUtil() {
        int vidaUtil = calculaVidaUtil();
        System.out.println("La vida util del vehiculo es: " + vidaUtil);

    }
    public <T> void mostarTipoVehiculo(T vehiculo){
        System.out.println("Este vehiculo es de tipo desconocido");
    }

    public abstract void mostrarTipoVehiculo(Object coche);
}
