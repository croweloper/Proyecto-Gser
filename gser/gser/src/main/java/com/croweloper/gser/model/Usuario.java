package com.croweloper.gser.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long usu_cod;

	@Size(min = 2, message = "Los nombres deben de tener mínimo 2 caracteres")
	@Column(name = "usu_nom", nullable = false, length = 100)
	private String usu_nom;

	@Size(min = 2, message = "Los apellidos deben de tener mínimo 2 caracteres")
	@Column(name = "usu_ape", nullable = true, length = 100)
	private String usu_ape;

	@Size(min = 8, message = "El correo debe tener mínimo 8 caracteres")
	@Column(name = "usu_mail", nullable = false, length = 50)
	private String usu_mail;
	
	
	//@JsonSerialize(using = LocalDateTimeSerializer.class)
	//@JsonDeserialize(using = LocalDateTimeDeserializer.class)
	@JsonFormat(pattern="yyyy-MM-dd")
	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name = "usu_fecnac", nullable = true, length = 50)
	private LocalDate usu_fecnac;

	@Column(name = "usu_tdoc", nullable = false)
	private int usu_tdoc;

	@Size(min = 8, message = "Los nuumero de  deben de tener mínimo 9 caracteres")
	@Column(name = "usu_ndoc", nullable = false, length = 11)
	private String usu_ndoc;

	//@Size(min = 7, message = "Los telefonos deben de tener mínimo 7 caracteres")
	@Column(name = "usu_tel", nullable = true, length = 7)
	private String usu_tel;

	@Size(min = 9, message = "Los telefonos moviles deben de tener mínimo 9 caracteres")
	@Column(name = "usu_movil", nullable = false, length = 9)
	private String usu_movil;

	@Size(min = 6, message = "Las contraseñas deben de tener mínimo 6 caracteres")
	@Column(name = "usu_pass", nullable = false, length = 50)
	private String usu_pass;

	@Column(name = "usu_foto", nullable = true, length = 50)
	private String usu_foto;
		
	@Column(name = "usu_verificacion", nullable = true)
	private int usu_verificacion;
		
	@JsonSerialize(using = ToStringSerializer.class)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name="usu_fecreg", nullable=true)
	private LocalDateTime usu_fecreg;
	
	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name = "usu_fecmod", nullable = true)
	private LocalDateTime usu_fecmod;
	
	@Column(name = "usu_estado", nullable = true)
	private int usu_estado;

	@Column(name = "usu_perfil", nullable = true)
	private int usu_perfil;

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
	
	

}
