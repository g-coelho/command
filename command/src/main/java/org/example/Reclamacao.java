package org.example;

public class Reclamacao {
    private int protocolo;
    private String nomeEmpresa;
    private String nomeCliente;
    private String situacao;

    public Reclamacao(int protocolo, String nomeEmpresa, String nomeCliente) {
        this.protocolo = protocolo;
        this.nomeEmpresa = nomeEmpresa;
        this.nomeCliente = nomeCliente;
    }

    public String getSituacao() {
        return situacao;
    }

    public void abrirReclamacao(){
        this.situacao = "Reclamacao aberta";
    }

    public void fecharReclamacao(){
        this.situacao = "Reclamacao fechada";
    }

}
