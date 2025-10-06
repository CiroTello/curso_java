package com.example.CursoSpring.service.funcional.conceptos;

/*
     * Una función pura es una función cuyo valor de retorno solo está determinado por sus valores de entrada,
     * sin efectos secundarios observables. Esto significa que para la misma entrada, una función pura siempre
     * devolverá la misma salida y no modifica ningún estado externo.
 */
public class funcionalPuro {
    public static int multiplyByTwo(int number) {
        return number * 2;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = multiplyByTwo(number);
        System.out.println("Result: " + result); // Output: Result: 10
    }
}
