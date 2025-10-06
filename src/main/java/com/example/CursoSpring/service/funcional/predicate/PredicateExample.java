package com.example.CursoSpring.service.funcional.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateExample {
    public static void main (String[] args) {
        // == Predicate simple ==
        Predicate<Integer> esPar = x -> x % 2 == 0;

        boolean result = esPar.test(4);  // test es el metodo abstracto de la interfaz Predicate que aplica la lógica definida en la lambda
        System.out.println("¿4 es par? " + result);

        // == Predicate doble ==
        BiPredicate<String, Integer> esLongitudMayorQue = (cadena, longitud) -> cadena.length() > longitud;
        boolean result2 = esLongitudMayorQue.test("Hola", 3);
        System.out.println("¿La longitud de 'Hola' es mayor que 3? " + result2);
    }
}
