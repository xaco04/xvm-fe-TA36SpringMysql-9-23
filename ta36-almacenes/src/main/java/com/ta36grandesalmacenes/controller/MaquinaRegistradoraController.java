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

import com.ta36grandesalmacenes.dto.MaquinasRegistradoras;
import com.ta36grandesalmacenes.service.MaquinaRegistradoraServiceImpl;



@RestController
public class MaquinaRegistradoraController {

	@Autowired
	MaquinaRegistradoraServiceImpl maquinaRegistradoraServiceImpl;
	
	@GetMapping("/maquinasregistradoras")
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras() {
		
		return maquinaRegistradoraServiceImpl.listarMaquinasRegistradoras();
	}
	
	@GetMapping("/maquinasregistradoras/{codigo}")
	public MaquinasRegistradoras buscarMaquinaRegistradoraPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return maquinaRegistradoraServiceImpl.buscarMaquinaRegistradoraCodigo(codigo);
	}
	
	@PostMapping("/maquinasregistradoras")
	public MaquinasRegistradoras guardarMaquinaRegistradora(@RequestBody MaquinasRegistradoras maquinaRegistradora) {
		
		return maquinaRegistradoraServiceImpl.guardarMaquinaRegistradora(maquinaRegistradora);
	}
	
	@PutMapping("/maquinasregistradoras/{codigo}")
	public MaquinasRegistradoras actualizarMaquinaRegistradora(@PathVariable(name = "codigo") int codigo, @RequestBody MaquinasRegistradoras maquinaRegistradora) {
		
		MaquinasRegistradoras maquinaRegistradoraSeleccionada = new MaquinasRegistradoras();
		MaquinasRegistradoras maquinaRegistradoraActualizada = new MaquinasRegistradoras();
		
		maquinaRegistradoraSeleccionada = maquinaRegistradoraServiceImpl.buscarMaquinaRegistradoraCodigo(codigo);
		
		maquinaRegistradoraSeleccionada.setPiso(maquinaRegistradora.getPiso());
		
		maquinaRegistradoraActualizada = maquinaRegistradoraServiceImpl.actualizarMaquinaRegistradora(maquinaRegistradoraSeleccionada);
		
		return maquinaRegistradoraActualizada;
	}
	
	@DeleteMapping("/maquinasregistradoras/{codigo}")
	public void eliminarMaquinaRegistradora(@PathVariable(name = "codigo") int codigo) {
		
		maquinaRegistradoraServiceImpl.eliminarMaquinaRegistradora(codigo);
	}
}