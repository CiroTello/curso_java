package com.example.cursoJava.service.concurrencia.thread_1;

/*
    Extender la clase Thread para CREAR un hilo.
    Se debe sobrescribir el método run() para definir la tarea que realizará el hilo.
 */
public class ThreadExample extends Thread{
    private String name;

    public ThreadExample(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hilo " + name + " - Iteración " + i);

            try {
                Thread.sleep(2000); // Simula trabajo con una pausa
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main (String[] args) {
        System.out.println("Inicio: " + Thread.currentThread().getName());

        ThreadExample thread1 = new ThreadExample("A");
        ThreadExample thread2 = new ThreadExample("B");

        /*
              El método start() inicia la ejecución del hilo, llamando internamente al método run().
              No se debe llamar directamente al método run(), ya que esto no iniciaría un nuevo hilo,
              sino que ejecutaría el método en el hilo actual.
         */
        thread1.start();
        thread2.start();

        System.out.println("Fin: " + Thread.currentThread().getName());
    }
}
