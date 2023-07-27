package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente){
        cliente.ativar();
        if (notificador != null){
            this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
        } else {
            System.out.printf("Não existe notificador, mas cliente foia tivado");
        }
    }
}
