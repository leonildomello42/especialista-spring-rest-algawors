package com.algaworks.algafoodapi.service;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.notificacao.NivelUrgencia;
import com.algaworks.algafoodapi.notificacao.Notificador;
import com.algaworks.algafoodapi.notificacao.TipoDoNotificador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class AtivacaoClienteService {

    @TipoDoNotificador(value = NivelUrgencia.URGENTE)
    @Autowired(required = false)
    private Notificador notificador;

    @PostConstruct
    public void init(){
        System.out.println("Iniciado");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Finalizado");
    }

    public void ativar(Cliente cliente){
        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
    }
}
