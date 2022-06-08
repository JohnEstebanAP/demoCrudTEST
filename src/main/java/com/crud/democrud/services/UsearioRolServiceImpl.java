package com.crud.democrud.services;

import com.crud.democrud.models.UsuarioRolModel;
import com.crud.democrud.repositories.UsuarioRolRepository;
import com.crud.democrud.services.iface.UsuarioRolService;
import com.minimarket.lospacos.models.entity.Rol;
import com.minimarket.lospacos.models.repository.RolRepository;
import com.minimarket.lospacos.service.iface.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UsearioRolServiceImpl implements UsuarioRolService {
    
    @Autowired
    private UsuarioRolRepository usuarioRolRepository;

    @Override
    public void create(UsuarioRolModel usuarioRol) {

    }

    @Override
    public List<Rol> getAll() {
        List<Rol> roles = new ArrayList<>();
        rolRepository.findAll().forEach(roles::add);
        return  roles;
    }

    @Override
    public Optional<UsuarioRolModel> getById(int id) {
        return Optional.empty();
    }

    @Override
    public void update(int id, UsuarioRolModel rol) {

    }

    @Override
    public void create(Rol rol) {
        rolRepository.save(rol);
    }

    @Override
    public void update(int id, Rol rol) {
        Optional<Rol> existsRol = rolRepository.findById(id);
        if (existsRol.isPresent()) {
            existsRol.get().setName(rol.getName());
            rolRepository.save(existsRol.get());
        }
    }

    @Override
    public void delete(int id) {
        Optional<Rol> existsRol = rolRepository.findById(id);
        if (existsRol.isPresent()) {
            rolRepository.delete(existsRol.get());
        }
    }
    
}
