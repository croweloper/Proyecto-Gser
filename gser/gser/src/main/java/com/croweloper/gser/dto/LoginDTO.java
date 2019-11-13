package com.croweloper.gser.dto;

public class LoginDTO {
	
	private Long usu_cod;
	private boolean rpta;
	private String mensaje;
	private int usu_perfil;
	public Long getUsu_cod() {
		return usu_cod;
	}
	public void setUsu_cod(Long usu_cod) {
		this.usu_cod = usu_cod;
	}
	public boolean isRpta() {
		return rpta;
	}
	public void setRpta(boolean rpta) {
		this.rpta = rpta;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public int getUsu_perfil() {
		return usu_perfil;
	}
	public void setUsu_perfil(int usu_perfil) {
		this.usu_perfil = usu_perfil;
	}
	
	

}
