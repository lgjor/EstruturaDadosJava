package com.projeto.ListaCircular;

public class Main {

    public static void main(String[] args) {
        ListaCircular<String> minhaListaCircular = new ListaCircular();

        System.out.println("Adicionando c0");
        minhaListaCircular.add("c0");
        System.out.println("Resultado: "+minhaListaCircular);
        System.out.println("Removendo c0");
        minhaListaCircular.remove(0);
        System.out.println("Resultado: "+minhaListaCircular);

        System.out.println("Adicionando c1, c2 e c3");
        minhaListaCircular.add("c1");
        minhaListaCircular.add("c2");
        minhaListaCircular.add("c3");
        System.out.println("Resultado: "+minhaListaCircular);

        System.out.println("get índice 0");
        System.out.println("Resultado: "+minhaListaCircular.get(0));
        System.out.println("get índice 1");
        System.out.println("Resultado: "+minhaListaCircular.get(1));
        System.out.println("get índice 2");
        System.out.println("Resultado: "+minhaListaCircular.get(2));
        System.out.println("get índice 3");
        System.out.println("Resultado: "+minhaListaCircular.get(3));

    }
}
