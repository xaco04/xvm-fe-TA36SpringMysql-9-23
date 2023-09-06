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

import com.ta36grandesalmacenes.dto.Cajeros;
import com.ta36grandesalmacenes.service.CajeroServiceImpl;

@RestController
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImpl;
	
	@GetMapping("/cajeros")
	public List<Cajeros> listarCajeros() {
		
		return cajeroServiceImpl.listarCajeros();
	}
	
	@GetMapping("/cajeros/{codigo}")
	public Cajeros buscarCajeroPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return cajeroServiceImpl.buscarCajeroCodigo(codigo);
	}
	
	@PostMapping("/cajeros")
	public Cajeros guardarCajero(@RequestBody Cajeros cajero) {
		
		return cajeroServiceImpl.guardarCajero(cajero);
	}
	
	@PutMapping("/cajeros/{codigo}")
	public Cajeros actualizarCajero(@PathVariable(name = "codigo") int codigo, @RequestBody Cajeros cajero) {
		
		Cajeros cajeroSeleccionado = new Cajeros();
		Cajeros cajeroActualizado = new Cajeros();
		
		cajeroSeleccionado = cajeroServiceImpl.buscarCajeroCodigo(codigo);
		
		cajeroSeleccionado.setNomApels(cajero.getNomApels());
		
		cajeroActualizado = cajeroServiceImpl.actualizarCajero(cajeroSeleccionado);
		
		return cajeroActualizado;
	}
	
	@DeleteMapping("/cajeros/{codigo}")
	public void eliminarCajero(@PathVariable(name = "codigo") int codigo) {
		
		cajeroServiceImpl.eliminarCajero(codigo);
	}
}
