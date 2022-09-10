package com.github.joferbr.clientes.rest;

//import io.github.dougllasfps.clientes.exception.UsuarioCadastradoException;
//import io.github.dougllasfps.clientes.model.entity.Usuario;
//import io.github.dougllasfps.clientes.model.repository.UsuarioRepository;
//import io.github.dougllasfps.clientes.service.UsuarioService;
import com.github.joferbr.clientes.model.entity.Usuario;
import com.github.joferbr.clientes.model.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioRepository repository;

//    private final UsuarioService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void salvar(@RequestBody @Valid Usuario usuario){
        repository.save(usuario);
//        try{
//            service.salvar(usuario);
//        }catch (UsuarioCadastradoException e){
//            throw new ResponseStatusException( HttpStatus.BAD_REQUEST, e.getMessage() );
//        }
    }
}
