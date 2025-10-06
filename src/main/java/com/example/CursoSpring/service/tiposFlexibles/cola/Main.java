package com.example.CursoSpring.service.tiposFlexibles.cola;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("Dequeue: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Is Empty: " + queue.isEmpty());

        queue.printQueue();
    }
}
