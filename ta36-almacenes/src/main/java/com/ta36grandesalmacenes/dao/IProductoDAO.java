package com.ta36grandesalmacenes.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36grandesalmacenes.dto.Productos;

public interface IProductoDAO extends JpaRepository<Productos, Integer>{

}
