package com.ta36grandesalmacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36grandesalmacenes.dao.IProductoDAO;
import com.ta36grandesalmacenes.dto.Productos;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO iProductoDAO;

	@Override
	public List<Productos> listarProductos() {

		return iProductoDAO.findAll();
	}

	@Override
	public Productos buscarProductoCodigo(int codigo) {

		return iProductoDAO.findById(codigo).get();
	}

	@Override
	public Productos guardarProducto(Productos producto) {

		return iProductoDAO.save(producto);
	}

	@Override
	public Productos actualizarProducto(Productos producto) {

		return iProductoDAO.save(producto);
	}

	@Override
	public void eliminarProducto(int codigo) {

		iProductoDAO.deleteById(codigo);
	}
}