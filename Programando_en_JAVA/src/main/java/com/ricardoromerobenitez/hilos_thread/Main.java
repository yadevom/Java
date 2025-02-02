package com.ricardoromerobenitez.hilos_thread;

import java.time.LocalDateTime;

/**
 * La concurrencia es la capacidad de ejecutar varios programas o varias partes de un programa en paralelo.
 * Si una tarea que requiere mucho tiempo se puede realizar de forma asíncrona o en paralelo,
 * esto mejora el rendimiento y la interactividad del programa.
 *
 * Para ello en JAVA tenemos HILOS o THREADS, veremos como crearlos y usarlos en JAVA.
 */

/**
 * Los THREAD (Hilos) es el camino que sigue al ejecutar un programa
 *
 * Todo programa de Java tiene al menos un sub-proceso conocido como proceso principal
 * que es creado por la JVM al iniciar el programa que es cuando exactamente se invoca el metodo main
 *
 * Los hilos nos permite que un programa funcione de manera mas eficiente, para hacer varias cosas
 * al mismo tiempo, los subprocesos se utilizan para realizar tareas complicadas en segundo plano sin
 * interrumpir el programa principal
 */

/**
 * Hay 2 maneras de crear hilo en Java
 * 1. Extenderlo de la Clase Thread
 * 2. Implementando la interface Runnable
 */

public class Main {

    public static void main(String[] args) {

        System.out.println("Hola soy el hilo principal " + LocalDateTime.now());

        HiloThread hiloEjemplo = new HiloThread();
        hiloEjemplo.start();

        HiloRunnable ejecutableEjemplo = new HiloRunnable();
        Thread thread = new Thread(ejecutableEjemplo);
        thread.start();

        System.out.println("Adios soy el hilo principal " + LocalDateTime.now());
    }
}
