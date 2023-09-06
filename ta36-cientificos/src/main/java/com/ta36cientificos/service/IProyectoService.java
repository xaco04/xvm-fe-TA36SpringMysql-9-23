package com.ta36cientificos.service;

import java.util.List;

import com.ta36cientificos.dto.Proyectos;

public interface IProyectoService {
	
	public List<Proyectos> listarProyectos();

	public Proyectos buscarProyectoId(String id);

	public Proyectos guardarProyecto(Proyectos proyecto);

	public Proyectos actualizarProyecto(Proyectos proyecto);

	public void eliminarProyecto(String id);

}
