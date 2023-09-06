package com.ta36investigadores.service;

import java.util.List;

import com.ta36investigadores.dto.Investigadores;

public interface IInvestigadorService {
	
	public List<Investigadores> listarInvestigadores();

	public Investigadores buscarInvestigadorDni(String dni);

	public Investigadores guardarInvestigador(Investigadores investigador);

	public Investigadores actualizarInvestigador(Investigadores investigador);

	public void eliminarInvestigador(String dni);

}
