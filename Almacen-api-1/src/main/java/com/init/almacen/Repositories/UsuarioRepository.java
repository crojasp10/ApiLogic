package com.init.almacen.Repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.init.almacen.Models.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository <UsuarioModel,Long> {
	
	

}
