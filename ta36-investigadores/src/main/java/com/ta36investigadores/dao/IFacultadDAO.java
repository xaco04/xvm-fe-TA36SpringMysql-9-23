package com.ta36investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36investigadores.dto.Facultades;

public interface IFacultadDAO extends JpaRepository<Facultades, Integer>{

}
