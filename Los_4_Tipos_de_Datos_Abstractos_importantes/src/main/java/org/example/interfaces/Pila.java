package org.example.interfaces;

/**
 * TDA Pila
 */
public interface Pila<T> {

    void apilar(T elemento);

    T desapilar();

    public T tope();

    int size();

    boolean estaVacia();
}