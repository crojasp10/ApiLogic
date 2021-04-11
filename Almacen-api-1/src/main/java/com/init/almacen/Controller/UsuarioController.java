package com.init.almacen.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.init.almacen.Models.UsuarioModel;
import com.init.almacen.Services.UsuarioService;
import com.sun.el.stream.Optional;


@RestController
@RequestMapping("/productos")
public class UsuarioController {
	@Autowired
	UsuarioService usuarioService;
	
	@GetMapping()
	public ArrayList<UsuarioModel> obtenerUsuarios(){
		return usuarioService.obtenerUsuarios();
	}
	
	@PostMapping()
	public UsuarioModel guardarusuario (@RequestBody UsuarioModel objeto) {
		return this.usuarioService.guardarUsuario(objeto);
	}
	
	 @GetMapping( path = "/{id}")
	    public java.util.Optional<UsuarioModel> obtenerUsuarioPorId(@PathVariable("id") Long id) {
	        return this.usuarioService.obtenerPorId(id);
	    }
	 
	 @DeleteMapping( path = "/{id}")
	    public String eliminarPorId(@PathVariable("id") Long id){
	        boolean ok = this.usuarioService.eliminarUsuario(id);
	        if (ok){
	            return "Se eliminó el usuario con id " + id;
	        }else{
	            return "No pudo eliminar el usuario con id" + id;
	        }
	    }
	 
}
