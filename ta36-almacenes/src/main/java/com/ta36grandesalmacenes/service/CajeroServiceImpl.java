package com.ta36grandesalmacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36grandesalmacenes.dao.ICajeroDAO;
import com.ta36grandesalmacenes.dto.Cajeros;

@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDAO;

	@Override
	public List<Cajeros> listarCajeros() {
		
		return iCajeroDAO.findAll();
	}

	@Override
	public Cajeros buscarCajeroCodigo(int codigo) {
		
		return iCajeroDAO.findById(codigo).get();
	}

	@Override
	public Cajeros guardarCajero(Cajeros cajero) {
		
		return iCajeroDAO.save(cajero);
	}

	@Override
	public Cajeros actualizarCajero(Cajeros cajero) {
		
		return iCajeroDAO.save(cajero);
	}

	@Override
	public void eliminarCajero(int codigo) {
		
		iCajeroDAO.deleteById(codigo);
	}
}
