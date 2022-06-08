package com.crud.democrud.models;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuariorol")
public class UsuarioRolModel {

    @Id
    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "rol")
    private String rol;

    public UsuarioRolModel(Long idUsuario, int idRol, String rol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.rol = rol;
    }

    public UsuarioRolModel() {

    }

    public Long getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    
}
