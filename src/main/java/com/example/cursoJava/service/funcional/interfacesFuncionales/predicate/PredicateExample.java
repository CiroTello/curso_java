package com.example.cursoJava.service.funcional.predicate;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
    Predicate es una interfaz funcional que representa una función que acepta un argumento de entrada y devuelve un valor booleano.
    Se utiliza comúnmente para evaluar condiciones o realizar filtrados.

    BiPredicate es similar a Predicate, pero acepta dos argumentos de entrada en lugar de uno.
 */
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
