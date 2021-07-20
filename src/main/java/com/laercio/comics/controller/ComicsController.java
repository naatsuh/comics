package com.laercio.comics.controller;

import com.laercio.comics.model.Comics;
import com.laercio.comics.repository.ComicsRepository;
import com.laercio.comics.util.ApiKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comics")
public class ComicsController {
    @Autowired
    private ComicsRepository comicsRepository;

    @GetMapping
    public List<Comics> listaDeComics(){
        return comicsRepository.findAll();
    }

    @GetMapping("/uriapi")
    public String uriapi(){
        ApiKey apiKey = new ApiKey();

        return apiKey.urlApi();
    }

    @GetMapping("/{idusuario}")
    public ResponseEntity<List<Comics>> listarDeVeiculosPorUsuario (@PathVariable Long idusuario) {
        return new ResponseEntity<List<Comics>>(comicsRepository.findByusuarioid(idusuario), HttpStatus.OK);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Comics save (@RequestBody Comics usuario) {
        return comicsRepository.save(usuario);
    }
}
