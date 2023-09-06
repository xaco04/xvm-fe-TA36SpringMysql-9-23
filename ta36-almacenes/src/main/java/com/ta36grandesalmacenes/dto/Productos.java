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
@Table(name = "productos")
public class Productos {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "precio")
	private int precio;

	@OneToMany(mappedBy = "producto", fetch = FetchType.LAZY)
	private List<Ventas> venta;

	// Constructores
	public Productos() {

	}

	public Productos(int codigo, String nombre, int precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.precio = precio;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getPrecio() {
		return precio;
	}
	
	// Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public void setPrecio(int precio) {
		this.precio = precio;
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
		return "Producto [codigo = " + codigo + ", nombre = " + nombre + ", precio = " + precio + "]";
	}
}
