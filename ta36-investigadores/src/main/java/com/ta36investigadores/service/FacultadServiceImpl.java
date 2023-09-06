package com.ta36investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36investigadores.dao.IFacultadDAO;
import com.ta36investigadores.dto.Facultades;



@Service
public class FacultadServiceImpl implements IFacultadService {

	@Autowired
	IFacultadDAO iFacultadDAO;

	@Override
	public List<Facultades> listarFacultades() {
		
		return iFacultadDAO.findAll();
	}

	@Override
	public Facultades buscarFacultadCodigo(int codigo) {
		
		return iFacultadDAO.findById(codigo).get();
	}

	@Override
	public Facultades guardarFacultad(Facultades facultad) {
		
		return iFacultadDAO.save(facultad);
	}

	@Override
	public Facultades actualizarFacultad(Facultades facultad) {
		
		return iFacultadDAO.save(facultad);
	}

	@Override
	public void eliminarFacultad(int codigo) {
		
		iFacultadDAO.deleteById(codigo);
	}
}