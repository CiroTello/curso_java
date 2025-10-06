package com.example.CursoSpring.service.funcional.conceptos;

/*
    * Funciones de orden superior (Higher-Order Functions)
    * Una función de orden superior es una función que puede tomar otra función como argumento
    * o devolver una función como resultado. Esto permite un alto grado de abstracción y reutilización
    * de código.
 */
public class funcionesSuperiores {

    public static void main (String[] args) {
        applyOperation(5, x -> x * x); // Cuadrado

        applyOperation(2, x -> x + 10); // Sumar 10
    }

    private static void applyOperation(int value, Operation operation) {
        int result = operation.compute(value);
        System.out.println("Resultado: " + result);
    }
}

@FunctionalInterface
interface Operation {
    int compute(int x);
}
