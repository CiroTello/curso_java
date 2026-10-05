package com.example.cursoJava.service.concurrencia.callableYfuture_5;

import java.util.concurrent.*;

public class main {

    /*public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Crear un ExecutorService con un pool de 2 hilos
        ExecutorService executor = Executors.newFixedThreadPool(2);

        // Callable es una interfaz funcional, representa una tarea que devuelve un resultado y puede lanzar una excepción
        Callable<Integer> task1 = new SumCalculator(5, 10);

        // Future representa el resultado pendiente de una operación asincrónica
        Future<Integer> result = executor.submit(task1);

        while (!result.isDone()) {
            System.out.println("La suma está en proceso...");
            Thread.sleep(500); // Esperar medio segundo antes de verificar nuevamente
        }

        System.out.println("Resultado de la suma pendiente: " + result.get());
    }*/

    public static void main(String[] args) {
        String str1 = new String("Hola");
        String str2 = new String("Hola");

        if (str1 == str2) System.out.println("true 1");      // false (diferentes referencias en memoria)
        if (str1.equals(str2)) System.out.println("true 2");    // true (mismo contenido: "Hola")
    }
}
