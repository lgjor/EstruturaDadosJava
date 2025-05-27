package com.projeto.ListaEncadeada;

public class ListaEncadeada<T> {

    NoListaEncadeada<T> referenciaEntrada;

    public ListaEncadeada() {
        this.referenciaEntrada = null;
    }

    public boolean isEmpty() {
        return referenciaEntrada == null;
    }

    public int size(){
        int tamanhoLista = 0;
        NoListaEncadeada<T> referenciaAuxiliar = referenciaEntrada;
        while (true){
            if(referenciaAuxiliar != null){
                tamanhoLista++;
                if(referenciaAuxiliar.getProximoNo() != null){
                    referenciaAuxiliar = referenciaAuxiliar.getProximoNo();
                }else{
                    break;
                }
            }else{
                break;
            }
        }
        return tamanhoLista;
    }

    public void add (T conteudo){
        NoListaEncadeada<T> novoNo = new NoListaEncadeada<>(conteudo);
        if(this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }
        NoListaEncadeada<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size() - 1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        noAuxiliar.setProximoNo(novoNo);
    }

    private NoListaEncadeada<T> getNo(int index){

        validaIndice(index);
        NoListaEncadeada<T> noAuxiliar = referenciaEntrada;
        NoListaEncadeada<T> noRetorno = null;
        for(int i = 0; i <= index; i++){
            noRetorno = noAuxiliar;
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        return noRetorno;
    }

    private void validaIndice(int index){
        if(index >= size()){
            int ultimoIndice = size() - 1;
            throw new IndexOutOfBoundsException("Não existe conteúdo no índice " + index + " desta lista. Esta lista só vai até o índice " + ultimoIndice + ".");
        }
    }

    public T get(int index){
        return this.getNo(index).getConteudo();
    }

    public T remove(int index){
        validaIndice(index);
        NoListaEncadeada<T> noPivot = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivot.getProximoNo();
            return noPivot.getConteudo();
        }
        NoListaEncadeada<T> noAnterior = this.getNo(index - 1);
        noAnterior.setProximoNo(noPivot.getProximoNo());
        return noPivot.getConteudo();
    }

    @Override
    public String toString() {
        String strRetorno = "";
        NoListaEncadeada<T> noAuxiliar = referenciaEntrada;
        for(int i = 0; i < this.size(); i++){
            strRetorno += "[NoListaEncadeada{conteudo=" + noAuxiliar.getConteudo() + "}]--->";
            noAuxiliar = noAuxiliar.getProximoNo();
        }
        strRetorno += "null";
        return strRetorno;
    }
}
