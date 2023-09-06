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

import com.ta36piezasproveedores.dto.Proveedores;
import com.ta36piezasproveedores.service.ProveedorServiceImpl;

@RestController
public class ProveedorController {

	@Autowired
	ProveedorServiceImpl proveedorServiceImpl;
	
	@GetMapping("/proveedores")
	public List<Proveedores> listarProveedores() {
		
		return proveedorServiceImpl.listarProveedores();
	}
	
	@GetMapping("/proveedores/{id}")
	public Proveedores buscarProveedorPorId(@PathVariable(name = "id") String id) {
		
		return proveedorServiceImpl.buscarProveedorId(id);
	}
	
	@PostMapping("/proveedores")
	public Proveedores guardarProveedor(@RequestBody Proveedores proveedor) {
		
		return proveedorServiceImpl.guardarProveedor(proveedor);
	}
	
	@PutMapping("/proveedores/{id}")
	public Proveedores actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedores proveedor) {
		
		Proveedores proveedorSeleccionado = new Proveedores();
		Proveedores proveedorActualizado = new Proveedores();
		
		proveedorSeleccionado = proveedorServiceImpl.buscarProveedorId(id);
		
		proveedorSeleccionado.setNombre(proveedor.getNombre());
		
		proveedorActualizado = proveedorServiceImpl.actualizarProveedor(proveedorSeleccionado);
		
		return proveedorActualizado;
	}
	
	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name = "id") String id) {
		
		proveedorServiceImpl.eliminarProveedor(id);
	}

}
