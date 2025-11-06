package com.example.cursoJava.service.tiposFlexibles.generics;

import org.springframework.stereotype.Service;

@Service
public class genericosService {

    public static <T> void printItem(T value) {
        System.out.println(value);
    }

    public static <T, K> void printItem(T value, K key){
        System.out.println(value + " " + key);
    }

    public static <T extends Number> double sum(T a, T b){
        return a.doubleValue() + b.doubleValue();
    }

    // No existe super en tipos genéricos
    /*public static <T super Number> double elevarAlCuadrado(T a){
        return a*a;
    }*/
}
