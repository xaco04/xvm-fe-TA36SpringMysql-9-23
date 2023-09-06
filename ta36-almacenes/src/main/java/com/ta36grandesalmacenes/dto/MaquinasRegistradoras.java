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
@Table(name = "maquinas_registradoras")
public class MaquinasRegistradoras {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name = "piso")
	private int piso;

	@OneToMany(mappedBy = "maquinaRegistradora", fetch = FetchType.LAZY)
	private List<Ventas> venta;

	// Constructores
	public MaquinasRegistradoras() {

	}

	public MaquinasRegistradoras(int codigo, int piso) {
		this.codigo = codigo;
		this.piso = piso;
	}

	
	// Getters
	public int getCodigo() {
		return codigo;
	}
	
	public int getPiso() {
		return piso;
	}
	
	// Setters 
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setPiso(int piso) {
		this.piso = piso;
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
		return "MaquinaRegistradora [codigo = " + codigo + ", piso = " + piso + "]";
	}	
}
