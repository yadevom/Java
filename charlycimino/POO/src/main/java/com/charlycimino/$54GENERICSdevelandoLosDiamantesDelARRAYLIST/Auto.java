package com.charlycimino.$54GENERICSdevelandoLosDiamantesDelARRAYLIST;

public class Auto {

    private String patente;
    private String color;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "patente='" + patente + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
