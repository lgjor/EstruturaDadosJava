package com.projeto.no;

public class Main {

    public static void main(String[] args) {
        No no1 = new No("Conteudo no1");
        No no2 = new No("Conteudo no2");

        // no1 aponta para no2
        no1.setProximoNo(no2);

        No no3 = new No("Conteudo no3");

        // no2 aponta para no3
        no2.setProximoNo(no3);

        No No4 = new No("Conteudo no4");

        // no3 aponta para no4 e no4 aponta para null
        no3.setProximoNo(No4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());

        System.out.println("---------------------------");

        System.out.println(no1); // Imprime o conteúdo do nó 1
        System.out.println(no1.getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 2
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 3
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // Imprime o conteúdo do nó 4
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo().getProximoNo()); // Imprime null
    }
}
