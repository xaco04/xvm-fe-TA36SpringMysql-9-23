package com.ta36cientificos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ta36cientificos.dto.Asignaciones;
import com.ta36cientificos.service.AsignacionServiceImpl;

@RestController
public class AsignacionController {

	@Autowired
	AsignacionServiceImpl asignacionServiceImpl;
	
	@GetMapping("/asignaciones")
	public List<Asignaciones> listarAsignaciones() {
		
		return asignacionServiceImpl.listarAsignaciones();
	}
	
	@GetMapping("/asignaciones/{id}")
	public Asignaciones buscarAsignacionPorId(@PathVariable(name = "id") int id) {
		
		return asignacionServiceImpl.buscarAsignacionId(id);
	}
	
	@PostMapping("/asignaciones")
	public Asignaciones guardarAsignacion(@RequestBody Asignaciones asignacion) {
		
		return asignacionServiceImpl.guardarAsignacion(asignacion);
	}
	
	@PutMapping("/asignaciones/{id}")
	public Asignaciones actualizarAsignacion(@PathVariable(name = "id") int id, @RequestBody Asignaciones asignacion) {
		
		Asignaciones asignacionSeleccionada = new Asignaciones();
		Asignaciones asignacionActualizada = new Asignaciones();
		
		asignacionSeleccionada = asignacionServiceImpl.buscarAsignacionId(id);
		
		asignacionSeleccionada.setCientifico(asignacion.getCientifico());
		asignacionSeleccionada.setProyecto(asignacion.getProyecto());
		
		asignacionActualizada = asignacionServiceImpl.actualizarAsignacion(asignacionSeleccionada);
		
		return asignacionActualizada;
	}
	
	@DeleteMapping("/asignaciones/{id}")
	public void eliminarAsignacion(@PathVariable(name = "id") int id) {
		
		asignacionServiceImpl.eliminarAsignacion(id);
	}


}
