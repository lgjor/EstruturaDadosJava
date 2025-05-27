package com.projeto.ListaEncadeada;

public class NoListaEncadeada<T> {

    private T conteudo;
    private NoListaEncadeada<T> proximoNo;

    public NoListaEncadeada() {
        this.proximoNo = null;
    }

    public NoListaEncadeada(T conteudo) {
        this.conteudo = conteudo;
        this.proximoNo = null;
    }

    public NoListaEncadeada(T conteudo, NoListaEncadeada<T> proximoNo) {
        this.conteudo = conteudo;
        this.proximoNo = proximoNo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaEncadeada<T> getProximoNo() {
        return proximoNo;
    }

    public void setProximoNo(NoListaEncadeada<T> proximoNo) {
        this.proximoNo = proximoNo;
    }

    @Override
    public String toString() {
        return "NoListaEncadeada{" +
                "conteudo=" + conteudo +
                '}';
    }

    public String toStringEncadeado() {
        String str = "NoListaEncadeada{" +
                "conteudo=" + conteudo +
                '}';

        if (proximoNo != null) {
            str += "->" + proximoNo.toString();
        } else {
            str += "->null";
        }
        return str;
    }
}
