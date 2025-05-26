package com.projeto.pilha;

public class NoPilha {

    private int dado;

    private NoPilha referenciaNo = null;

    public NoPilha() {
    }

    public NoPilha(int dado) {
        this.dado = dado;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public NoPilha getReferenciaNo() {
        return referenciaNo;
    }

    public void setReferenciaNo(NoPilha referenciaNo) {
        this.referenciaNo = referenciaNo;
    }

    @Override
    public String toString() {
        return "NoPilha{" +
                "dado=" + dado +
                '}';
    }
}
