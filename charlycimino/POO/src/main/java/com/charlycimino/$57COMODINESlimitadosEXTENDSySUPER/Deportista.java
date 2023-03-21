package com.charlycimino.$57COMODINESlimitadosEXTENDSySUPER;

public class Deportista extends Persona implements Entrenable {

    private int energia;

    public Deportista(String nombre, String apellido, int energia) {
        super(nombre, apellido);
        this.energia = energia;
    }

    public void descansar() {
        this.energia = 100;
    }

    @Override
    public String toString() {
        return super.toString() + "que es Deportista{" + "energia=" + energia + '}';
    }

    @Override
    public void entrenar() {
        System.out.println("Entrenando...");
    }
}
