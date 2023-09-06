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

import com.ta36cientificos.dto.Cientificos;
import com.ta36cientificos.service.CientificoServiceImpl;

@RestController
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImpl;
	
	@GetMapping("/cientificos")
	public List<Cientificos> listarCientificos() {
		
		return cientificoServiceImpl.listarCientificos();
	}
	
	@GetMapping("/cientificos/{dni}")
	public Cientificos buscarCientificoPorDni(@PathVariable(name = "dni") String dni) {
		
		return cientificoServiceImpl.buscarCientificoDni(dni);
	}
	
	@PostMapping("/cientificos")
	public Cientificos guardarCientifico(@RequestBody Cientificos cientifico) {
		
		return cientificoServiceImpl.guardarCientifico(cientifico);
	}
	
	@PutMapping("/cientificos/{dni}")
	public Cientificos actualizarCientifico(@PathVariable(name = "dni") String dni, @RequestBody Cientificos cientifico) {
		
		Cientificos cientificoSeleccionado = new Cientificos();
		Cientificos cientificoActualizado = new Cientificos();
		
		cientificoSeleccionado = cientificoServiceImpl.buscarCientificoDni(dni);
		
		cientificoSeleccionado.setNomApels(cientifico.getNomApels());
		
		cientificoActualizado = cientificoServiceImpl.actualizarCientifico(cientificoSeleccionado);
		
		return cientificoActualizado;
	}
	
	@DeleteMapping("/cientificos/{dni}")
	public void eliminarCientifico(@PathVariable(name = "dni") String dni) {
		
		cientificoServiceImpl.eliminarCientifico(dni);
	}


}
