package com.croweloper.gser.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.croweloper.gser.model.Contratacion;

public interface IContratacionDao extends JpaRepository<Contratacion, Long> {
	
	@Query(value = "call sp_RegistrarContratacion(?,?,?,?)", nativeQuery = true)
	List<Object[]> registrarContratacion(Long cser_usucod ,Long cser_sercod ,Long cser_datosfac,Long cser_tarjeta );

}
