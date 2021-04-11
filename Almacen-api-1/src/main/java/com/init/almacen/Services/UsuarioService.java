package com.init.almacen.Services;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.init.almacen.Models.UsuarioModel;
import com.init.almacen.Repositories.UsuarioRepository;
import com.sun.el.stream.Optional;

@Service
public class UsuarioService {
	@Autowired
	UsuarioRepository usuarioRepository;
	
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return (ArrayList<UsuarioModel>)usuarioRepository.findAll();
		}

	public UsuarioModel guardarUsuario(UsuarioModel producto) {
		return usuarioRepository.save(producto);
	}
	
	public  java.util.Optional<UsuarioModel> obtenerPorId(Long id){
		return usuarioRepository.findById(id);
	}
	
	
	public boolean eliminarUsuario(Long id) {
        try{
            usuarioRepository.deleteById(id);
            return true;
        }catch(Exception err){
            return false;
        }
    }
	
	
	
}
