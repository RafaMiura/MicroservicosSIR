package com.github.acnaweb.study_apir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ping")
public class ControllerPing { 
@RestController
@RequestMapping("/api/${api.version}/produtos")
public class ProdutoController {

    @Value("${api.version}")
    private String version;

    @GetMapping("/version")
    public String version() {
        return "Versão atual: " + version;
    }
}
}
