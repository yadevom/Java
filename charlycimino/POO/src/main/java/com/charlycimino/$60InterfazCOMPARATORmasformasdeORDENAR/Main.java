package com.charlycimino.$60InterfazCOMPARATORmasformasdeORDENAR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(33);
        numeros.add(11);
        numeros.add(44);
        numeros.add(22);

        ArrayList<String> colores = new ArrayList<>();
        colores.add("Celeste");
        colores.add("Blanco");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Azul");

        ArrayList<Auto> autos = new ArrayList<>();
        autos.add(new Auto("ASD534", 3333));
        autos.add(new Auto("WRV365", 1111));
        autos.add(new Auto("VFE587", 4444));
        autos.add(new Auto("BGFD69", 5555));
        autos.add(new Auto("AER358", 2222));

        //Comparar por enteros
        //Collections.sort(numeros, new ComparadorDeEnteros());

        //Comparar por cadenas
        //Collections.sort(colores, new ComparadorDeCadenas());

        //Comparar por patente
        //Collections.sort(autos, new ComparadorDeAutosPorPatente());

        //Comparar por kms
        /**
         * Se piensa que el comparar para ascendente o descendente involucra tener dos comparadores distintos
         * Pero podemos tenerlo en uno solo y cambiar el comportamiento
         */
        Collections.sort(autos, new ComparadorDeAutosPorKilometraje(false));

        mostrarLista(autos);

    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}
