package com.example.projeto;

public class Sistema implements Entrega {

    private static Sistema instancia = new Sistema();

    private Sistema() {}

    public static Sistema getInstancia() {
        return instancia;
    }

    public String receberProjeto(String mensagem) {
        return "O sistema vai enviar sua entrega para o líder: " + mensagem;
    }

    public String receberTicket(String mensagem) {
        return "O sistema abrirá seu ticket de atraso na entrega: " + mensagem;
    }

    public String receberComentario(String mensagem) {
        return "O sitema enviará seu cometário ao gestor: " + mensagem;
    }
}
