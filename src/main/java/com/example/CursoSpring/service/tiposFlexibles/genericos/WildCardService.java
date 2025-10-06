package com.example.CursoSpring.service.tiposFlexibles.genericos;

import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class WildCardService {

    // List<?>: una lista de cualquier tipo -> Solo LECTURA
    public static void printList(List<?> list){
        // list.add("hola");  // no compila
        for (Object o: list){
            System.out.println(o);
        }
    }

    // extends: acota el tipo desconocido a un subtipo de Number -> Solo LECTURA de numbers
    public static void sumNumbers(List<? extends Number> numbers){
        double sum = 0;
        for (Number num: numbers){
            sum += num.doubleValue();
        }
        System.out.println(sum);
    }

    // super: acota el tipo desconocido a un supertipo de Integer -> LECTURA y ESCRITURA de numbers
    public static void addNumbers(List<? super Integer> numbers) {
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        Object num = numbers.get(0);

        System.out.println(num);
    }
}