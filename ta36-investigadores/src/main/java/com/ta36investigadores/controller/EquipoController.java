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

import com.ta36investigadores.dto.Equipos;
import com.ta36investigadores.service.EquipoServiceImpl;



@RestController
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImpl;

	@GetMapping("/equipos")
	public List<Equipos> listarEquipos() {
		
		return equipoServiceImpl.listarEquipos();
	}
	
	@GetMapping("/equipos/{numSerie}")
	public Equipos buscarEquipoPorNumSerie(@PathVariable(name = "numSerie") String numSerie) {
		
		return equipoServiceImpl.buscarEquipoNumSerie(numSerie);
	}
	
	@PostMapping("/equipos")
	public Equipos guardarEquipo(@RequestBody Equipos equipo) {
		
		return equipoServiceImpl.guardarEquipo(equipo);
	}
	
	@PutMapping("/equipos/{numSerie}")
	public Equipos actualizarEquipo(@PathVariable(name = "numSerie") String numSerie, @RequestBody Equipos equipo) {
		
		Equipos equipoSeleccionado = new Equipos();
		Equipos equipoActualizado = new Equipos();
		
		equipoSeleccionado = equipoServiceImpl.buscarEquipoNumSerie(numSerie);
		
		equipoSeleccionado.setNombre(equipo.getNombre());
		equipoSeleccionado.setFacultad(equipo.getFacultad());
		
		equipoActualizado = equipoServiceImpl.actualizarEquipo(equipoSeleccionado);
		
		return equipoActualizado;
	}
	
	@DeleteMapping("/equipos/{numSerie}")
	public void eliminarEquipo(@PathVariable(name = "numSerie") String numSerie) {
		
		equipoServiceImpl.eliminarEquipo(numSerie);
	}
}