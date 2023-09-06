package com.ta36cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36cientificos.dao.IProyectoDAO;
import com.ta36cientificos.dto.Proyectos;

@Service
public class ProyectoServiceImpl implements IProyectoService {
	
	@Autowired
	IProyectoDAO iProyectoDAO;

	@Override
	public List<Proyectos> listarProyectos() {
		
		return iProyectoDAO.findAll();
	}

	@Override
	public Proyectos buscarProyectoId(String id) {
		
		return iProyectoDAO.findById(id).get();
	}

	@Override
	public Proyectos guardarProyecto(Proyectos proyecto) {
		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public Proyectos actualizarProyecto(Proyectos proyecto) {
		
		return iProyectoDAO.save(proyecto);
	}

	@Override
	public void eliminarProyecto(String id) {
		
		iProyectoDAO.deleteById(id);
	}
}
