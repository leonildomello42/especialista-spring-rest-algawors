package com.algaworks.algafoodapi.notificacao;


import com.algaworks.algafoodapi.modelo.Cliente;
import org.springframework.stereotype.Component;

@TipoDoNotificador(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorEmail implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s através do e-mail %s: %s\n",
                cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
