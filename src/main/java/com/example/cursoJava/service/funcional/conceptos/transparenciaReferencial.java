package com.example.cursoJava.service.funcional.conceptos;

public class transparenciaReferencial {
    public static int triple (int x){
        return x*3;
    }

    public static void main (String[] args) {
        int resultado2 = triple(3) + 2; // 11
        int resultado1 = 9 + 2; // 11

        System.out.println("Resultado1: " + resultado1);
        System.out.println("Resultado2: " + resultado2);

        /*
        La transparencia referencial es una propiedad de las expresiones en programación funcional
        que indica que una expresión puede ser reemplazada por su valor sin cambiar el comportamiento
        del programa. En otras palabras, si una función es pura (es decir, siempre produce el mismo
        resultado para los mismos argumentos y no tiene efectos secundarios), entonces podemos sustituir
        la llamada a esa función por su resultado sin afectar el resto del programa.
         */
    }
}
