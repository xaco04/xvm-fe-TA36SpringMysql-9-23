package com.ta36grandesalmacenes.service;

import java.util.List;

import com.ta36grandesalmacenes.dto.Productos;


public interface IProductoService {

	public List<Productos> listarProductos();

	public Productos buscarProductoCodigo(int codigo);

	public Productos guardarProducto(Productos producto);

	public Productos actualizarProducto(Productos producto);

	public void eliminarProducto(int codigo);
}