package com.ta36grandesalmacenes.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta36grandesalmacenes.dto.Productos;
import com.ta36grandesalmacenes.service.ProductoServiceImpl;



@RestController
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImpl;
	
	@GetMapping("/productos")
	public List<Productos> listarProductos() {
		
		return productoServiceImpl.listarProductos();
	}
	
	@GetMapping("/productos/{codigo}")
	public Productos buscarProductoPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return productoServiceImpl.buscarProductoCodigo(codigo);
	}
	
	@PostMapping("/productos")
	public Productos guardarProducto(@RequestBody Productos producto) {
		
		return productoServiceImpl.guardarProducto(producto);
	}
	
	@PutMapping("/productos/{codigo}")
	public Productos actualizarProducto(@PathVariable(name = "codigo") int codigo, @RequestBody Productos producto) {
		
		Productos productoSeleccionado = new Productos();
		Productos productoActualizado = new Productos();
		
		productoSeleccionado = productoServiceImpl.buscarProductoCodigo(codigo);
		
		productoSeleccionado.setNombre(producto.getNombre());
		productoSeleccionado.setPrecio(producto.getPrecio());
		
		productoActualizado = productoServiceImpl.actualizarProducto(productoSeleccionado);
		
		return productoActualizado;
	}
	
	@DeleteMapping("/productos/{codigo}")
	public void eliminarProducto(@PathVariable(name = "codigo") int codigo) {
		
		productoServiceImpl.eliminarProducto(codigo);
	}
}