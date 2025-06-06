package com.projeto.ListaCircular;

public class NoListaCircular <T> {

    private T conteudo;
    private NoListaCircular<T> noProximo;

    public NoListaCircular(T conteudo) {
        this.noProximo = null;
        this.conteudo = conteudo;
    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoListaCircular<T> getNoProximo() {
        return noProximo;
    }

    public void setNoProximo(NoListaCircular<T> noProximo) {
        this.noProximo = noProximo;
    }

    @Override
    public String toString() {
        return "NoListaCircular{" +
                "conteudo=" + conteudo +
                '}';
    }
}
