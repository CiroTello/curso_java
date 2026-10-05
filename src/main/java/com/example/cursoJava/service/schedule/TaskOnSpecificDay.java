package com.example.cursoJava.service.schedule;

import java.time.LocalDateTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class TaskOnSpecificDay {
    public static void main (String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2025, 12, 8, 12, 59); // 25 de diciembre de 2024 a las 10:00 AM

        LocalDateTime now = LocalDateTime.now();

        long delay = java.time.Duration.between(now, dateTime).toMillis();

        if (delay < 0) {
            System.out.println("la fecha ya pasó.");
            return;
        }

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
        executorService.schedule(() -> {
            System.out.println("¡Feliz Navidad! Ejecutando tarea especial el 25 de diciembre.");
            executorService.shutdown();
        }, delay, java.util.concurrent.TimeUnit.MILLISECONDS);
    }
}
