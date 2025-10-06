package com.example.CursoSpring.service.tiposFlexibles.cola;


import java.util.LinkedList;
import java.util.NoSuchElementException;

public class Queue<T> {
    private final LinkedList<T> elementos = new LinkedList<>();

    public void enqueue(T elemento){
        elementos.add(elemento);
        System.out.println("Elemento " + elemento + " agregado a la cola.");
    }

    public boolean isEmpty(){
        return elementos.isEmpty();
    }

    public void printQueue(){
        elementos.forEach(e -> System.out.println("Elemento en la cola: " + e));
    }

    public T peek () {
        if (isEmpty()) {
            throw new NoSuchElementException("La cola está vacía.");
        }
        System.out.println("Primer elemento en la cola: " + elementos);
        return elementos.getFirst();
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía.");
        }
        System.out.println("Primer elemento removido de la cola: " + elementos);
        return elementos.removeFirst();
    }
}
