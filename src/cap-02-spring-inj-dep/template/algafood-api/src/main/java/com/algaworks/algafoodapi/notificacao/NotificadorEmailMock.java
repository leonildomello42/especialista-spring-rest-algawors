package com.algaworks.algafoodapi.notificacao;


import com.algaworks.algafoodapi.modelo.Cliente;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("desenv")
@TipoDoNotificador(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorEmailMock implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail-MOCK %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
