package com.croweloper.gser.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

public class UsuarioDTO {
	
	private Long usu_cod;
	private String usu_nom;
	private String usu_ape;
	private String usu_mail;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDate usu_fecnac;
	
	private int usu_tdoc;
	private String usu_ndoc;

	private String usu_tel;

	private String usu_movil;
	private String usu_pass;

	private String usu_foto;
	
	private int usu_verificacion;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime usu_fecreg;
	
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDateTime usu_fecmod;
	private int usu_estado;
	private int usu_perfil;
	
	private boolean rpta;
	private String  mensaje;
	
	
	
	public boolean getRpta() {
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
	public Long getUsu_cod() {
		return usu_cod;
	}
	public void setUsu_cod(Long usu_cod) {
		this.usu_cod = usu_cod;
	}
	public String getUsu_nom() {
		return usu_nom;
	}
	public void setUsu_nom(String usu_nom) {
		this.usu_nom = usu_nom;
	}
	public String getUsu_ape() {
		return usu_ape;
	}
	public void setUsu_ape(String usu_ape) {
		this.usu_ape = usu_ape;
	}
	public String getUsu_mail() {
		return usu_mail;
	}
	public void setUsu_mail(String usu_mail) {
		this.usu_mail = usu_mail;
	}
	public LocalDate getUsu_fecnac() {
		return usu_fecnac;
	}
	public void setUsu_fecnac(LocalDate usu_fecnac) {
		this.usu_fecnac = usu_fecnac;
	}
	public int getUsu_tdoc() {
		return usu_tdoc;
	}
	public void setUsu_tdoc(int usu_tdoc) {
		this.usu_tdoc = usu_tdoc;
	}
	public String getUsu_ndoc() {
		return usu_ndoc;
	}
	public void setUsu_ndoc(String usu_ndoc) {
		this.usu_ndoc = usu_ndoc;
	}
	public String getUsu_tel() {
		return usu_tel;
	}
	public void setUsu_tel(String usu_tel) {
		this.usu_tel = usu_tel;
	}
	public String getUsu_movil() {
		return usu_movil;
	}
	public void setUsu_movil(String usu_movil) {
		this.usu_movil = usu_movil;
	}
	public String getUsu_pass() {
		return usu_pass;
	}
	public void setUsu_pass(String usu_pass) {
		this.usu_pass = usu_pass;
	}
	public String getUsu_foto() {
		return usu_foto;
	}
	public void setUsu_foto(String usu_foto) {
		this.usu_foto = usu_foto;
	}
	public LocalDateTime getUsu_fecreg() {
		return usu_fecreg;
	}
	public void setUsu_fecreg(LocalDateTime usu_fecreg) {
		this.usu_fecreg = usu_fecreg;
	}
	public LocalDateTime getUsu_fecmod() {
		return usu_fecmod;
	}
	public void setUsu_fecmod(LocalDateTime usu_fecmod) {
		this.usu_fecmod = usu_fecmod;
	}
	public int getUsu_estado() {
		return usu_estado;
	}
	public void setUsu_estado(int usu_estado) {
		this.usu_estado = usu_estado;
	}
	public int getUsu_perfil() {
		return usu_perfil;
	}
	public void setUsu_perfil(int usu_perfil) {
		this.usu_perfil = usu_perfil;
	}
	
	
	public int getUsu_verificacion() {
		return usu_verificacion;
	}
	public void setUsu_verificacion(int usu_verificacion) {
		this.usu_verificacion = usu_verificacion;
	}
	public UsuarioDTO() {
	
	}
	
	
	public UsuarioDTO(Long usu_cod, String usu_nom, String usu_ape, String usu_mail, LocalDate usu_fecnac,
			int usu_tdoc, String usu_ndoc, String usu_tel, String usu_movil, String usu_pass, String usu_foto,
			LocalDateTime usu_fecreg, LocalDateTime usu_fecmod, int usu_estado, int usu_perfil) {
		super();
		this.usu_cod = usu_cod;
		this.usu_nom = usu_nom;
		this.usu_ape = usu_ape;
		this.usu_mail = usu_mail;
		this.usu_fecnac = usu_fecnac;
		this.usu_tdoc = usu_tdoc;
		this.usu_ndoc = usu_ndoc;
		this.usu_tel = usu_tel;
		this.usu_movil = usu_movil;
		this.usu_pass = usu_pass;
		this.usu_foto = usu_foto;
		this.usu_fecreg = usu_fecreg;
		this.usu_fecmod = usu_fecmod;
		this.usu_estado = usu_estado;
		this.usu_perfil = usu_perfil;
	}
	
	
	
	

}
