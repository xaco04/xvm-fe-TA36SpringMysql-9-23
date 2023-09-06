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

import com.ta36piezasproveedores.dto.Piezas;
import com.ta36piezasproveedores.service.PiezaServiceImpl;

@RestController
public class PiezaController {

	@Autowired
	PiezaServiceImpl piezaServiceImpl;
	
	@GetMapping("/piezas")
	public List<Piezas> listarPiezas() {
		
		return piezaServiceImpl.listarPiezas();
	}
	
	@GetMapping("/piezas/{codigo}")
	public Piezas buscarPiezaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return piezaServiceImpl.buscarPiezaCodigo(codigo);
	}
	
	@PostMapping("/piezas")
	public Piezas guardarPieza(@RequestBody Piezas pieza) {
		
		return piezaServiceImpl.guardarPieza(pieza);
	}
	
	@PutMapping("/piezas/{codigo}")
	public Piezas actualizarPieza(@PathVariable(name = "codigo") int codigo, @RequestBody Piezas pieza) {
		
		Piezas piezaSeleccionada = new Piezas();
		Piezas piezaActualizada = new Piezas();
		
		piezaSeleccionada = piezaServiceImpl.buscarPiezaCodigo(codigo);
		
		piezaSeleccionada.setNombre(pieza.getNombre());
		
		piezaActualizada = piezaServiceImpl.actualizarPieza(piezaSeleccionada);
		
		return piezaActualizada;
	}
	
	@DeleteMapping("/piezas/{codigo}")
	public void eliminarPieza(@PathVariable(name = "codigo") int codigo) {
		
		piezaServiceImpl.eliminarPieza(codigo);
	}


}
