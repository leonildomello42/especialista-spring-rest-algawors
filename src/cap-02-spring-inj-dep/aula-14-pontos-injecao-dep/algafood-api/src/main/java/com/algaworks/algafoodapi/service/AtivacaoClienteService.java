package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.Notificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AtivacaoClienteService {

    //Segundo ponto de insjecao
    private Notificador notificador;

    //1 - ponto de injecao construtor
    @Autowired
    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public AtivacaoClienteService(String mensagem) {
    }

    public void ativar(Cliente cliente){
        cliente.ativar();
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }

    //Terceiro ponto set
    @Autowired
    public void setNotificador(Notificador notificador) {
        this.notificador = notificador;
    }
}
