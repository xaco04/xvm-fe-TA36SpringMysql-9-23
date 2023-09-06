package com.ta36investigadores.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "facultades")
public class Facultades {

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "nombre")
    private String nombre;
    
    @OneToMany(mappedBy = "facultad", fetch = FetchType.LAZY)
    private List<Equipos> equipos;
    
    @OneToMany(mappedBy = "facultad", fetch = FetchType.LAZY)
    private List<Investigadores> investigadores;

    // Constructores
    public Facultades() {
        
    }

    public Facultades(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

    // Métodos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	public List<Equipos> getEquipos() {
		return equipos;
	}

	public void setEquipos(List<Equipos> equipos) {
		this.equipos = equipos;
	}

	@JsonIgnore
	public List<Investigadores> getInvestigadores() {
		return investigadores;
	}

	public void setInvestigadores(List<Investigadores> investigadores) {
		this.investigadores = investigadores;
	}

	@Override
	public String toString() {
		return "Facultad [codigo=" + codigo + ", nombre=" + nombre + "]";
	}  
}