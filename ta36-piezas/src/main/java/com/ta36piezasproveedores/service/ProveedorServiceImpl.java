package com.ta36piezasproveedores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36piezasproveedores.dao.IProveedorDAO;
import com.ta36piezasproveedores.dto.Proveedores;

@Service
public class ProveedorServiceImpl implements IProveedoresService{

	@Autowired
	IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedores> listarProveedores() {
		
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedores buscarProveedorId(String id) {
		
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedores guardarProveedor(Proveedores proveedor) {
		
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedores actualizarProveedor(Proveedores proveedor) {
		
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		
		iProveedorDAO.deleteById(id);
	}

}
