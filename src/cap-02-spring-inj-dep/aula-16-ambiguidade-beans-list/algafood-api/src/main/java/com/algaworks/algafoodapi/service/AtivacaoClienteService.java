package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AtivacaoClienteService {

    @Autowired(required = false)
    private List<Notificador> notificador;

    public void ativar(Cliente cliente){
        for (Notificador notificador1 : notificador){
            notificador1.notificar(cliente, "Seu cadastro no sistema está ativo!");
        }
    }
}
