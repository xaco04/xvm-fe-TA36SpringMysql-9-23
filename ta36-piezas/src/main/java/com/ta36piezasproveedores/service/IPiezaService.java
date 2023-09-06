package com.ta36piezasproveedores.service;

import java.util.List;

import com.ta36piezasproveedores.dto.Piezas;

public interface IPiezaService {
	
	public List<Piezas> listarPiezas();
	
	public Piezas buscarPiezaCodigo(int codigo);
	
	public Piezas guardarPieza(Piezas pieza);
	
	public Piezas actualizarPieza(Piezas pieza);
	
	public void eliminarPieza(int codigo);

}
