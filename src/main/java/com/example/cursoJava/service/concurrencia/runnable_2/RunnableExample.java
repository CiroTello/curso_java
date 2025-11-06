package com.example.cursoJava.service.concurrencia.runnable_2;

/*
    Se implementa la interfaz Runnable y se sobrescribe el método run() para definir la tarea que realizará el hilo.

    Diferencia entre Runnable  y Thread:
    - Runnable es una interfaz funcional que define un solo método run(). Se utiliza para definir la tarea que se ejecutará en un hilo.
    - Thread es una clase que representa un hilo de ejecución. Puede ejecutar una instancia de Runnable.

    Usar Runnable es más flexible
    - Se puede pasar una instancia de Runnable a un objeto Thread para ejecutar la tarea en un hilo separado.
    - Despues se puede pasar otra instancia de Runnable al mismo Thread si se desea reutilizar el hilo para una tarea diferente.
 */
public class RunnableExample implements Runnable {
    private String name;

    public RunnableExample(String name) {
        this.name = name;
    }

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

        RunnableExample runnable1 = new RunnableExample("A");
        RunnableExample runnable2 = new RunnableExample("B");

        Thread thread1 = new Thread(runnable1);
        Thread thread2 = new Thread(runnable2);

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
