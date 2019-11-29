package com.croweloper.gser.service;

import java.util.List;
import com.croweloper.gser.dto.UsuarioDTO;
import com.croweloper.gser.model.Usuario;

public interface IUsuarioService {
	
	Usuario registrar(Usuario t);
	
	Usuario modificar(Usuario t);

	boolean eliminar(Long id);

	Usuario listarId(Long id);
		
	List<UsuarioDTO> listarUsuario(Long id);
	
	List<UsuarioDTO> LoginUsuario(String usuario,String pass);
	
	UsuarioDTO usuarioListar(Long id);
	
	UsuarioDTO usuarioLogin(String usuario,String pass);
	
	Usuario registroUsuario(String nomusu,String apeusu,String mail,int tipodoc,String doc,String usumovil,String pass);
	
	
}
