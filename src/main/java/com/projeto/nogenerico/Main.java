package com.projeto.nogenerico;

public class Main {

    public static void main(String[] args) {
        NoGenerico<String> noGenerico1 = new NoGenerico<>("Conteudo no1");
        NoGenerico<String> noGenerico2 = new NoGenerico<>("Conteudo no2");

        // no1 aponta para no2
        noGenerico1.setProximoNo(noGenerico2);

        NoGenerico<String> noGenerico3 = new NoGenerico<>("Conteudo no3");

        // no2 aponta para no3
        noGenerico2.setProximoNo(noGenerico3);

        NoGenerico<String> noGenerico4 = new NoGenerico<>("Conteudo no4");

        // no3 aponta para no4 e no4 aponta para null
        noGenerico3.setProximoNo(noGenerico4);

        System.out.println(noGenerico1);
        System.out.println(noGenerico1.getProximoNo());

        System.out.println("---------------------------");

        System.out.println(noGenerico1); // Imprime o conteúdo do nó 1
        System.out.println(noGenerico1.getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 2
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 3
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 4
        System.out.println(noGenerico1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // Imprime null
    }
}
