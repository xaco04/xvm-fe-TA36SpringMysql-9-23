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

import com.ta36cientificos.dto.Proyectos;
import com.ta36cientificos.service.ProyectoServiceImpl;

@RestController
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImpl;
	
	@GetMapping("/proyectos")
	public List<Proyectos> listarProyectos() {
		
		return proyectoServiceImpl.listarProyectos();
	}
	
	@GetMapping("/proyectos/{id}")
	public Proyectos buscarProyectoPorId(@PathVariable(name = "id") String id) {
		
		return proyectoServiceImpl.buscarProyectoId(id);
	}
	
	@PostMapping("/proyectos")
	public Proyectos guardarProyecto(@RequestBody Proyectos proyecto) {
		
		return proyectoServiceImpl.guardarProyecto(proyecto);
	}
	
	@PutMapping("/proyectos/{id}")
	public Proyectos actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyectos proyecto) {
		
		Proyectos proyectoSeleccionado = new Proyectos();
		Proyectos proyectoActualizado = new Proyectos();
		
		proyectoSeleccionado = proyectoServiceImpl.buscarProyectoId(id);
		
		proyectoSeleccionado.setNombre(proyecto.getNombre());
		proyectoSeleccionado.setHoras(proyecto.getHoras());
		
		proyectoActualizado = proyectoServiceImpl.actualizarProyecto(proyectoSeleccionado);
		
		return proyectoActualizado;
	}
	
	@DeleteMapping("/proyectos/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") String id) {
		
		proyectoServiceImpl.eliminarProyecto(id);
	}
}
