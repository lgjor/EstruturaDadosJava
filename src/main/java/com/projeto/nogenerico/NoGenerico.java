package com.projeto.nogenerico;

public class NoGenerico<T> {
    private T conteudo;
    private NoGenerico<T> proximoNoGenerico;

    public NoGenerico(T conteudo) {
        this.proximoNoGenerico = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoGenerico<T> getProximoNo() {
        return proximoNoGenerico;
    }

    public void setProximoNo(NoGenerico<T> proximoNoGenerico) {
        this.proximoNoGenerico = proximoNoGenerico;
    }

    @Override
    public String toString() {
        return "No{" +
                "conteudo='" + conteudo + '\'' +
                '}';
    }
}
