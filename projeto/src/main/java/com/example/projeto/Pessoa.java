package com.example.projeto;

public class Pessoa {

    public String entregarSistema(String mensagem) {
        return Lider.getInstancia().receberProjetoSistema(mensagem);
    }

    public String ticketSistema(String mensagem) {
        return Lider.getInstancia().receberTicketSistema(mensagem);
    }

    public String comentarioSistema(String mensagem) {
        return Lider.getInstancia().receberComentarioSistema(mensagem);
    }
}
