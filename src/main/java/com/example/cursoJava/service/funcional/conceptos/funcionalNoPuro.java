package com.example.cursoJava.service.funcional.conceptos;

/*
    * Una función no pura es aquella que:
    * 1. Tiene efectos secundarios: Modifica algún estado externo o variable global.
    * 2. No siempre devuelve el mismo resultado para los mismos argumentos: Depende de
    *   factores externos o estados cambiantes.
    * 3. Interactúa con el mundo exterior: Puede leer o escribir en bases de datos,
 */
public class funcionalNoPuro {
    static int contador = 0;

    public static int incrementarCounter(int valor) {
        contador += valor;
        return contador;
    }

    public static void main(String[] args) {
        System.out.println(incrementarCounter(5)); // Output: 5
        System.out.println(incrementarCounter(5)); // Output: 10
    }
}
