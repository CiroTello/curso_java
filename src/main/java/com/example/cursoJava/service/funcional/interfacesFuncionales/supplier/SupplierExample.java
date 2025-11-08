package com.example.cursoJava.service.funcional.supplier;

import java.util.function.Supplier;

/*
    Supplier es una interfaz funcional que representa una función que no acepta argumentos de entrada pero produce un resultado.
    Se utiliza comúnmente para generar o suministrar valores, como crear objetos, obtener datos de una fuente externa, etc.
 */
public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Persona> personFactory = Persona::new; // new Persona();

        Persona p1 = personFactory.get();
        p1.setName("Gabriel");
        System.out.println(p1.getName());
    }
}
