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

import com.ta36investigadores.dto.Investigadores;
import com.ta36investigadores.service.InvestigadorServiceImpl;



@RestController
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImpl;
	
	@GetMapping("/investigadores")
	public List<Investigadores> listarInvestigadores() {
		
		return investigadorServiceImpl.listarInvestigadores();
	}
	
	@GetMapping("/investigadores/{dni}")
	public Investigadores buscarInvestigadorPorDni(@PathVariable(name = "dni") String dni) {
		
		return investigadorServiceImpl.buscarInvestigadorDni(dni);
	}
	
	@PostMapping("/investigadores")
	public Investigadores guardarInvestigador(@RequestBody Investigadores investigador) {
		
		return investigadorServiceImpl.guardarInvestigador(investigador);
	}
	
	@PutMapping("/investigadores/{dni}")
	public Investigadores actualizarInvestigador(@PathVariable(name = "dni") String dni, @RequestBody Investigadores investigador) {
		
		Investigadores investigadorSeleccionado = new Investigadores();
		Investigadores investigadorActualizado = new Investigadores();
		
		investigadorSeleccionado = investigadorServiceImpl.buscarInvestigadorDni(dni);
		
		investigadorSeleccionado.setNomApels(investigador.getNomApels());
		investigadorSeleccionado.setFacultad(investigador.getFacultad());
		
		investigadorActualizado = investigadorServiceImpl.actualizarInvestigador(investigadorSeleccionado);
		
		return investigadorActualizado;
	}
	
	@DeleteMapping("/investigadores/{dni}")
	public void eliminarInvestigador(@PathVariable(name = "dni") String dni) {
		
		investigadorServiceImpl.eliminarInvestigador(dni);
	}
}