package com.projeto.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {

        // Quando a likedList implementa a interface Queue, temos uma implementação de fila em Java.
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ford"));
        queueCarros.add(new Carro("Chevrolet"));
        queueCarros.add(new Carro("Fiat"));

        // True - conseguiu adicionar, se não conseguir lança um erro
        System.out.println(queueCarros.add(new Carro("Peugeot")));

        // True - conseguiu adicionar, se não conseguir, nada acontece
        System.out.println(queueCarros.offer(new Carro("Renault")));

        // Retorna o primeiro elemento da fila, se estiver vazio, retorna null
        System.out.println(queueCarros.peek());

        // Retorna o primeiro elemento da fila e remove da fila
        System.out.println(queueCarros.poll());

        System.out.println(queueCarros.isEmpty());

        System.out.println(queueCarros.size());
    }
}
