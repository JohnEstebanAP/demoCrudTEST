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
import com.crud.democrud.models.UsuarioModel;
import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.services.UsuarioRolServiceImpl;
import com.crud.democrud.services.iface.UsuarioRolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin
@RestController
@RequestMapping("/rol")
public class UsuarioRolController {

    @Autowired
    UsuarioRolServiceImpl usuarioRolService;

    @GetMapping
    public List<UsuarioRolModel> getAll(){
        return usuarioRolService.getAll();
    }


    @PostMapping
    public void create(@RequestBody UsuarioRolModel usuarioRol){
        usuarioRolService.create(usuarioRol);
    }

    @GetMapping(path = "/{id_rol}")
    public Optional<UsuarioRolModel> getById(@PathVariable("id_rol") int id_rol){
        return this.usuarioRolService.getById(id_rol);
    }

    @GetMapping("/query")
    public ArrayList<UsuarioRolModel> obtenerUsuarioPorPrioridad(@RequestParam("prioridad") int idRol) {
        return this.usuarioRolService.getByRol(idRol);
    }

    @PutMapping("/{id_rol}")
    public void update(@PathVariable int id_rol, @RequestBody UsuarioRolModel usuarioRol){
        usuarioRolService.update(id_rol, usuarioRol);
    }

    @DeleteMapping("/{id_rol}")
    public void delete(@PathVariable int id_rol){
        usuarioRolService.delete(id_rol);
    }
}

/*
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "rol_usuario_id", nullable = false)
@Getter
@Setter
private UsuarioModel rolUser;
* */
