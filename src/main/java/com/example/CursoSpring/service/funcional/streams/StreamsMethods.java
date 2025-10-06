package com.example.CursoSpring.service.funcional.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMethods {

    public static void main (String[] args) {
        List<String> names = List.of("Ana", "Luis", "Pedro", "Marta","Lucia", "Alan");

        // Filter: Filtra los elementos que cumplen una condición
        names = names.stream()
                .filter(name -> name.length() <= 4)
                .toList();

        // ForEach: Itera sobre los elementos
        names.forEach(System.out::println);

        // Map: Transforma los elementos aplicando una función
        List<Integer> lengthNames = names.stream()
                .map(String::length)
                .toList();

        // Sorted: Ordena los elementos
        List<List<Integer>> numbers = List.of(
                List.of(1,2,3),
                List.of(7,8,9),
                List.of(4,5,6)
        );
        List<Integer> flatMapNumbers = numbers.stream()
                .flatMap(List::stream)
                .toList();

        // Distinct: Elimina elementos duplicados y Sorted
        flatMapNumbers = flatMapNumbers.stream().sorted()
                .distinct()
                .toList();

        // Collector: Recoge los elementos en una colección específica
        Set<String> namesSet = names.stream()
                .filter(c -> c.startsWith("A"))
                .collect(Collectors.toSet());

        // Reduce: Reduce los elementos a un solo valor
        Integer sum = flatMapNumbers.stream()
                .reduce(0, Integer::sum); // (result, element) -> result + element
        System.out.println(sum);
    }
}
