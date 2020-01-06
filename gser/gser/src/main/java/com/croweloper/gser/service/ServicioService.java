package com.croweloper.gser.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.croweloper.gser.dao.IServicioDao;

import com.croweloper.gser.model.Servicio;

@Service
public class ServicioService implements IServicioService {

	@Autowired
	private IServicioDao servicioDAO;

	@Override
	public Servicio registrar(Servicio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Servicio modificar(Servicio t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean eliminar(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Servicio listarId(Long id) {
		// TODO Auto-generated method stub
		return servicioDAO.findOne(id);
	}

	@Override
	public List<Servicio> ListarServicios() {
		// TODO Auto-generated method stub
		return servicioDAO.findAll();
	}

	/*
	 * @Override public List<Servicio> ListarServiciosCategoria(Long idCategoria) {
	 * // TODO Auto-generated method stub List<Servicio> listaservicio = new
	 * ArrayList<>(); Servicio serv; List<Object[]> lista =
	 * servicioDAO.listarServicioCategoria(idCategoria);
	 * 
	 * for (Object[] obj : lista) {
	 * 
	 * serv = new Servicio(); serv.setSer_cod(Long.valueOf(obj[0].toString()));
	 * serv.setSer_codusu(Long.valueOf(obj[1].toString()));
	 * serv.setSer_catsercod(Long.valueOf(obj[2].toString()));
	 * serv.setSer_titulo(obj[3].toString());
	 * serv.setSer_incluye(obj[4].toString());
	 * 
	 * if (obj[5].toString() != null) { serv.setSer_noincluye(obj[5].toString()); }
	 * else { serv.setSer_noincluye(null); }
	 * 
	 * if (obj[6].toString() != null) {
	 * serv.setSer_servadicionales(obj[6].toString()); } else {
	 * serv.setSer_servadicionales(null); }
	 * 
	 * serv.setServ_preciominimo(Double.parseDouble(obj[7].toString()));
	 * 
	 * if (obj[8].toString() != null) { serv.setSer_foto(obj[8].toString()); } else
	 * { serv.setSer_foto(null); }
	 * 
	 * 
	 * 
	 * if (obj[9].toString() != null) { serv.setSer_etiquetas(obj[9].toString()); }
	 * else { serv.setSer_etiquetas(null); }
	 * 
	 * serv.setSer_fecreg(LocalDateTime.parse(obj[10].toString()));
	 * serv.setSer_fecmod(LocalDateTime.parse(obj[11].toString()));
	 * serv.setSer_estado(Integer.parseInt(obj[12].toString()));
	 * 
	 * listaservicio.add(serv); }
	 * 
	 * return listaservicio;
	 * 
	 * }
	 * 
	 */
	
	/*
	 * @Override public List<Servicio> ListaServiciosUsuario(Long idUsuario) { //
	 * TODO Auto-generated method stub List<Servicio> listaservicio = new
	 * ArrayList<>(); Servicio serv; List<Object[]> lista =
	 * servicioDAO.listarServicioUsuario(idUsuario);
	 * 
	 * for (Object[] obj : lista) { serv = new Servicio();
	 * serv.setSer_cod(Long.valueOf(obj[0].toString()));
	 * serv.setSer_codusu(Long.valueOf(obj[1].toString()));
	 * serv.setSer_catsercod(Long.valueOf(obj[2].toString()));
	 * serv.setSer_titulo(obj[3].toString());
	 * serv.setSer_incluye(obj[4].toString());
	 * 
	 * System.out.println("todo bien");
	 * 
	 * if (obj[5].toString() != null) { serv.setSer_noincluye(obj[5].toString()); }
	 * else { serv.setSer_noincluye(null); }
	 * 
	 * if (obj[6].toString() != null) {
	 * serv.setSer_servadicionales(obj[6].toString()); } else {
	 * serv.setSer_servadicionales(null); }
	 * 
	 * serv.setServ_preciominimo(Double.parseDouble(obj[7].toString()));
	 * 
	 * if (obj[8].toString() != null) { serv.setSer_foto(obj[8].toString()); } else
	 * { serv.setSer_foto(null); }
	 * 
	 * 
	 * 
	 * if (obj[9].toString() != null) { serv.setSer_etiquetas(obj[9].toString()); }
	 * else { serv.setSer_etiquetas(null); }
	 * 
	 * 
	 * serv.setSer_fecreg(LocalDateTime.parse(obj[10].toString()));
	 * serv.setSer_fecmod(LocalDateTime.parse(obj[11].toString()));
	 * serv.setSer_estado(Integer.parseInt(obj[12].toString()));
	 * 
	 * listaservicio.add(serv); }
	 * 
	 * return listaservicio; }
	 * 
	 */
	@Override
	public Servicio registroServicio(Long codusu, int catsercod, String titulo, String incluye, String noincluye,
			String servadicionales, double preciominimo, String foto, String etiquetas) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Servicio> listarServicioXCat(Long catid) {

		List<Servicio> serviciototal = servicioDAO.findAll();
		List<Servicio> serviciocategoria = new ArrayList<>();

		for (Servicio servicio : serviciototal) {
			if (servicio.getSer_catsercod() == catid) {
				serviciocategoria.add(servicio);
			}
		}
		System.out.println("todogud");

		// TODO Auto-generated method stub
		return serviciocategoria;
	}

}
