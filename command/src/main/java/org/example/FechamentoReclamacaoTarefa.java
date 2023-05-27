package org.example;

public class FechamentoReclamacaoTarefa implements Tarefa{
    private Reclamacao reclamacao;

    public FechamentoReclamacaoTarefa(Reclamacao reclamacao){
        this.reclamacao = reclamacao;
    }


    @Override
    public void executar() {
        this.reclamacao.fecharReclamacao();
    }

    @Override
    public void cancelar() {
        this.reclamacao.abrirReclamacao();
    }
}
