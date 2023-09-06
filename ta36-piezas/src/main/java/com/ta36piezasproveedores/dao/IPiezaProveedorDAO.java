package com.ta36piezasproveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36piezasproveedores.dto.PiezasProveedores;

public interface IPiezaProveedorDAO extends JpaRepository<PiezasProveedores, Integer>{

}
