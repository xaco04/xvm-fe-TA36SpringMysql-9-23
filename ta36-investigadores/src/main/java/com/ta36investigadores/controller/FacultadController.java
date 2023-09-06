package com.ta36investigadores.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta36investigadores.dto.Facultades;
import com.ta36investigadores.service.FacultadServiceImpl;



@RestController
public class FacultadController {

	@Autowired
	FacultadServiceImpl facultadServiceImpl;
	
	@GetMapping("/facultades")
	public List<Facultades> listarFacultades() {
		
		return facultadServiceImpl.listarFacultades();
	}
	
	@GetMapping("/facultades/{codigo}")
	public Facultades buscarFacultadPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return facultadServiceImpl.buscarFacultadCodigo(codigo);
	}
	
	@PostMapping("/facultades")
	public Facultades guardarFacultad(@RequestBody Facultades facultad) {
		
		return facultadServiceImpl.guardarFacultad(facultad);
	}
	
	@PutMapping("/facultades/{codigo}")
	public Facultades actualizarFacultad(@PathVariable(name = "codigo") int codigo, @RequestBody Facultades facultad) {
		
		Facultades facultadSeleccionada = new Facultades();
		Facultades facultadActualizada = new Facultades();
		
		facultadSeleccionada = facultadServiceImpl.buscarFacultadCodigo(codigo);
		
		facultadSeleccionada.setNombre(facultad.getNombre());
		
		facultadActualizada = facultadServiceImpl.actualizarFacultad(facultadSeleccionada);
		
		return facultadActualizada;
	}
	
	@DeleteMapping("/facultades/{codigo}")
	public void eliminarFacultad(@PathVariable(name = "codigo") int codigo) {
		
		facultadServiceImpl.eliminarFacultad(codigo);
	}
}