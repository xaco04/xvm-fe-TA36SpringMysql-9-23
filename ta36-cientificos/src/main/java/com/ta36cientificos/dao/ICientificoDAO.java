package com.ta36cientificos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ta36cientificos.dto.Cientificos;

public interface ICientificoDAO extends JpaRepository<Cientificos, String>{

}
