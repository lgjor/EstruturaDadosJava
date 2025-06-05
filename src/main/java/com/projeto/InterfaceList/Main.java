package com.projeto.InterfaceList;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Carro> ListaCarros = new ArrayList<>();

        ListaCarros.add(new Carro("Ford"));
        ListaCarros.add(new Carro("Chevrolet"));
        ListaCarros.add(new Carro("Volkswagen"));
        ListaCarros.add(new Carro("Fiat"));

        System.out.println(ListaCarros.contains(new Carro("Ford")));

        // Retorna o índice do elemento na lista
        System.out.println(ListaCarros.indexOf(new Carro("Fiat")));

        System.out.println(ListaCarros.remove(3));

        System.out.println(ListaCarros);

    }
}
