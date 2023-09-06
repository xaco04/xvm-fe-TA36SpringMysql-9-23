package com.ta36piezasproveedores.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36piezasproveedores.dto.Piezas;

public interface IPiezaDAO extends JpaRepository<Piezas, Integer> {

}
