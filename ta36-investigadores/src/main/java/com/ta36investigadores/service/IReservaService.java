package com.ta36investigadores.service;

import java.util.List;

import com.ta36investigadores.dto.Reservas;

public interface IReservaService {
	
	public List<Reservas> listarReservas();

	public Reservas buscarReservaCodigo(int codigo);

	public Reservas guardarReserva(Reservas reserva);

	public Reservas actualizarReserva(Reservas reserva);

	public void eliminarReserva(int codigo);

}
