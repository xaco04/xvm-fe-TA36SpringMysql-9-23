package com.ta36grandesalmacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36grandesalmacenes.dto.Ventas;

public interface IVentaDAO extends JpaRepository<Ventas, Integer>{

}
