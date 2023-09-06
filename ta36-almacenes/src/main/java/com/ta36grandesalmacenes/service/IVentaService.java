package com.ta36grandesalmacenes.service;

import java.util.List;

import com.ta36grandesalmacenes.dto.Ventas;


public interface IVentaService {

	public List<Ventas> listarVentas();

	public Ventas buscarVentaCodigo(int codigo);

	public Ventas guardarVenta(Ventas venta);

	public Ventas actualizarVenta(Ventas venta);

	public void eliminarVenta(int codigo);
}