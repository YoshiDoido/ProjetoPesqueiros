package com.fatecdiadema.pesqueiros.controller;

import com.fatecdiadema.pesqueiros.dto.UsuarioDTO;
import com.fatecdiadema.pesqueiros.dto.UsuarioMinDTO;
import com.fatecdiadema.pesqueiros.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/{id}")
    public UsuarioDTO findById(@PathVariable Long id) {
        UsuarioDTO result = usuarioService.findById(id);
        return result;
    }
    @GetMapping
    public List<UsuarioMinDTO> findAll() {
        List<UsuarioMinDTO> result = usuarioService.findAll();
        return result;
    }
}
