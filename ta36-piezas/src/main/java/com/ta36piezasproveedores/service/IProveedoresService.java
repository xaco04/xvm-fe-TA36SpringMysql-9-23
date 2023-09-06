package com.ta36piezasproveedores.service;

import java.util.List;

import com.ta36piezasproveedores.dto.Proveedores;

public interface IProveedoresService {
	
	public List<Proveedores> listarProveedores();

	public Proveedores buscarProveedorId(String id);

	public Proveedores guardarProveedor(Proveedores proveedor);

	public Proveedores actualizarProveedor(Proveedores proveedor);

	public void eliminarProveedor(String id);

}
