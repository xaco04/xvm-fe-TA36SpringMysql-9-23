package com.ta36investigadores.service;

import java.util.List;

import com.ta36investigadores.dto.Facultades;

public interface IFacultadService {
	
	public List<Facultades> listarFacultades();

	public Facultades buscarFacultadCodigo(int codigo);

	public Facultades guardarFacultad(Facultades facultad);

	public Facultades actualizarFacultad(Facultades facultad);

	public void eliminarFacultad(int codigo);

}
