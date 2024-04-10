package com.softtek.presentacion;

public class Stats {
    private double minimo;
    private double maximo;
    private double media;

    public Stats(double minimo, double maximo, double media) {
        this.minimo = minimo;
        this.maximo = maximo;
        this.media = media;
    }

    @Override
    public String toString() {
        return "Mínimo: " + minimo + ", Máximo: " + maximo + ", Media: " + media;
    }
}