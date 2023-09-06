package com.ta36grandesalmacenes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36grandesalmacenes.dao.IMaquinaRegistradora;
import com.ta36grandesalmacenes.dto.MaquinasRegistradoras;

@Service
public class MaquinaRegistradoraServiceImpl implements IMaquinaRegistradoraService {

	@Autowired
	IMaquinaRegistradora iMaquinaRegistradoraDAO;

	@Override
	public List<MaquinasRegistradoras> listarMaquinasRegistradoras() {
		
		return iMaquinaRegistradoraDAO.findAll();
	}

	@Override
	public MaquinasRegistradoras buscarMaquinaRegistradoraCodigo(int codigo) {
		
		return iMaquinaRegistradoraDAO.findById(codigo).get();
	}

	@Override
	public MaquinasRegistradoras guardarMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora) {
		
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public MaquinasRegistradoras actualizarMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora) {
		
		return iMaquinaRegistradoraDAO.save(maquinaRegistradora);
	}

	@Override
	public void eliminarMaquinaRegistradora(int codigo) {
		
		iMaquinaRegistradoraDAO.deleteById(codigo);
	}
}