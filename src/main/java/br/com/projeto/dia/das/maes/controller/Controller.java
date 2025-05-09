package br.com.projeto.dia.das.maes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class Controller {

    @GetMapping("/home")
        public String home() {
            return "Bem vindo ao projeto Dia das Mães nessa rota";
        }
    }


