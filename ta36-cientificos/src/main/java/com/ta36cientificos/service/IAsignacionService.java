package com.ta36cientificos.service;

import java.util.List;

import com.ta36cientificos.dto.Asignaciones;

public interface IAsignacionService {
	
	public List<Asignaciones> listarAsignaciones();

	public Asignaciones buscarAsignacionId(int id);

	public Asignaciones guardarAsignacion(Asignaciones asignacion);

	public Asignaciones actualizarAsignacion(Asignaciones asignacion);

	public void eliminarAsignacion(int id);

}
