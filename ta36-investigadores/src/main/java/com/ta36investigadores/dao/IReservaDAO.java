package com.ta36investigadores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36investigadores.dto.Reservas;

public interface IReservaDAO extends JpaRepository<Reservas, Integer>{

}
