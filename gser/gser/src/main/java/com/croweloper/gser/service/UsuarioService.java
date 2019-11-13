package com.croweloper.gser.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croweloper.gser.dao.IUsuarioDao;
import com.croweloper.gser.dto.UsuarioDTO;
import com.croweloper.gser.model.Usuario;

@Service
public class UsuarioService implements IUsuarioService {
	
	@Autowired
	private IUsuarioDao usuarioDAO;
	

	@Override
	public Usuario registrar(Usuario t) {
		System.out.println(t.toString());
		return usuarioDAO.save(t);
		
	}

	@Override
	public Usuario modificar(Usuario t) {
		return usuarioDAO.save(t);
	}

	@Override
	public boolean eliminar(Long id) {
		Usuario _p = usuarioDAO.findOne(id);
		if(_p != null) {
			usuarioDAO.delete(id);
			return true;
		}
		return false;
	}

	@Override
	public Usuario listarId(Long id) {
		return usuarioDAO.findOne(id);
	}

	
	
	
	@Override
	public List<UsuarioDTO> listarUsuario(Long id) {
		List<UsuarioDTO> usuaridto = new ArrayList<>();
		List<Object[]> lista =   usuarioDAO.listarUsuario(id);
		for (Object[] obj : lista) {
			UsuarioDTO p = new UsuarioDTO();
			p.setUsu_cod(Long.valueOf(obj[0].toString()));
			p.setUsu_nom("");
			p.setUsu_ape("");
			p.setUsu_mail(obj[1].toString());
			p.setUsu_fecnac(null);
			p.setUsu_tdoc(1);
			p.setUsu_ndoc("");
			p.setUsu_tel("");
			p.setUsu_movil("");
			p.setUsu_pass("");
			p.setUsu_foto("");
			p.setUsu_verificacion(1);
			p.setUsu_fecreg(null);
			p.setUsu_fecmod(null);
			p.setUsu_estado(1);
			p.setUsu_perfil(1);
						
			usuaridto.add(p);
		}
		return usuaridto;
	}
	
	@Override
	public List<UsuarioDTO> LoginUsuario(String usuario, String pass) {
		List<UsuarioDTO> usuaridto = new ArrayList<>();
		List<Object[]> lista =   usuarioDAO.LoginUsuario(usuario, pass);
		for (Object[] obj : lista) {
			UsuarioDTO p = new UsuarioDTO();
			p.setUsu_cod(Long.valueOf(obj[0].toString()));
			p.setUsu_mail(obj[1].toString());
			p.setUsu_perfil(Integer.parseInt(obj[15].toString()));
			
			if(p.getUsu_cod()!=null) {
				p.setRpta(true);
				p.setMensaje("Autenticación Exitosa");			
			}else {
				p.setRpta(false);
				p.setMensaje("Autenticación Fallida");	
			}
			
			usuaridto.add(p);
		}
		return usuaridto;
	}

	@Override
	public UsuarioDTO usuarioListar(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public UsuarioDTO usuarioLogin(String usuario, String pass) {
		UsuarioDTO usuaridto = new UsuarioDTO();
		
		List<Object[]> lista =   usuarioDAO.LoginUsuario(usuario, pass);
		
		for (Object[] obj : lista) {
			usuaridto = new UsuarioDTO();
			usuaridto.setUsu_cod(Long.valueOf(obj[0].toString()));
			usuaridto.setUsu_perfil(Integer.parseInt(obj[15].toString()));
		}
		
		if(usuaridto.getUsu_cod()!=null) {
			usuaridto.setRpta(true);
			usuaridto.setMensaje("Autenticación Exitosa");			
		}else {
			usuaridto.setRpta(false);
			usuaridto.setMensaje("Autenticación Fallida");	
		}
				
		
		return usuaridto;
	}

}
