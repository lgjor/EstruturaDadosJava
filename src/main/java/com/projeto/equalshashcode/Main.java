package com.projeto.equalshashcode;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Carro> listCarros = new ArrayList<>();

        listCarros.add(new Carro("Ford"));
        listCarros.add(new Carro("Chevrolet"));
        listCarros.add(new Carro("Fiat"));

        // Usa o metodo equals e hashcode para verificar se contém
        System.out.println(listCarros.contains(new Carro("Ford")));

        // Ao instanciar um novo carro com a mesma marca,
        // utiliza o mesmo hashcode,
        // pois está comparando o nome da marca
        // para definir se são iguais
        System.out.println((new Carro("Ford").hashCode()));
        System.out.println((new Carro("Ford").hashCode()));

        Carro carro1 = new Carro("Ford");
        Carro carro2 = new Carro("Ford");

        System.out.println(carro1.equals(carro2)); // true, pois ambos possuem a mesma marca


    }

}
