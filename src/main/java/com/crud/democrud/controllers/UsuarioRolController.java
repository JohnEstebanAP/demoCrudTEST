package com.crud.democrud.controllers;


import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.iface.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
@CrossOrigin("*")
public class UsuarioRolController {
    
    @Autowired
    private UsuarioRolService usuarioRolService;
    
    @GetMapping
    public List<UsuarioRolModel> getAll(){
        return usuarioRolService.getAll();
    }


    @PostMapping
    public void create(@RequestBody UsuarioRolModel usuarioRol){
        usuarioRolService.create(usuarioRol);
    }

    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> getById(@PathVariable("id") int id){
        usuarioRolService.getById(id);
    }
    
    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody UsuarioRolModel usuarioRol){
        usuarioRolService.update(id, usuarioRol);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        usuarioRolService.delete(id);
    }
}
