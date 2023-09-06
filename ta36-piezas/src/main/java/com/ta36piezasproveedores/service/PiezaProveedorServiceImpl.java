package com.ta36piezasproveedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36piezasproveedores.dao.IPiezaProveedorDAO;
import com.ta36piezasproveedores.dto.PiezasProveedores;

@Service
public class PiezaProveedorServiceImpl implements IPiezaProveedorService {

	@Autowired
	IPiezaProveedorDAO iPiezaProveedorDAO;

	@Override
	public List<PiezasProveedores> listarPiezasProveedores() {
		
		return iPiezaProveedorDAO.findAll();
	}

	@Override
	public PiezasProveedores buscarPiezaProveedorId(int id) {
		
		return iPiezaProveedorDAO.findById(id).get();
	}

	@Override
	public PiezasProveedores guardarPiezaProveedor(PiezasProveedores piezaProveedor) {
		
		return iPiezaProveedorDAO.save(piezaProveedor);
	}

	@Override
	public PiezasProveedores actualizarPiezaProveedor(PiezasProveedores piezaProveedor) {
		
		return iPiezaProveedorDAO.save(piezaProveedor);
	}

	@Override
	public void eliminarPiezaProveedor(int id) {
		
		iPiezaProveedorDAO.deleteById(id);
	}

}
