package com.softtek.presentacion;

import java.util.Scanner;
import java.util.function.Function;

public class VerificacionPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingresa tu contraseña:");
        String password = scanner.nextLine();

        boolean isValid = validarPassword(password);
        System.out.println("¿La contraseña es válida? " + isValid);

        scanner.close();
    }

    public static boolean validarPassword(String password) {
        Function<String, Boolean> alMenosOchoCaracteres = str -> str.length() >= 8;
        Function<String, Boolean> alMenosUnaMayuscula = str -> !str.equals(str.toLowerCase());
        Function<String, Boolean> alMenosUnaMinuscula = str -> !str.equals(str.toUpperCase());
        Function<String, Boolean> alMenosUnNumero = str -> str.matches(".*\\d.*");
        Function<String, Boolean> alMenosUnCaracterEspecial = str -> str.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\"\\\\|,.<>\\/?].*");

        // Combinar las funciones utilizando operadores lógicos
        boolean isValid = alMenosOchoCaracteres.apply(password) &&
                alMenosUnaMayuscula.apply(password) &&
                alMenosUnaMinuscula.apply(password) &&
                alMenosUnNumero.apply(password) &&
                alMenosUnCaracterEspecial.apply(password);

        return isValid;
    }
}

