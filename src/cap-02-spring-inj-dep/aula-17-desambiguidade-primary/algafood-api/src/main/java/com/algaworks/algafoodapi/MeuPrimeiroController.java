package com.algaworks.algafoodapi;

import com.algaworks.algafoodapi.modelo.Cliente;
import com.algaworks.algafoodapi.service.AtivacaoClienteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    AtivacaoClienteService ativacaoClienteService;

    public MeuPrimeiroController(AtivacaoClienteService ativacaoClienteService) {
        this.ativacaoClienteService = ativacaoClienteService;
    }

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){

        Cliente joao = new Cliente("João", "joao@xyz.com", "111222333444");
        Cliente maria = new Cliente("Maria", "maria@xyz.com", "111222333444");

        ativacaoClienteService.ativar(joao);

        return "Hello!";
    }
}
