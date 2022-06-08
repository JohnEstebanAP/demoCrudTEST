package com.crud.democrud.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "usuariorol")
public class UsuarioRolModel {
    @Id
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_rol")
    private int idRol;

    @Column(name = "rol")
    private String rol;

    public UsuarioRolModel(int idUsuario, int idRol, String rol) {
        this.idUsuario = idUsuario;
        this.idRol = idRol;
        this.rol = rol;
    }

    public UsuarioRolModel() {

    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
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
