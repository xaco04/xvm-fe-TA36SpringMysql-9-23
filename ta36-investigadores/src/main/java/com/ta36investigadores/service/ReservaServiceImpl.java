package com.ta36investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36investigadores.dao.IReservaDAO;
import com.ta36investigadores.dto.Reservas;


@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO iReservaDAO;

	@Override
	public List<Reservas> listarReservas() {
		
		return iReservaDAO.findAll();
	}

	@Override
	public Reservas buscarReservaCodigo(int codigo) {
		
		return iReservaDAO.findById(codigo).get();
	}

	@Override
	public Reservas guardarReserva(Reservas reserva) {
		
		return iReservaDAO.save(reserva);
	}

	@Override
	public Reservas actualizarReserva(Reservas reserva) {
		
		return iReservaDAO.save(reserva);
	}

	@Override
	public void eliminarReserva(int codigo) {
		
		iReservaDAO.deleteById(codigo);
	}
}