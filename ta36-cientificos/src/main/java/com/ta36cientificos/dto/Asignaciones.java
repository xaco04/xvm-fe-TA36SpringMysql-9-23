package com.ta36cientificos.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "asignaciones")
public class Asignaciones {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    
    @ManyToOne
    @JoinColumn(name = "cientifico")
    private Cientificos cientifico;
    
    @ManyToOne
    @JoinColumn(name = "proyecto")
    
    private Proyectos proyecto;


	public Asignaciones() {
		super();
	}
	
	public Asignaciones(int id, Cientificos cientifico, Proyectos proyecto) {
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

    // Getters
	public int getId() {
		return id;
	}
	
	public Cientificos getCientifico() {
		return cientifico;
	}
	
	public Proyectos getProyecto() {
		return proyecto;
	}

	// Setters 
	public void setId(int id) {
		this.id = id;
	}

	public void setCientifico(Cientificos cientifico) {
		this.cientifico = cientifico;
	}


	public void setProyecto(Proyectos proyecto) {
		this.proyecto = proyecto;
	}

	@Override
	public String toString() {
		return "Asignacion [id=" + id + ", cientifico=" + cientifico + ", proyecto=" + proyecto + "]";
	}

}
