package com.example.projeto;

public class Lider {

    private static Lider instancia = new Lider();

    private Lider() {}

    public static Lider getInstancia() {
        return instancia;
    }

    public String receberProjetoSistema(String mensagem) {
        return "Obrigada por entregar o projeto no prazo.\n"+
                "O Sistema respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Sistema.getInstancia().receberProjeto(mensagem);
    }

    public String receberTicketSistema(String mensagem) {
        return "Ticket de atraso na entrega.\n"+
                "O Sistema respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Sistema.getInstancia().receberTicket(mensagem);
    }

    public String receberComentarioSistema(String mensagem) {
        return "Obrigada pelo comentario.\n"+
                "O Sistema respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + Sistema.getInstancia().receberComentario(mensagem);
    }
}
