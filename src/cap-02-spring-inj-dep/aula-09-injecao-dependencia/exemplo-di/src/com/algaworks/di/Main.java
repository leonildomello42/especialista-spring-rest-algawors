package com.algaworks.di;

import com.algaworks.di.modelo.Cliente;
import com.algaworks.di.modelo.Produto;
import com.algaworks.di.notificacao.NotificadorEmail;
import com.algaworks.di.notificacao.NotificadorSMS;
import com.algaworks.di.service.AtivacaoClienteService;
import com.algaworks.di.service.EmissaoNotaFiscalService;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Cliente joao = new Cliente("João", "joao@xyz.com", "111222333444");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "111222333444");

        Produto produto = new Produto("Televisao", new BigDecimal(1000.25));

        AtivacaoClienteService ativadorCliente = new AtivacaoClienteService(new NotificadorEmail());
        ativadorCliente.ativar(joao);
        ativadorCliente.ativar(maria);

        EmissaoNotaFiscalService emissaoNotaFiscalService = new EmissaoNotaFiscalService(new NotificadorSMS());
        emissaoNotaFiscalService.emitir(joao, produto);
    }
}
