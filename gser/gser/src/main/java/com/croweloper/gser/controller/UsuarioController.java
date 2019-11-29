package com.croweloper.gser.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croweloper.gser.dto.LoginDTO;
import com.croweloper.gser.dto.UsuarioDTO;
import com.croweloper.gser.model.Usuario;
import com.croweloper.gser.service.IUsuarioService;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	
	@Autowired
	private IUsuarioService service;
		
	@GetMapping(value="listar/{id}")
	public ResponseEntity<Usuario>  listarID(@PathVariable("id") Long id) throws IOException
	{
		Usuario _p =service.listarId(id);
		if(_p == null) {
			_p = new Usuario();
			//throw new IOException("Error al obtener persona");
		}
		return new ResponseEntity<>(_p, HttpStatus.OK);		
	}
		
	@PostMapping(value="crear")
	public ResponseEntity<Usuario> save(@Valid @RequestBody Usuario p)
	{
		System.out.println(p.toString());
		//LocalDate date = LocalDate.of(2015, 8, 11);
		//p.setUsu_fecnac(LocalDate.parse("1992-10-29"));
		//p.setUsu_fecnac(LocalDate.of(2015, 8, 11));		
		
		Usuario _p = service.registrar(p);
		
		if(_p == null)
			return new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(_p, HttpStatus.CREATED);
	}
	
	@PutMapping(value="actualizar")
	public ResponseEntity<Usuario> update(@Valid @RequestBody Usuario p)
	{
		
		Usuario _p = service.modificar(p);
		if(_p == null)
			return new ResponseEntity<Usuario>(HttpStatus.BAD_REQUEST);
		
		return new ResponseEntity<>(_p, HttpStatus.OK);
	}
	
	@DeleteMapping(value="eliminar/{id}")
	public boolean delete(@PathVariable("id") Long id)
	{
		return service.eliminar(id);
			
	}
	
	@PostMapping(value="usuarioLogin")
	public ResponseEntity<LoginDTO> usuarioLogin(@RequestBody UsuarioDTO usuario) throws IOException
	{
		UsuarioDTO usu =service.usuarioLogin(usuario.getUsu_mail(), usuario.getUsu_pass()); 
		
		if(usu == null) {
			usu = new UsuarioDTO();			
		}
		LoginDTO login=new LoginDTO();
		login.setUsu_cod(usu.getUsu_cod());
		login.setRpta(usu.getRpta());
		login.setMensaje(usu.getMensaje());
		login.setUsu_perfil(usu.getUsu_perfil());
		
		
		return new ResponseEntity<>(login, HttpStatus.OK);
		
	}
	
	
	@PostMapping(value="registrarUsuario")
	public ResponseEntity<Usuario> registrarUsuario(@RequestBody UsuarioDTO usuario) throws IOException
	{
		Usuario usu =service.registroUsuario(usuario.getUsu_nom(), usuario.getUsu_ape(), usuario.getUsu_mail(), usuario.getUsu_tdoc(),usuario.getUsu_ndoc(), usuario.getUsu_movil(), usuario.getUsu_pass()); 
		
		if(usu == null) {
			usu = new Usuario();			
		}
				
		
		return new ResponseEntity<>(usu, HttpStatus.OK);
		
	}
	

}
