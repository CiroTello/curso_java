package com.example.cursoJava.service.concurrencia.executor_3;

import jakarta.annotation.security.RunAs;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    ExecutorService se utiliza para manejar hilos.
    - Permite gestionar un pool de hilos y enviar tareas para su ejecución.
    - Se recomienda usar esta implementación en lugar de crear hilos manualmente.

    Existe 3 tipos principales de ExecutorService:
    1. newFixedThreadPool: Crea un pool con un número fijo de hilos.
    2. newCachedThreadPool: Crea un pool que puede crecer según la demanda.
    3. newSingleThreadExecutor: Crea un pool con un solo hilo.
 */
public class ExecutorExample {
    private static Runnable tarea () {
        Runnable task = () -> {
            System.out.println("Tarea " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // Simula trabajo con una pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Tarea " + Thread.currentThread().getName() + " finalizada");
        };
        return task;
    }

    public static void main(String[] args) {
        /*
            newFixedThreadPool: Crea un pool con un número fijo de hilos.
            Si todos los hilos están ocupados, las tareas adicionales esperan en una cola hasta que un hilo esté disponible.
         */
        System.out.println("Ejecutando newFixedThreadPool");
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++) {
            fixedThreadPool.execute(tarea());
        }
        fixedThreadPool.shutdown();

        /*
            newCachedThreadPool: Crea un pool que puede crecer según la demanda.
            Reutiliza hilos existentes si están disponibles, o crea nuevos hilos si es necesario.
            Los hilos que no se usan durante 60 segundos se eliminan del pool.
         */
        System.out.println("Ejecutando newCachedThreadPool");
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 5; i++) {
            cachedThreadPool.execute(tarea());
        }
        cachedThreadPool.shutdown();

        /*
            newSingleThreadExecutor: Crea un pool con un solo hilo.
            Las tareas se ejecutan secuencialmente en el mismo hilo.
         */
        System.out.println("Ejecutando newSingleThreadExecutor");
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            singleThreadExecutor.execute(tarea());
        }
        singleThreadExecutor.shutdown();
    }
}
