package com.croweloper.gser.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name="tblPersona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPersona;
	
	
	@Size(min = 2, message = "Los nombres deben de tener mínimo 2 caracteres")
	@Column(name="nombres", nullable=false, length=50)
	private String nombres;
	
	
	@Size(min = 2, message = "Los apellidos deben de tener mínimo 2 caracteres")
	@Column(name="apellidos", nullable=false, length=50)
	private String apellidos;

	@JsonSerialize(using = ToStringSerializer.class)
	@Column(name="fechaNac", nullable=true)
	private LocalDate fechaNac;
	
	@Transient
	private String nombreCompleto;
	
	public Long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	
	public String getNombreCompleto() {
		return nombres +" " + apellidos;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}
	
	
	

	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombres=" + nombres + ", apellidos=" + apellidos + "]";
	}
	
}
