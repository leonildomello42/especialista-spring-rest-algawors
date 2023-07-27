package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.notificacao.NotificadorEmail;
import com.algaworks.algafoodapi.service.AtivacaoClienteService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class AlgaConfig {

    @Bean
    public NotificadorEmail notificadorEmail(){
        NotificadorEmail notificador = new NotificadorEmail("smtp.host");
        notificador.setCaixaAlta(false);

        return notificador;
    }

    @Bean
    public AtivacaoClienteService ativacaoClienteService(){
        AtivacaoClienteService ativacaoClienteService = new AtivacaoClienteService(notificadorEmail());

        return ativacaoClienteService;
    }
}
