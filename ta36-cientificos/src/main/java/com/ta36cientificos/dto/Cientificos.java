package com.ta36cientificos.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cientificos")
public class Cientificos {

	// Atributos
	@Id
	@Column(name = "dni", length=8)
	private String dni;

	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany(mappedBy = "cientifico", fetch = FetchType.LAZY)
	private List<Asignaciones> asignacion;

	//Constructores
	
	public Cientificos() {
		super();	
	}
	
	public Cientificos(String dni, String nomApels) {
		this.dni = dni;
		this.nomApels = nomApels;
	}

	// Getters
	public String getDni() {
		return dni;
	}
	public String getNomApels() {
		return nomApels;
	}
	
	// Setters

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	public List<Asignaciones> getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(List<Asignaciones> asignacion) {
		this.asignacion = asignacion;
	}

	@Override
	public String toString() {
		return "Cientifico [dni = " + dni + ", nomApels = " + nomApels + "]";
	}

}
