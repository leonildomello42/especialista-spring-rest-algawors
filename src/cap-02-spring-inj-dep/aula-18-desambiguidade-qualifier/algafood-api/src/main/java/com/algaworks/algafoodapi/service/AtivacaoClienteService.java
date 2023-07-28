package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    @Qualifier("normal")
    @Autowired(required = false)
    private Notificador notificador;

    public void ativar(Cliente cliente){
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
