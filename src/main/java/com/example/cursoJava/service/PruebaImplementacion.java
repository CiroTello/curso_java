package com.example.cursoJava.service;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PruebaImplementacion {


    public static void main (String[] args) {
        Persona2 persona = new Persona2("Pedro");
        persona.modificar(persona);

        System.out.println(persona.getNombre()); // "Juan"

    }

}
