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

import com.ta36investigadores.dto.Reservas;
import com.ta36investigadores.service.ReservaServiceImpl;



@RestController
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImpl;
	
	@GetMapping("/reservas")
	public List<Reservas> listarReservas() {
		
		return reservaServiceImpl.listarReservas();
	}
	
	@GetMapping("/reservas/{codigo}")
	public Reservas buscarReservaPorCodigo(@PathVariable(name = "codigo") int codigo) {
		
		return reservaServiceImpl.buscarReservaCodigo(codigo);
	}
	
	@PostMapping("/reservas")
	public Reservas guardarReserva(@RequestBody Reservas reserva) {
		
		return reservaServiceImpl.guardarReserva(reserva);
	}
	
	@PutMapping("/reservas/{codigo}")
	public Reservas actualizarReserva(@PathVariable(name = "codigo") int codigo, @RequestBody Reservas reserva) {
		
		Reservas reservaSeleccionada = new Reservas();
		Reservas reservaActualizada = new Reservas();
		
		reservaSeleccionada = reservaServiceImpl.buscarReservaCodigo(codigo);
		
		reservaSeleccionada.setComienzo(reserva.getComienzo());
		reservaSeleccionada.setFin(reserva.getFin());
		reservaSeleccionada.setInvestigador(reserva.getInvestigador());
		reservaSeleccionada.setEquipo(reserva.getEquipo());
		
		reservaActualizada = reservaServiceImpl.actualizarReserva(reservaSeleccionada);
		
		return reservaActualizada;
	}
	
	@DeleteMapping("/reservas/{codigo}")
	public void eliminarReserva(@PathVariable(name = "codigo") int codigo) {
		
		reservaServiceImpl.eliminarReserva(codigo);
	}
}