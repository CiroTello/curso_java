package com.example.cursoJava.service.funcional.consumer;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/*
    Consumer es una interfaz funcional que representa una operación que acepta un solo argumento de entrada y no devuelve ningún resultado.
    Se utiliza comúnmente para realizar operaciones que tienen efectos secundarios, como imprimir en la consola, modificar objetos, etc.

    BiConsumer es similar a Consumer, pero acepta dos argumentos de entrada en lugar de uno.
 */
public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<String> printUpper = (s) -> System.out.println(s.toUpperCase());
        printUpper.accept("Buenas tardes");

        BiConsumer<String, Integer> repeat = (word, times) -> {
            for(int i =0; i<times; i++){
                System.out.println(word);
            }
        };

        repeat.accept("Hola", 3);
    }
}
