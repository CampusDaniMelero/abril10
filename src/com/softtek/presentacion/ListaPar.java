package com.softtek.presentacion;

import com.sun.tools.javac.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class ListaPar {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);


        List<Integer> numerosPares = filtrar(numeros, num -> num % 2 == 0);



        System.out.println("Números pares: " + numerosPares);
    }

    public static List<Integer> filtrar(List<Integer> numeros, Function<Integer, Boolean> funcionFiltro) {
        List<Integer> resultado = new ArrayList<>();
        for (Integer num : numeros) {
            if (funcionFiltro.apply(num)) {
                resultado.add(num);
            }
        }

        return resultado;
    }

}
