package com.ta36grandesalmacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36grandesalmacenes.dao.IVentaDAO;
import com.ta36grandesalmacenes.dto.Ventas;

@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDAO iVentaDAO;

	@Override
	public List<Ventas> listarVentas() {
	    return iVentaDAO.findAll();
	}


	@Override
	public Ventas buscarVentaCodigo(int codigo) {
		
		return iVentaDAO.findById(codigo).get();
	}

	@Override
	public Ventas guardarVenta(Ventas venta) {
		
		return iVentaDAO.save(venta);
	}

	@Override
	public Ventas actualizarVenta(Ventas venta) {
		
		return iVentaDAO.save(venta);
	}

	@Override
	public void eliminarVenta(int codigo) {
		
		iVentaDAO.deleteById(codigo);
	}
}