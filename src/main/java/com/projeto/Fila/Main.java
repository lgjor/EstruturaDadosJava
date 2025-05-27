package com.projeto.Fila;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<String>();
        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");

        System.out.println("Minha Fila: "+minhaFila);

        System.out.println("Desenfileirado: "+ minhaFila.dequeue());

        System.out.println("Minha Fila: "+minhaFila);

        System.out.println("Entrando na fila..");
        minhaFila.enqueue ( "ultimo" );

        System.out.println("Minha Fila: "+minhaFila);



    }
}
