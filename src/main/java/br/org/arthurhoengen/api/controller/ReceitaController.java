package br.org.arthurhoengen.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.arthurhoengen.api.receita.DadosReceita;

@RestController
@RequestMapping("receita")
public class ReceitaController {
    
    @PostMapping
    public void receita(@RequestBody DadosReceita dados){
        System.out.println(dados);
    }
}
