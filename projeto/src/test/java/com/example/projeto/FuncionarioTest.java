package com.example.projeto;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuncionarioTest {

    @Test
    void deveEntregar() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Obrigada por entregar o projeto no prazo.\nO Sistema respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O sistema vai enviar sua entrega para o líder: projeto entregue no prazo",
                funcionario.entregarSistema("projeto entregue no prazo"));
    }

    @Test
    void deveReceberTicket() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Ticket de atraso na entrega.\nO Sistema respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O sistema abrirá seu ticket de atraso na entrega: projeto entregue com atraso",
                funcionario.ticketSistema("projeto entregue com atraso"));
    }

    @Test
    void deveReceberComentario() {
        Funcionario funcionario = new Funcionario();
        assertEquals("Obrigada pelo comentario.\nO Sistema respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>O sitema enviará seu cometário ao gestor: Projeto entregue com atraso devido a falta de acesso",
                funcionario.comentarioSistema("Projeto entregue com atraso devido a falta de acesso"));
    }
}
