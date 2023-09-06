package com.ta36grandesalmacenes.service;

import java.util.List;

import com.ta36grandesalmacenes.dto.Cajeros;


public interface ICajeroService {

	public List<Cajeros> listarCajeros();

	public Cajeros buscarCajeroCodigo(int codigo);

	public Cajeros guardarCajero(Cajeros cajero);

	public Cajeros actualizarCajero(Cajeros cajero);

	public void eliminarCajero(int codigo);
}