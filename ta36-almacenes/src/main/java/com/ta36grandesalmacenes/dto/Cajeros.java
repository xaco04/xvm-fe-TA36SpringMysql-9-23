package com.ta36grandesalmacenes.dto;

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
@Table(name = "cajeros")
public class Cajeros {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name="nom_apels")
	private String nomApels;

	@OneToMany(mappedBy = "cajero", fetch = FetchType.LAZY)
	private List<Ventas> venta;

	// Constructores
	public Cajeros() {

	}

	public Cajeros(int codigo, String nomApels) {
		this.codigo = codigo;
		this.nomApels = nomApels;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	public String getNomApels() {
		return nomApels;
	}

	// Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
	}

	@JsonIgnore
	public List<Ventas> getVenta() {
		return venta;
	}

	public void setVenta(List<Ventas> venta) {
		this.venta = venta;
	}

	@Override
	public String toString() {
		return "Cajero [codigo = " + codigo + ", nomApels = " + nomApels + "]";
	}
}
