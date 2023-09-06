package com.ta36piezasproveedores.service;

import java.util.List;

import com.ta36piezasproveedores.dto.PiezasProveedores;

public interface IPiezaProveedorService {
	
	public List<PiezasProveedores> listarPiezasProveedores();

	public PiezasProveedores buscarPiezaProveedorId(int id);

	public PiezasProveedores guardarPiezaProveedor(PiezasProveedores piezaProveedor);

	public PiezasProveedores actualizarPiezaProveedor(PiezasProveedores piezaProveedor);

	public void eliminarPiezaProveedor(int id);

}
