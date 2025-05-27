package com.projeto.Fila;

public class Fila<T> {

    private NoFila<T> refNoEntradaFila;

    public Fila() {
        this.refNoEntradaFila = null;
    }

    public boolean isEmpty() {
        return refNoEntradaFila == null;
    }

    public void enqueue(T object) {
        NoFila novoNo = new NoFila(object);
        novoNo.setRefNoFila(refNoEntradaFila);
        refNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()){
            NoFila primeiroNo = refNoEntradaFila; // Se a fila não estiver vazia, pega o primeiro nó
            while(true){ // Enquanto a referência não foi nula, pega o próximo nó
                if(primeiroNo.getRefNoFila() != null){
                    primeiroNo = primeiroNo.getRefNoFila();
                }else{
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    // Desenfilera e retorna o primeiro nó da fila
    public T dequeue(){
        if(!this.isEmpty()){
            NoFila primeiroNo = refNoEntradaFila;
            NoFila noAuxiliar = refNoEntradaFila;
            while(true){
                if(primeiroNo.getRefNoFila() != null){
                    noAuxiliar = primeiroNo;
                    primeiroNo = primeiroNo.getRefNoFila();
                }else{
                    noAuxiliar.setRefNoFila(null);
                    break;
                }
            }
            return (T) primeiroNo.getObject();
        }
        return null;
    }

    @Override
    public String toString() {
        String stringRetorno = "";
        NoFila noAuxiliar = refNoEntradaFila;

        if (refNoEntradaFila != null) {
            while (true) {
                stringRetorno += "[No{objeto=" + noAuxiliar.getObject() + "}]--->";
                if (noAuxiliar.getRefNoFila() != null) {
                    noAuxiliar = noAuxiliar.getRefNoFila();
                } else {
                    stringRetorno += "null";
                    break;
                }
            }
        } else {
            stringRetorno = "null";
        }

        return stringRetorno;
    }
}
