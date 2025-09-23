package dev.marcelopinotti.CadastroDePersonagem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class PersonagemController {

    @GetMapping("/boasVindas")
    public String boasVindas() {
        return "Bem vindo ao cadastro de personagens";
    }

}
