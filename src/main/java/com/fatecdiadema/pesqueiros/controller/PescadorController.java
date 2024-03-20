package com.fatecdiadema.pesqueiros.controller;

import com.fatecdiadema.pesqueiros.dto.PescadorDTO;
import com.fatecdiadema.pesqueiros.dto.PescadorMinDTO;
import com.fatecdiadema.pesqueiros.service.PescadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/pescador")
public class PescadorController {

    @Autowired
    private PescadorService pescadorService;

    @GetMapping("/id")
    public PescadorDTO findById(@PathVariable Long id) {
        PescadorDTO result = pescadorService.findById(id);
        return result;
    }

    @GetMapping
    public List<PescadorMinDTO> findAll() {
        List<PescadorMinDTO> result = pescadorService.findAll();
        return result;
    }
}
