package com.example.cursoJava.service.concurrencia.callableYfuture_5;

import java.util.concurrent.Callable;

/*
    * Clase que implementa Callable para sumar dos números
    * El metodo call() realiza la suma y devuelve el resultado
    *      Simula una tarea que toma tiempo con Thread.sleep
    *      Devuelve un Integer como resultado
    *      Puede lanzar una excepción
 */
public class SumCalculator implements Callable<Integer> {
    private int numero1;
    private int numero2;

    public SumCalculator(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    @Override
    public Integer call() throws Exception {
        Thread.sleep(2000);
        return numero1 + numero2;
    }
}
