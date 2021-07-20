package com.laercio.comics.controller;

import com.laercio.comics.model.Usuarios;
import com.laercio.comics.repository.UsauariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {

    @Autowired
    private UsauariosRepository usauariosRepository;

    @GetMapping
    public List<Usuarios> listaDeUsuarios(){
        return usauariosRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuarios save (@RequestBody Usuarios usuario) {
        return usauariosRepository.save(usuario);
    }

}
