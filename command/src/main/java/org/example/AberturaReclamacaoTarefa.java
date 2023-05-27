package org.example;

public class AberturaReclamacaoTarefa implements Tarefa{

    private Reclamacao reclamacao;

    public AberturaReclamacaoTarefa(Reclamacao reclamacao){
        this.reclamacao = reclamacao;
    }

    @Override
    public void executar() {
        this.reclamacao.abrirReclamacao();
    }

    @Override
    public void cancelar() {
        this.reclamacao.fecharReclamacao();
    }
}
