package com.campusdual.classroom;

import java.util.Stack;

public class Exercise25 {
    public static Stack<String> createStack() {
        Stack<String> pila = new Stack<>();

        pila.push("Smith");
        pila.push("Montessori");
        pila.push("Peralta");
        pila.push("House");

        //System.out.println(pila);

        return pila;
    }

    public static void printAndEmptyStack(Stack<String> stack) {
        for (int i = stack.size(); i >= 1; i--) {
            //System.out.println(stack.peek());
            System.out.println(stack.peek());
            stack.pop();
        }
    }

    public static void main(String[] args) {
        printAndEmptyStack(createStack());
    }



}
