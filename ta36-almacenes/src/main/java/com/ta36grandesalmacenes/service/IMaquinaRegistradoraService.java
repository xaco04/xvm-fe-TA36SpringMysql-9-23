package com.ta36grandesalmacenes.service;

import java.util.List;

import com.ta36grandesalmacenes.dto.MaquinasRegistradoras;


public interface IMaquinaRegistradoraService {

	public List<MaquinasRegistradoras> listarMaquinasRegistradoras();

	public MaquinasRegistradoras buscarMaquinaRegistradoraCodigo(int codigo);

	public MaquinasRegistradoras guardarMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora);

	public MaquinasRegistradoras actualizarMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora);

	public void eliminarMaquinaRegistradora(int codigo);
}