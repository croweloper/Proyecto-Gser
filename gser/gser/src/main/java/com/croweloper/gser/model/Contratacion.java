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
@Table(name="contratacion_servicio")
public class Contratacion {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cser_nrocontratacion;
	
	@Column(name = "cser_usucod")
	private Long cser_usucod;
	
	@Column(name = "cser_sercod")
	private Long cser_sercod;
	
	@Column(name = "cser_datosfac")
	private Long cser_datosfac;
	
	@Column(name = "cser_tarjeta")
	private Long cser_tarjeta;
	
	@Column(name = "cser_codpago")
	private String cser_codpago;
	
	@JsonSerialize(using = ToStringSerializer.class)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "cser_fecreg")
	private LocalDateTime cser_fecreg;
	
	@Column(name = "cser_estado")
	private int cser_estado;

	public Long getCser_nrocontratacion() {
		return cser_nrocontratacion;
	}

	public void setCser_nrocontratacion(Long cser_nrocontratacion) {
		this.cser_nrocontratacion = cser_nrocontratacion;
	}

	public Long getCser_usucod() {
		return cser_usucod;
	}

	public void setCser_usucod(Long cser_usucod) {
		this.cser_usucod = cser_usucod;
	}

	public Long getCser_sercod() {
		return cser_sercod;
	}

	public void setCser_sercod(Long cser_sercod) {
		this.cser_sercod = cser_sercod;
	}

	public Long getCser_datosfac() {
		return cser_datosfac;
	}

	public void setCser_datosfac(Long cser_datosfac) {
		this.cser_datosfac = cser_datosfac;
	}

	public Long getCser_tarjeta() {
		return cser_tarjeta;
	}

	public void setCser_tarjeta(Long cser_tarjeta) {
		this.cser_tarjeta = cser_tarjeta;
	}

	public String getCser_codpago() {
		return cser_codpago;
	}

	public void setCser_codpago(String cser_codpago) {
		this.cser_codpago = cser_codpago;
	}

	public LocalDateTime getCser_fecreg() {
		return cser_fecreg;
	}

	public void setCser_fecreg(LocalDateTime cser_fecreg) {
		this.cser_fecreg = cser_fecreg;
	}

	public int getCser_estado() {
		return cser_estado;
	}

	public void setCser_estado(int cser_estado) {
		this.cser_estado = cser_estado;
	}

	

}
