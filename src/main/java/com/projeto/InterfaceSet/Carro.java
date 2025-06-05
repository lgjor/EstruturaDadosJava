package com.projeto.InterfaceSet;

import java.util.Objects;

public class Carro implements Comparable<Carro> {

    String marca;

    public Carro(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    // Se possuir a mesma referência em memória,
    // Se possuir a mesma classe e a mesma marca,
    // então é o mesmo objeto
    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Carro carro = (Carro) object;
        return Objects.equals(marca, carro.marca);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(marca);
    }

    @Override
    public String toString() {
        return "Carro{" +
                "marca='" + marca + '\'' +
                '}';
    }

    // Comparação de tamanho da String
//    @Override
//    public int compareTo(Carro o) {
//        if(this.marca.length() < o.marca.length()){
//            return -1;
//        }else if(this.marca.length() > o.marca.length()){
//            return 1;
//        }
//        return 0;
//    }
    // Comparação de ordem alfabética
    @Override
    public int compareTo(Carro o) {
        return this.getMarca().compareTo(o.getMarca());
    }
}
