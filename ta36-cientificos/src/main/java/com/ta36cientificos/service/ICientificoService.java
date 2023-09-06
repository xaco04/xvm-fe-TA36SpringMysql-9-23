package com.ta36cientificos.service;

import java.util.List;

import com.ta36cientificos.dto.Cientificos;

public interface ICientificoService {
	
	public List<Cientificos> listarCientificos();

	public Cientificos buscarCientificoDni(String dni);

	public Cientificos guardarCientifico(Cientificos cientifico);

	public Cientificos actualizarCientifico(Cientificos cientifico);

	public void eliminarCientifico(String dni);

}
