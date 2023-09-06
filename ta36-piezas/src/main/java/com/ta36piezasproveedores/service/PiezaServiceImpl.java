package com.ta36piezasproveedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36piezasproveedores.dao.IPiezaDAO;
import com.ta36piezasproveedores.dto.Piezas;

@Service
public class PiezaServiceImpl implements IPiezaService {
	
	@Autowired
	IPiezaDAO iPiezaDAO;

	@Override
	public List<Piezas> listarPiezas() {
		
		return iPiezaDAO.findAll();
	}

	@Override
	public Piezas buscarPiezaCodigo(int codigo) {
		
		return iPiezaDAO.findById(codigo).get();
	}

	@Override
	public Piezas guardarPieza(Piezas pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Piezas actualizarPieza(Piezas pieza) {
		
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int codigo) {
		
		iPiezaDAO.deleteById(codigo);
	}

}
