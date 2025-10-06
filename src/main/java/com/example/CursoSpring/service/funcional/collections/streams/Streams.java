package com.example.CursoSpring.service.funcional.collections.streams;

import java.util.Arrays;
import java.util.List;

/*
    * Stream es una secuencia de elementos que permite realizar operaciones funcionales sobre ellos.
        * Son inmutables, es decir, no modifican la colección original.
        *
        * Permiten operaciones:
        *       intermedias (filter, map, sorted) -> devuelven siempre un stream
        *       terminales (forEach, collect, toList, count) -> devuelven un resultado o efecto secundario
        *
        * Se pueden crear a partir de colecciones, arreglos, generadores, etc.
    * Soportan procesamiento paralelo para mejorar el rendimiento en grandes conjuntos de datos.
 */
public class Streams {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Apple", "Banana", "Orange", "Mango", "Anana");
        List<String> filterFruits = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .toList();

        System.out.println(filterFruits);

        //  Son CONSUMIBLES, es decir, una vez que se ha realizado una operación terminal, no se puede volver a utilizar el stream.
        //  filterFruits.forEach(System.out::println); // Esto lanzaría una excepción pq ya se consumio con el toList()

        // Son PEREZOSAS, es decir, las operaciones intermedias no se ejecutan hasta que se realiza una operación terminal.
        // Por ejemplo, si no se llama a toList() o forEach(), el filtro no se aplicará.
    }
}
