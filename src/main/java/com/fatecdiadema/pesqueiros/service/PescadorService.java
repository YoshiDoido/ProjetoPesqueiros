package com.fatecdiadema.pesqueiros.service;

import com.fatecdiadema.pesqueiros.dto.PescadorDTO;
import com.fatecdiadema.pesqueiros.dto.PescadorMinDTO;
import com.fatecdiadema.pesqueiros.entity.PescadorEntity;
import com.fatecdiadema.pesqueiros.projection.PescadorMinProjection;
import com.fatecdiadema.pesqueiros.repository.PescadorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PescadorService {

    @Autowired
    private PescadorRepository pescadorRepository;

    @Transactional
    public PescadorDTO findById(Long id) {
        PescadorEntity result = pescadorRepository.findById(id).get();
        return new PescadorDTO(result);
    }

    @Transactional(readOnly = true)
    public List<PescadorMinDTO> findAll() {
        List<PescadorEntity> result = pescadorRepository.findAll();
        return result.stream().map(x -> new PescadorMinDTO(x)).toList();
    }

    // Implementar depois
    /*

    @Transactional
    public List<PescadorMinDTO> findByNome(String nome) {
        List<PescadorMinProjection> result = pescadorRepository.searchByNome(nome);
        return result.stream().map(x -> new PescadorMinDTO(x)).toList();
    }

     */
}
