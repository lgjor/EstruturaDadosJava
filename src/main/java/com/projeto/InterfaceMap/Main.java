package com.projeto.InterfaceMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        // Retorna todas as chaves do Map
        System.out.println(aluno.keySet());
        // Retorna todos os valores do Map
        System.out.println(aluno.values());

        List<Map<String, String>> ListaAlunos = new ArrayList<>();

        ListaAlunos.add(aluno);

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "9");
        aluno2.put("Turma", "3b");

        ListaAlunos.add(aluno2);

        System.out.println(ListaAlunos);

        // Retorna se a chave Nome existe no Map
        System.out.println(aluno.containsKey("Nome"));

    }
}
