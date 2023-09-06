package com.ta36investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36investigadores.dao.IEquipoDAO;
import com.ta36investigadores.dto.Equipos;



@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDAO;

	@Override
	public List<Equipos> listarEquipos() {
		
		return iEquipoDAO.findAll();
	}

	@Override
	public Equipos buscarEquipoNumSerie(String numSerie) {
		
		return iEquipoDAO.findById(numSerie).get();
	}

	@Override
	public Equipos guardarEquipo(Equipos equipo) {
		
		return iEquipoDAO.save(equipo);
	}

	@Override
	public Equipos actualizarEquipo(Equipos equipo) {
		
		return iEquipoDAO.save(equipo);
	}

	@Override
	public void eliminarEquipo(String numSerie) {
		
		iEquipoDAO.deleteById(numSerie);
	}
}