package com.croweloper.gser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="categoria_servicio")
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long catser_cod;
	
	
	@Column(name = "catser_decripcion")
	private String catser_decripcion;
	
	@Column(name = "catser_img")
	private String catser_img;
	
	@Column(name = "catser_estado")
	private int catser_estado;

	public Long getCatser_cod() {
		return catser_cod;
	}

	public void setCatser_cod(Long catser_cod) {
		this.catser_cod = catser_cod;
	}

	public String getCatser_decripcion() {
		return catser_decripcion;
	}

	public void setCatser_decripcion(String catser_decripcion) {
		this.catser_decripcion = catser_decripcion;
	}

	public String getCatser_img() {
		return catser_img;
	}

	public void setCatser_img(String catser_img) {
		this.catser_img = catser_img;
	}

	public int getCatser_estado() {
		return catser_estado;
	}

	public void setCatser_estado(int catser_estado) {
		this.catser_estado = catser_estado;
	}
	
	
	

}
