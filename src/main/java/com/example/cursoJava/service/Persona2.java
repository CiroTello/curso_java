package com.example.cursoJava.service;

public class Persona2{
    private String nombre;

    public Persona2 () {
    }

    public Persona2 (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void modificar(Persona2 p) {
        p.setNombre("Juan"); // ✅ SÍ modifica el objeto
        p = new Persona2();    // ❌ NO afecta la variable original
    }
}

