package com.projeto.ListaCircular;

public class ListaCircular<T> {

    private NoListaCircular<T> cabeca;
    private NoListaCircular<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    private NoListaCircular<T> getNo(int index) {
        if (this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!");
        if (index == 0)
            return this.cauda;
        NoListaCircular<T> noAuxiliar = this.cauda;
        for (int i = 0; (i < index); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return noAuxiliar;
    }

    public void add(T conteudo) {
        NoListaCircular<T> novoNo = new NoListaCircular<>(conteudo);
        if (this.tamanhoLista == 0) {
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cabeca.setNoProximo(cauda);
        } else {
            novoNo.setNoProximo(this.cauda);
            this.cabeca.setNoProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista) {
            throw new IndexOutOfBoundsException("Índice é maior que o tamanho da lista!");
        }
        NoListaCircular<T> noAuxiliar = this.cauda;
        if (index == 0) { // remover a cauda
            this.cauda = this.cauda.getNoProximo();
            this.cabeca.setNoProximo(this.cauda);
        } else if (index == 1) { // remover o próximo da cauda
            this.cauda.setNoProximo(this.cauda.getNoProximo());
        } else { // remover um nó qualquer
            for (int i = 0; i < index - 1; i++) {
                noAuxiliar = noAuxiliar.getNoProximo();
            }
            noAuxiliar.setNoProximo(noAuxiliar.getNoProximo().getNoProximo());
        }
        this.tamanhoLista--;
    }

    public T get(int index) {
        return this.getNo(index).getConteudo();
    }

    public boolean isEmpty(){
        return (this.tamanhoLista == 0);
    }

    public int size(){
        return this.tamanhoLista;
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoListaCircular<T> noAuxiliar = this.cauda;
        for (int i = 0; i< this.size(); i++){
            strRetorno += "[No{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        strRetorno += this.size() != 0 ? "(Retorna ao início)" : "[]";
        return strRetorno;
    }
}
