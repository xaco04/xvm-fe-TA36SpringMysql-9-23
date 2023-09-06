package com.ta36cientificos.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proyectos")
public class Proyectos {
	
	// Atributos
	
	@Id
	@Column(name = "id", length=4)
	private String id;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "horas")
	private int horas;

	@OneToMany(mappedBy = "proyecto")
	private List<Asignaciones> asignacion;

	
	//Constructores
	
	public Proyectos() {
		super();	
	}
	
	
	public Proyectos(String id, String nombre, int horas) {
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
	}

	// Getters
	public String getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public int getHoras() {
		return horas;
	}
	
	// Setters
	public void setId(String id) {
		this.id = id;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setHoras(int horas) {
		this.horas = horas;
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
		return "Proyecto [id=" + id + ", nombre=" + nombre + ", horas=" + horas + "]";
	}

}
