package com.example.cursoJava.service.funcional.function;

import java.util.function.BiFunction;
import java.util.function.Function;

/*
    Function es una interfaz funcional que representa una función que acepta un argumento de entrada y produce un resultado.
    Se utiliza comúnmente para transformar datos o realizar cálculos.

    BiFunction es similar a Function, pero acepta dos argumentos de entrada en lugar de uno.
 */
public class FunctionExample {
    public static void main(String[] args) {
        Function<String, Integer> stringLength = String::length;
        int length = stringLength.apply("Programación");
        System.out.println("La longitud es: " + length);

        BiFunction<Integer, Integer, String> sumToString = (a, b) -> "Resultado: " + (a + b);

        String result = sumToString.apply(7, 5);

        System.out.println(result);
    }
}
