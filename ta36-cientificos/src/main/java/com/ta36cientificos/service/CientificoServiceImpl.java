package com.ta36cientificos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36cientificos.dao.ICientificoDAO;
import com.ta36cientificos.dto.Cientificos;

@Service
public class CientificoServiceImpl implements ICientificoService {
	
	@Autowired
	ICientificoDAO iCientificoDAO;

	@Override
	public List<Cientificos> listarCientificos() {
		
		return iCientificoDAO.findAll();
	}

	@Override
	public Cientificos buscarCientificoDni(String dni) {
		
		return iCientificoDAO.findById(dni).get();
	}

	@Override
	public Cientificos guardarCientifico(Cientificos cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public Cientificos actualizarCientifico(Cientificos cientifico) {
		
		return iCientificoDAO.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String dni) {
		
		iCientificoDAO.deleteById(dni);
	}


}
