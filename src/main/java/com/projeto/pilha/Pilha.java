package com.projeto.pilha;

public class Pilha {

    private NoPilha refNoEntradaPilha;

    public Pilha() {
        this.refNoEntradaPilha = null;
    }

    // Insere um novo elemento no topo da pilha
    public void push(NoPilha novoNo){
        NoPilha refAuxiliar = refNoEntradaPilha; // Armazena a referência do topo
        refNoEntradaPilha = novoNo; // Atualiza a referência do topo para o novo nó
        refNoEntradaPilha.setReferenciaNo(refAuxiliar); // O novo nó aponta para o anterior
    }

    // Remove o elemento do topo da pilha
    public NoPilha pop(){
        if(!this.isEmpty()){ // Verifica se a pilha não está vazia
            NoPilha noPoped = refNoEntradaPilha; // Armazena o nó a ser removido
            refNoEntradaPilha = refNoEntradaPilha.getReferenciaNo(); // Atualiza a referência do topo para o nó abaixo do topo
            return noPoped; // Retorna o nó removido
        }
        return null;
    }

    // Retorna o topo da pilha
    public NoPilha top(){
        return refNoEntradaPilha;
    }

    // Verifica se a pilha está vazia e retorna true se estiver
    public boolean isEmpty(){
        return refNoEntradaPilha == null;
    }

    @Override
    public String toString() {
        String stringRetorno = "---------------\n";
        stringRetorno += "     Pilha\n";
        stringRetorno += "---------------\n";
        NoPilha noAuxiliar = refNoEntradaPilha;

        while(true){
            if(noAuxiliar != null){ // Se a Pilha estiver com a ref de entrada nula, sai do loop com o break
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() + "}]\n"; // Pegamos o nó do topo da pilha
                noAuxiliar = noAuxiliar.getReferenciaNo(); // A referência do nó auxiliar passa para o nó abaixo dele
            }else{ // Se a Pilha estiver com a ref de entrada nula, sai do loop com o break
                break;
            }
        }
        stringRetorno += "===============\n";
        return stringRetorno;
    }
}
