package com.projeto.ArvoreBinaria;

public class BinNo <T extends Comparable<T>> {

    private T conteudo;
    private BinNo<T> noEsquerdo;
    private BinNo<T> noDireito;

    public BinNo(T conteudo) {
        this.conteudo = conteudo;
        this.noEsquerdo = null;
        this.noDireito = null;
    }

    public BinNo(){}

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNo<T> getNoDireito() {
        return noDireito;
    }

    public void setNoDireito(BinNo<T> noDireito) {
        this.noDireito = noDireito;
    }

    public BinNo<T> getNoEsquerdo() {
        return noEsquerdo;
    }

    public void setNoEsquerdo(BinNo<T> noEsquerdo) {
        this.noEsquerdo = noEsquerdo;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + conteudo +
                '}';
    }
}
