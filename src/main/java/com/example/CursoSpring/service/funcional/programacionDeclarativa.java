package com.example.CursoSpring.service.funcional;

import java.util.function.Function;

/*
    Programación Declarativa
    - Se enfoca en el "qué" se quiere lograr, no en el "cómo" lograrlo.
    - Se basa en expresar la lógica del programa sin describir su control de flujo.
    - Ejemplos: SQL, HTML, lenguajes funcionales como Haskell.
    - Ventajas: Código más conciso y fácil de entender, menos propenso a errores.
    - Desventajas: Puede ser menos eficiente en términos de rendimiento, menos control sobre el flujo de ejecución.
 */
public class programacionDeclarativa {

    public static void main(String[] args) {
        funcionalProgramming();
    }

    public static void funcionalProgramming(){
        // Function es una interfaz funcional que representa una función que toma un argumento de tipo T y devuelve un resultado de tipo R.
        Function<Integer, Integer> addTwo = x -> x + 2;

        int result = addTwo.apply(3); // result es 5

        System.out.println(result);
    }
}
