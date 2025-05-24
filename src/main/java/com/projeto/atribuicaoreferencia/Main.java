package com.projeto.atribuicaoreferencia;

public class Main {

    public static void main(String[] args) {

        // Atribuição de objetos primitos
        // Com tipo primitivo, copiamos o valor em memória;
        int intA = 1;
        int intB = intA;

        System.out.println("intA: " + intA + " intB: " + intB); // intA: 1 intB: 1
        intA = 2;
        System.out.println("intA: " + intA + " intB: " + intB); // intA: 2 intB: 1

        // Atribuição de objetos por referência
        // Com tipo referência, copiamos o endereço de memória;
        MeuObj meuObjA = new MeuObj(1);
        MeuObj meuObjB = meuObjA;
        System.out.println("meuObjA: " + meuObjA + " meuObjB: " + meuObjB); // meuObjA: 1 meuObjB: 1
        meuObjA.setNum(2);
        System.out.println("meuObjA: " + meuObjA + " meuObjB: " + meuObjB); // meuObjA: 2 meuObjB: 2

    }
}