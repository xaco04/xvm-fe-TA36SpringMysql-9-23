package com.ta36investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36investigadores.dto.Investigadores;

public interface IInvestigadorDAO extends JpaRepository<Investigadores, String>{

}
