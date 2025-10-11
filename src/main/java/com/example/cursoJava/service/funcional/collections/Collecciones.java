package com.example.cursoJava.service.funcional.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Collecciones {
    public static void main (String[] args) {
        // Lista inmutable en tamaño y contenido
        List<Integer> numerosInmutables = List.of(1,2,3,4,5);
        numerosInmutables.forEach(System.out::println);

        // Lista de tamaño fijo pero modificable
        List<String> names = Arrays.asList("Juan", "Pablo", "Ana");
        names.forEach(System.out::println);
        /*
        Equivalente a:
            Consumer<String> print = name -> System.out.println(name);
            names.forEach(print);
         */

        // Lista modificable
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(n -> n % 2 == 0);
        numbers.forEach(System.out::println);

        // ==== Dato ====
        /*
            El removeIf es una funcion no pura porque modifica el estado de la lista original.
         */
    }
}
