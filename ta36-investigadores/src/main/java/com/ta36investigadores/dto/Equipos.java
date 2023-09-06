package com.ta36investigadores.dto;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "equipos")
public class Equipos {

	// Atributos
    @Id
    @Column(name = "num_serie", length=4)
    private String numSerie;
    
    @Column(name = "nombre")
    private String nombre;
    
    @ManyToOne
    @JoinColumn(name = "facultad")
    private Facultades facultad;
    
    @OneToMany(mappedBy = "equipo", fetch = FetchType.LAZY)
    private List<Reservas> reservas;

    // Constructores
    public Equipos() {

    }

    public Equipos(String numSerie, String nombre, Facultades facultad) {
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.facultad = facultad;
	}

    // Métodos
	public String getNumSerie() {
		return numSerie;
	}

	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Facultades getFacultad() {
		return facultad;
	}

	public void setFacultad(Facultades facultad) {
		this.facultad = facultad;
	}

	@JsonIgnore
	public List<Reservas> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reservas> reservas) {
		this.reservas = reservas;
	}

	@Override
	public String toString() {
		return "Equipo [numSerie=" + numSerie + ", nombre=" + nombre + ", facultad=" + facultad + "]";
	}
}