package com.softtek.presentacion;

import java.util.List;
import java.util.function.Function;

public class CalculoEstadisticas {
    public static void main(String[] args) {
        List<Double> numeros = List.of(1.0, 2.0, 3.0, 4.0, 5.0);

        Stats stats = calcularEstadisticas(numeros,
                list -> list.stream().min(Double::compare).orElse(0.0),
                list -> list.stream().max(Double::compare).orElse(0.0),
                list -> {
                    double sum = list.stream().mapToDouble(Double::doubleValue).sum();
                    return sum / list.size();
                });

        System.out.println("Estadísticas: " + stats);
    }

    public static Stats calcularEstadisticas(List<Double> numeros,
                                             Function<List<Double>, Double> minimo,
                                             Function<List<Double>, Double> maximo,
                                             Function<List<Double>, Double> media) {
        double min = minimo.apply(numeros);
        double max = maximo.apply(numeros);
        double mean = media.apply(numeros);

        return new Stats(min, max, mean);
    }
}





