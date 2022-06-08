package com.crud.democrud.controllers;


/*
* Haga lo siguiente:
- agregue un endPoint de actualizacion de usuario
- incorpore una nueva entidad/modelo(UsuarioRol) que tenga
  los campos (idUsuario,idRol,Rol("vendedor","cajero","consultor",etc..))
  un usuario puede en un momento tener 1 o mas roles asociados.
  debe haber una relacion (Usuario - UsuarioRol):
        @ManyToOne Relation
        @OneToMany Relation
        @OneToOne Relation
        @ManyToMany Relation
  aplique la que usted considere mas apropiada y en README
  justifique ademas incorpore en este mismo README coloque
varias ScreenShoot(capturas) de la ejecucion de la API REST.

- implemente algunas pruebas unitarias a esa nueva entidad/modelo

Debe registrar en la tabla de abajo su nombre completo y su repositorio
de github con la solucion.
* */
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
    public Optional<UsuarioRolModel> getById(@PathVariable("id") int id){
        return usuarioRolService.getById(id);
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
