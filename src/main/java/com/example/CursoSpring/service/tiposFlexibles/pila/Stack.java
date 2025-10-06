package com.example.CursoSpring.service.tiposFlexibles.pila;

import java.util.ArrayList;
import java.util.List;

public class Stack <T> {
    private List<T> elementos = new ArrayList<>();

    public void push(T elemento){
        elementos.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la pila.");
    }

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        System.out.println("Elemento en la cima de la pila: " + elementos.get(elementos.size() - 1));
        return elementos.get(elementos.size() - 1);
    }

    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("La pila está vacía.");
        }
        T elemento = elementos.remove(elementos.size() - 1);
        System.out.println("Elemento " + elemento + " removido de la pila.");
        return elemento;
    }
}
