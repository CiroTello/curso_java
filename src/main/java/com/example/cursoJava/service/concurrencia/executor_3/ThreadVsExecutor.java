package com.example.cursoJava.service.concurrencia.executor_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
    Comparación entre crear hilos manualmente y usar ExecutorService.
    Se crean 4 tareas que imprimen el nombre del hilo que las ejecuta.
    Con Threads se crean 4 hilos nuevos, mientras que con ExecutorService se usan 2 hilos del pool para ejecutar las 4 tareas.
*/
public class ThreadVsExecutor {
    public static void main (String[] args) {

        System.out.println("Con Threads --------------------------------");
        for (int i = 0; i < 4; i++) {
            new Thread(
                    () -> System.out.println("Tarea A con Thread: " + Thread.currentThread().getName())
            ).start();
        }

        System.out.println("Con ExecutorService ------------------------");
        ExecutorService executor = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 4; i++) {
            executor.execute(
                    () -> System.out.println("Tarea A con Executor: " + Thread.currentThread().getName())
            );
        }
        executor.shutdown();
    }
}
