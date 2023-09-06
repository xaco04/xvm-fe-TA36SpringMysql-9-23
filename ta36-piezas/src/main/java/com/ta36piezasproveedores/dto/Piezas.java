package com.ta36piezasproveedores.dto;

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
@Table(name = "piezas")
public class Piezas {
	
	//Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "pieza", fetch = FetchType.LAZY)
	private List<PiezasProveedores> piezaProveedor;

	
	//Constructores
	
	public Piezas() {
		// TODO Auto-generated constructor stub
	}
	
	public Piezas(int codigo, String nombre) {
		this.codigo = codigo;
		this.nombre = nombre;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	public String getNombre() {
		return nombre;
	}

	// Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@JsonIgnore
	public List<PiezasProveedores> getPiezaProveedor() {
		return piezaProveedor;
	}

	public void setPiezaProveedor(List<PiezasProveedores> piezaProveedor) {
		this.piezaProveedor = piezaProveedor;
	}

	@Override
	public String toString() {
		return "Pieza [codigo = " + codigo + ", nombre = " + nombre + "]";
	}
}
