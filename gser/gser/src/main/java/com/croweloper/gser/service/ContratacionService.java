package com.croweloper.gser.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croweloper.gser.dao.IContratacionDao;
import com.croweloper.gser.dao.IServicioDao;
import com.croweloper.gser.model.Contratacion;
import com.croweloper.gser.model.Servicio;

@Service
public class ContratacionService implements IContratacionService{
	
	@Autowired
	private IContratacionDao contratacionDAO;
	
	@Autowired
	private IServicioDao servicioDAO;

	@Override
	public Contratacion registrar(Contratacion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Contratacion modificar(Contratacion t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Contratacion listarId(Long id) {
		// TODO Auto-generated method stub
		return contratacionDAO.findOne(id);
	}

	@Override
	public List<Contratacion> ListarContrataciones() {
		// TODO Auto-generated method stub
		return contratacionDAO.findAll();
	}

	@Override
	public List<Contratacion> ListarContratacionesxUsuario(Long codusuario) {
		
		List<Contratacion> listatotal=new ArrayList<>();
		listatotal=ListarContrataciones();
		
		List<Contratacion> listaxusuario=new ArrayList<>();
		
		
		for (Contratacion contratacion : listatotal) {
			if (contratacion.getCser_usucod()==codusuario) {
				listaxusuario.add(contratacion);
			}
			
		}
		
		return listaxusuario;
	}

	@Override
	public List<Contratacion> ListarContratacionesxPrestador(Long codprestador) {
		
		List<Contratacion> listatotal=new ArrayList<>();
		listatotal=ListarContrataciones();
		
		
		List<Contratacion> listaxprestador=new ArrayList<>();
		
				
		for (Contratacion contratacion : listatotal) {
			
			
			
			Servicio servprov=servicioDAO.findOne(contratacion.getCser_sercod());
						
			if (servprov.getSer_codusu()==codprestador) {
				listaxprestador.add(contratacion);
			}
			
		}
						
		return listaxprestador;
	}

	
	@Override
	public Contratacion RegistrarContratacion(Long cser_usucod ,Long cser_sercod ,Long cser_datosfac,Long cser_tarjeta) {
		// TODO Auto-generated method stub
		Contratacion ser=new Contratacion();
		
		List<Object[]> lista=contratacionDAO.registrarContratacion(cser_usucod, cser_sercod, cser_datosfac, cser_tarjeta);
				
		
		for (Object[] obj : lista) {
			ser=new Contratacion();
			ser=listarId(Long.valueOf(obj[0].toString()));
			
		}
		
		return ser;
	}

}
