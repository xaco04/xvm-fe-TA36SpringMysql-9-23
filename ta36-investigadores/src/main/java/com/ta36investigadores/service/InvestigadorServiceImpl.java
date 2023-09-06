package com.ta36investigadores.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ta36investigadores.dao.IInvestigadorDAO;
import com.ta36investigadores.dto.Investigadores;


@Service
public class InvestigadorServiceImpl implements IInvestigadorService{

	@Autowired
	IInvestigadorDAO iInvestigadorDAO;

	@Override
	public List<Investigadores> listarInvestigadores() {
		
		return iInvestigadorDAO.findAll();
	}

	@Override
	public Investigadores buscarInvestigadorDni(String dni) {
		
		return iInvestigadorDAO.findById(dni).get();
	}

	@Override
	public Investigadores guardarInvestigador(Investigadores investigador) {
		
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public Investigadores actualizarInvestigador(Investigadores investigador) {
		
		return iInvestigadorDAO.save(investigador);
	}

	@Override
	public void eliminarInvestigador(String dni) {
		
		iInvestigadorDAO.deleteById(dni);
	}
}