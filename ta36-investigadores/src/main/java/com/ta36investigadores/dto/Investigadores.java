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
@Table(name = "investigadores")
public class Investigadores {

	// Atributos
	@Id
	@Column(name = "dni", length = 8)
	private String dni;

	@Column(name="nom_apels")
	private String nomApels;

	@ManyToOne
	@JoinColumn(name = "facultad")
	private Facultades facultad;

	@OneToMany(mappedBy = "investigador", fetch = FetchType.LAZY)
	private List<Reservas> reservas;

	// Constructores
	public Investigadores() {

	}

	public Investigadores(String dni, String nomApels, Facultades facultad) {
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultad = facultad;
	}

	// Métodos
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNomApels() {
		return nomApels;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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

	public void setReservas(List<Reservas> reserva) {
		this.reservas = reserva;
	}

	@Override
	public String toString() {
		return "Investigador [dni=" + dni + ", nomApels=" + nomApels + ", facultad=" + facultad + "]";
	}
}