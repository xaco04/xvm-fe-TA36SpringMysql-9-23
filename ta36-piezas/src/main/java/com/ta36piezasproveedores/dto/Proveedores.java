package com.ta36piezasproveedores.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "proveedores")
public class Proveedores {
	
	// Atributos
	
	@Id
	@Column(name = "id", length = 4)
	private String id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany(mappedBy = "proveedor", fetch = FetchType.LAZY)
	private List<PiezasProveedores> piezaProveedor;

	
	// Constructores
	
	public Proveedores() {
		// TODO Auto-generated constructor stub
	}
	
	public Proveedores(String id, String nombre) {
		this.id = id;
		this.nombre = nombre;
	}

	// Getters
	public String getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}
	
	// Setters
	
	public void setId(String id) {
		this.id = id;
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
		return "Proveedor [id = " + id + ", nombre = " + nombre + "]";
	}

}
