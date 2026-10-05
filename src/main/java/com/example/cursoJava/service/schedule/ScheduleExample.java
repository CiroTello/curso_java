package com.example.cursoJava.service.schedule;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class ScheduleExample {
    public static void main (String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(2);

        executorService.schedule( () -> {
            System.out.println("Tarea programada ejecutada después de 5 seg.");
        }, 5, java.util.concurrent.TimeUnit.SECONDS);

        // Apagar el executorService, hace que no acepte nuevas tareas pero espera a que las tareas en curso terminen
        executorService.shutdown();

        executorService.schedule( () -> {
            System.out.println("Tarea programada ejecutada después de 4 seg.");
        }, 4, java.util.concurrent.TimeUnit.SECONDS);

        // Limitar repeticiones
        Runnable task = new Runnable() {
            int counter = 0;
            @Override
            public void run() {
                System.out.println("Tarea repetitiva ejecutada cada 3 seg.");
                counter++;
                if (counter >= 3) {
                    executorService.shutdown();
                }
            }
        };
        executorService.scheduleAtFixedRate(task, 0, 3, java.util.concurrent.TimeUnit.SECONDS);
    }
}
