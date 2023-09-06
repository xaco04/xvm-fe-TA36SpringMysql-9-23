package com.ta36piezasproveedores.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "piezas-proveedores")
public class PiezasProveedores {

	// Atributos
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Piezas pieza;
	
	@ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedores proveedor;
	
	@Column(name = "precio")
	private int precio;
	
	//Constructores
	
	public PiezasProveedores() {
		// TODO Auto-generated constructor stub
	}
	
	public PiezasProveedores(int id, Piezas pieza, Proveedores proveedor, int precio) {
		this.id = id;
		this.pieza = pieza;
		this.proveedor = proveedor;
		this.precio = precio;
	}

	// Getters
	public int getId() {
		return id;
	}
	
	public Piezas getPieza() {
		return pieza;
	}

	public Proveedores getProveedor() {
		return proveedor;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	// Setters
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setPieza(Piezas pieza) {
		this.pieza = pieza;
	}

	public void setProveedor(Proveedores proveedor) {
		this.proveedor = proveedor;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "PiezaProveedor [pieza = " + pieza + ", proveedor = " + proveedor + ", precio = " + precio + "]";
	}

}
