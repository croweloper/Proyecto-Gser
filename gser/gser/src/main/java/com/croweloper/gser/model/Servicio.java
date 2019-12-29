package com.croweloper.gser.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="servicio")
public class Servicio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ser_cod;
	
	
	@Column(name = "ser_codusu")
	private Long ser_codusu;
	
	@Column(name = "ser_catsercod")
	private Long ser_catsercod;
	
	@Column(name = "ser_titulo")
	private String ser_titulo;
	
	@Column(name = "ser_incluye")
	private String ser_incluye;
	
	@Column(name = "ser_noincluye")
	private String ser_noincluye;
	
	@Column(name = "ser_servadicionales")
	private String ser_servadicionales;
	
	@Column(name = "serv_preciominimo")
	private double serv_preciominimo;
	
	@Column(name = "ser_foto")
	private String ser_foto;
	
	@Column(name = "ser_etiquetas")
	private String ser_etiquetas;
	
	@JsonSerialize(using = ToStringSerializer.class)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ser_fecreg")
	private LocalDateTime ser_fecreg;
	
	@JsonSerialize(using = ToStringSerializer.class)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "ser_fecmod")
	private LocalDateTime ser_fecmod;
	
	@Column(name = "ser_estado")
	private int ser_estado;

	public Long getSer_cod() {
		return ser_cod;
	}

	public String getSer_titulo() {
		return ser_titulo;
	}

	public void setSer_titulo(String ser_titulo) {
		this.ser_titulo = ser_titulo;
	}

	public String getSer_incluye() {
		return ser_incluye;
	}

	public void setSer_incluye(String ser_incluye) {
		this.ser_incluye = ser_incluye;
	}

	public String getSer_noincluye() {
		return ser_noincluye;
	}

	public void setSer_noincluye(String ser_noincluye) {
		this.ser_noincluye = ser_noincluye;
	}

	public void setSer_cod(Long ser_cod) {
		this.ser_cod = ser_cod;
	}

	public Long getSer_codusu() {
		return ser_codusu;
	}

	public void setSer_codusu(Long ser_codusu) {
		this.ser_codusu = ser_codusu;
	}

	public Long getSer_catsercod() {
		return ser_catsercod;
	}

	public void setSer_catsercod(Long ser_catsercod) {
		this.ser_catsercod = ser_catsercod;
	}

	public String getIncluye() {
		return ser_incluye;
	}

	public void setIncluye(String incluye) {
		this.ser_incluye = incluye;
	}

	public String getNoincluye() {
		return ser_noincluye;
	}

	public void setNoincluye(String noincluye) {
		this.ser_noincluye = noincluye;
	}

	public String getSer_servadicionales() {
		return ser_servadicionales;
	}

	public void setSer_servadicionales(String ser_servadicionales) {
		this.ser_servadicionales = ser_servadicionales;
	}

	public double getServ_preciominimo() {
		return serv_preciominimo;
	}

	public void setServ_preciominimo(double serv_preciominimo) {
		this.serv_preciominimo = serv_preciominimo;
	}

	public String getSer_foto() {
		return ser_foto;
	}

	public void setSer_foto(String ser_foto) {
		this.ser_foto = ser_foto;
	}

	public String getSer_etiquetas() {
		return ser_etiquetas;
	}

	public void setSer_etiquetas(String ser_etiquetas) {
		this.ser_etiquetas = ser_etiquetas;
	}

	public LocalDateTime getSer_fecreg() {
		return ser_fecreg;
	}

	public void setSer_fecreg(LocalDateTime ser_fecreg) {
		this.ser_fecreg = ser_fecreg;
	}

	public LocalDateTime getSer_fecmod() {
		return ser_fecmod;
	}

	public void setSer_fecmod(LocalDateTime ser_fecmod) {
		this.ser_fecmod = ser_fecmod;
	}

	public int getSer_estado() {
		return ser_estado;
	}

	public void setSer_estado(int ser_estado) {
		this.ser_estado = ser_estado;
	}
	
	
	
	
	
	/*
			  `ser_cod` INT NOT NULL AUTO_INCREMENT,
			  `ser_codusu` INT NOT NULL,
			  `ser_catsercod` INT NOT NULL,
			  `ser_incluye` TEXT NOT NULL,
			  `ser_noincluye` TEXT NULL,
			  `ser_servadicionales` TEXT NULL,
			  `serv_preciominimo` DECIMAL(5,2) NOT NULL,
			  `ser_foto` VARCHAR(100) NULL,
			  `ser_etiquetas` TEXT NULL,
			  `ser_fecreg` DATETIME NOT NULL,
			  `ser_fecmod` DATETIME NULL,
			  `ser_estado` INT NOT NULL,
			  PRIMARY KEY (`ser_cod`),
			  
		*/	  
	


}
