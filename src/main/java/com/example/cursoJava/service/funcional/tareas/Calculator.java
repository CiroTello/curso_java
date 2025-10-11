package com.example.cursoJava.service.funcional.tareas;

public class Calculator {

    public static void operateAndPrint (int a, int b, Operation operation) {
        int result = operation.operate(a, b);
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {
        operateAndPrint(2 , 3 , (a,b) -> a+b); // Es lo mismo que (a,b) -> Integer::sum)

        operateAndPrint(8,4, Integer::divideUnsigned);
    }
}

@FunctionalInterface
interface Operation {
    int operate(int a, int b);
}
