package com.charlycimino.$14cicloforeach;

import java.util.ArrayList;

public class Consecionaria {

    private String nombre;
    private ArrayList<Auto> autos; // Una referencia a coleccion de autos, si no la instanciamos crea error null point

    // No se debe recibir en el constructor una colecion de autos, así este vacia
    // La clase que guarda a la coleccion es quien debe instanciarla en su constructor
    // Una clase abstracta no se puede instanciar
    // ArrayList hereda de Collection
    public Consecionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();
    }

    // Agregar autos a la concesionaria, pero sin devolver la referencia de la lista
    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    public void mostrarAutos() {
        if (autos.isEmpty()) {
            System.out.println("No hay autos");
        } else {
            //for (int i = 0; i < autos.size(); i++) {
            //    Auto a = autos.get(i);
            //    System.out.println(a);
            //}
            // Podemos recorrer cualquier tipo de coleccion como HashSet y demas...
            for (Auto carritos : autos) {
                System.out.println(carritos);
            }
        }
    }
}