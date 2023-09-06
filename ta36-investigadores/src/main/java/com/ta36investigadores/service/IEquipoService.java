package com.ta36investigadores.service;

import java.util.List;

import com.ta36investigadores.dto.Equipos;

public interface IEquipoService {
	
	public List<Equipos> listarEquipos();

	public Equipos buscarEquipoNumSerie(String numSerie);

	public Equipos guardarEquipo(Equipos equipo);

	public Equipos actualizarEquipo(Equipos equipo);

	public void eliminarEquipo(String numSerie);

}
