package com.example.CursoSpring.service.funcional.lambda;

public class LambdaExample {

    public static void main(String[] args) {
        // forma tradicional de implementar una interfaz funcional
        Operation multiplication = new Operation() {
            @Override
            public int operate(int a, int b) {
                return a * b;
            }
        };

        // Uso de la interfaz funcional con una expresión lambda
        Operation addition = (a, b) -> a + b;
        System.out.println("Addition: " + addition.operate(5, 3));

        Operation subtraction = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtraction.operate(5, 3));

        // La interfaz funcional Operation tiene un método default llamado description.
        System.out.println(addition.description());

        // Uso de la lambda con body
        Operation division = (a, b) -> {
            if (b == 0) {
                throw new IllegalArgumentException("Division by zero");
            }
            return a / b;
        };



    }

    /*
         * Una interfaz funcional es una interfaz que contiene solo un método abstracto.
         * Pueden tener múltiples métodos default o estáticos.
         * Se utilizan como base para expresiones lambda y referencias a métodos en Java.
     */
    @FunctionalInterface
    interface Operation {
        int operate(int a, int b);

        default String description() {
            return "This is a binary operation";
        }
    }
}
