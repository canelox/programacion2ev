package org.example;

import java.util.regex.*;
import java.util.Scanner;

/**
 *
 * @author fran
 *
 */

public class ejercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String entrada = sc.nextLine();

        String regex = "^[a-zA-Z]+$";

        Pattern pattern = Pattern.compile(regex);

        Matcher matcher = pattern.matcher(entrada);

        if (matcher.matches()) {

            System.out.println("Texto: " + entrada + " - ¿Cumple?: true");

        } else {
            System.out.println("Texto: " + entrada + " - ¿Cumple?: false");
        }
        sc.close();
    }
}