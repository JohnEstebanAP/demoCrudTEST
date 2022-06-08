package com.crud.democrud.services.iface;

import com.minimarket.lospacos.models.entity.Rol;

import java.util.List;

public interface UsuarioRolService {
    
    void create(Rol rol);
    
    List<Rol> getAll();
    
    void update(int id, Rol rol);
    
    void delete(int id);
}
