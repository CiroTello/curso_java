package com.example.CursoSpring.service.funcional.supplier;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {
        Supplier<Persona> personFactory = Persona::new; // new Persona();

        Persona p1 = personFactory.get();
        p1.setName("Gabriel");
        System.out.println(p1.getName());
    }
}
