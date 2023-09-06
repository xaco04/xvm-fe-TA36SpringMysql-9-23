package com.ta36cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36cientificos.dto.Proyectos;

public interface IProyectoDAO extends JpaRepository<Proyectos, String> {

}
