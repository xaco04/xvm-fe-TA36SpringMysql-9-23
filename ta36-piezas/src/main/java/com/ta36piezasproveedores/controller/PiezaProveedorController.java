package com.ta36piezasproveedores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta36piezasproveedores.dto.PiezasProveedores;
import com.ta36piezasproveedores.service.PiezaProveedorServiceImpl;

@RestController
public class PiezaProveedorController {

	@Autowired
	PiezaProveedorServiceImpl piezaProveedorServiceImpl;
	
	@GetMapping("/piezasproveedores")
	public List<PiezasProveedores> listarPiezasProveedores() {
		
		return piezaProveedorServiceImpl.listarPiezasProveedores();
	}
	
	@GetMapping("/piezasproveedores/{id}")
	public PiezasProveedores buscarPiezaProveedorPorId(@PathVariable(name = "id") int id) {
		
		return piezaProveedorServiceImpl.buscarPiezaProveedorId(id);
	}
	
	@PostMapping("/piezasproveedores")
	public PiezasProveedores guardarPiezaProveedor(@RequestBody PiezasProveedores piezaProveedor) {
		
		return piezaProveedorServiceImpl.guardarPiezaProveedor(piezaProveedor);
	}
	
	@PutMapping("/piezasproveedores/{id}")
	public PiezasProveedores actualizarPiezaProveedor(@PathVariable(name = "id") int id, @RequestBody PiezasProveedores piezaProveedor) {
		
		PiezasProveedores piezaProveedorSeleccionado = new PiezasProveedores();
		PiezasProveedores piezaProveedorActualizado = new PiezasProveedores();
		
		piezaProveedorSeleccionado = piezaProveedorServiceImpl.buscarPiezaProveedorId(id);
		
		piezaProveedorSeleccionado.setPieza(piezaProveedor.getPieza());
		piezaProveedorSeleccionado.setProveedor(piezaProveedor.getProveedor());
		piezaProveedorSeleccionado.setPrecio(piezaProveedor.getPrecio());
		
		piezaProveedorActualizado = piezaProveedorServiceImpl.actualizarPiezaProveedor(piezaProveedorSeleccionado);
		
		return piezaProveedorActualizado;
	}
	
	@DeleteMapping("/piezasproveedores/{id}")
	public void eliminarPiezaProveedor(@PathVariable(name = "id") int id) {
		
		piezaProveedorServiceImpl.eliminarPiezaProveedor(id);
	}

}
