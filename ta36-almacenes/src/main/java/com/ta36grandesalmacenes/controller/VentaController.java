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

import com.ta36grandesalmacenes.dto.Ventas;
import com.ta36grandesalmacenes.service.VentaServiceImpl;



@RestController
public class VentaController {

	@Autowired
	VentaServiceImpl ventaServiceImpl;
	
	@GetMapping("/ventas")
	public List<Ventas> listarVentas() {
		
		return ventaServiceImpl.listarVentas();
	}
	
	@GetMapping("/ventas/{codigo}")
	public Ventas buscarVentaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return ventaServiceImpl.buscarVentaCodigo(codigo);
	}
	
	@PostMapping("/ventas")
	public Ventas guardarVenta(@RequestBody Ventas venta) {
		
		return ventaServiceImpl.guardarVenta(venta);
	}
	
	@PutMapping("/ventas/{codigo}")
	public Ventas actualizarVenta(@PathVariable(name = "codigo") int codigo, @RequestBody Ventas venta) {
		
		Ventas ventaSeleccionada = new Ventas();
		Ventas ventaActualizada = new Ventas();
		
		ventaSeleccionada = ventaServiceImpl.buscarVentaCodigo(codigo);
		
		ventaSeleccionada.setCajero(venta.getCajero());
		ventaSeleccionada.setMaquinaRegistradora(venta.getMaquinaRegistradora());
		ventaSeleccionada.setProducto(venta.getProducto());
		
		ventaActualizada = ventaServiceImpl.actualizarVenta(ventaSeleccionada);
		
		return ventaActualizada;
	}
	
	@DeleteMapping("/ventas/{codigo}")
	public void eliminarVenta(@PathVariable(name = "codigo") int codigo) {
		
		ventaServiceImpl.eliminarVenta(codigo);
	}
}