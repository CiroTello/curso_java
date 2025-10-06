package com.example.CursoSpring.service.record;

import java.util.Objects;

/*
    Record es una clase inmutable, no se puede cambiar sus atributos
    - No tiene setters
    - Todos sus atributos son finales
    - No se puede heredar de un record
    - Se pueden añadir métodos estáticos y de instancia
    - Se pueden añadir constructores compactos y normales
 */
public record ProductDto(String name, double price) {

    public static String ATRIBUTO = "Hola";

    public ProductDto {
        Objects.requireNonNull(name);
    }

    public ProductDto(String name) {
        this(name, 0);
    }

    public static void methodStatic(){
        System.out.println("Hola, soy un método...");
    }
}