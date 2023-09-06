package com.ta36cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36cientificos.dao.IAsignacionDAO;
import com.ta36cientificos.dto.Asignaciones;

@Service
public class AsignacionServiceImpl implements IAsignacionService {
	@Autowired
	IAsignacionDAO iAsignacionDAO;

	@Override
	public List<Asignaciones> listarAsignaciones() {
		
		return iAsignacionDAO.findAll();
	}

	@Override
	public Asignaciones buscarAsignacionId(int id) {
		
		return iAsignacionDAO.findById(id).get();
	}

	@Override
	public Asignaciones guardarAsignacion(Asignaciones asignacion) {
		
		return iAsignacionDAO.save(asignacion);
	}

	@Override
	public Asignaciones actualizarAsignacion(Asignaciones asignacion) {
		
		return iAsignacionDAO.save(asignacion);
	}

	@Override
	public void eliminarAsignacion(int id) {
		
		iAsignacionDAO.deleteById(id);
	}

}
