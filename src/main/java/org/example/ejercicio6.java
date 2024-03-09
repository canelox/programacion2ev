package org.example;

import java.util.Scanner;

/**
 * @author fran
 */
public class ejercicio6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        String[] palabras = entrada.split(",");

        int contadorPalindromas = 0;

        contadorPalindromas = getContadorPalindromas(palabras, contadorPalindromas);

        System.out.println("Número de palabras palíndromas: " + contadorPalindromas);
        sc.close();
    }

    /**
     *
     * @param palabras
     * @param contadorPalindromas
     * @return
     */
    private static int getContadorPalindromas(String[] palabras, int contadorPalindromas) {
        for (String palabra : palabras) {
            palabra = palabra.trim();
            if (esPalindromo(palabra)) {
                contadorPalindromas++;
            }
        }
        return contadorPalindromas;
    }

    /**
     *
     * @param palabra
     * @return
     */
    private static boolean esPalindromo(String palabra) {
        int longuitud = palabra.length();

        for (int i = 0; i < longuitud / 2; i++) {
            if (palabra.charAt(i) != palabra.charAt(longuitud - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
