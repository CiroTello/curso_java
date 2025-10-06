package com.example.CursoSpring.service.tiposFlexibles.genericos;

import java.util.ArrayList;
import java.util.List;

import static com.example.CursoSpring.service.tiposFlexibles.genericos.WildCardService.*;

public class main {

    public static void main(String[] args) {

        // == Uso de Object ================================================

        // permite reutilizar código para distintos tipos de datos
        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add("1");

        // == Uso de genéricos ================================================

        // Uso de la clase genérica Box
        Box<String> boxString = new Box<>("Hola");
        Box<Integer> boxInteger = new Box<>(1);
        System.out.println(boxString.getValue());
        System.out.println(boxInteger.getValue());

        // Uso de metodo generico recibiendo un T (tipo genérico)
        genericosService.printItem("Gabriel", "2");
        genericosService.printItem(10);

        // Uso de metodo generico con restricción (T extiende de Number)
        genericosService.sum(2,2);
        genericosService.sum(2,4);


        // == Uso de comodines (wildcards) ============================================

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);

        // Uso de comodines (wildcards) -> Solo LECTURA
        printList(numbers);
        // Uso de comodines (wildcards) con extends -> Solo LECTURA
        sumNumbers(numbers);
        // Uso de comodines (wildcards) con super -> LECTURA y ESCRITURA
        addNumbers(numbers);
    }
}
