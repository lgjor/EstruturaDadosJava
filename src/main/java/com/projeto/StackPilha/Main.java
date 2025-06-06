package com.projeto.StackPilha;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("Ford"));
        stackCarros.push(new Carro("Chevrolet"));
        stackCarros.push(new Carro("Fiat"));

        System.out.println(stackCarros);
        System.out.println(stackCarros.pop());
        System.out.println(stackCarros);

        System.out.println(stackCarros.peek()); // Pega o elemento do topo da pilha sem remover
        System.out.println(stackCarros);

        System.out.println(stackCarros.empty()); // Verifica se a pilha está vazia
    }

}
