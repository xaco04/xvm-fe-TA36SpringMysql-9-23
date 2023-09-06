package com.ta36piezasproveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36piezasproveedores.dto.Proveedores;

public interface IProveedorDAO extends JpaRepository<Proveedores, String>{

}
