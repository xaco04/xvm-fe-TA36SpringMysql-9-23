package com.ta36grandesalmacenes.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ventas")
public class Ventas {

	// Atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codigo")
	private int codigo;

	@ManyToOne
	@JoinColumn(name = "cajero")
	private Cajeros cajero;

	@ManyToOne
	@JoinColumn(name = "maquina")
	private MaquinasRegistradoras maquinaRegistradora;

	@ManyToOne
	@JoinColumn(name = "producto")
	private Productos producto;

	// Constructores
	public Ventas() {

	}

	public Ventas(int codigo, Cajeros cajero, MaquinasRegistradoras maquinaRegistradora, Productos producto) {
		this.codigo = codigo;
		this.cajero = cajero;
		this.maquinaRegistradora = maquinaRegistradora;
		this.producto = producto;
	}

	// Getters
	public int getCodigo() {
		return codigo;
	}
	
	public Cajeros getCajero() {
		return cajero;
	}

	public MaquinasRegistradoras getMaquinaRegistradora() {
		return maquinaRegistradora;
	}
	
	public Productos getProducto() {
		return producto;
	}
	
	// Setters
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public void setCajero(Cajeros cajero) {
		this.cajero = cajero;
	}

	public void setMaquinaRegistradora(MaquinasRegistradoras maquinaRegistradora) {
		this.maquinaRegistradora = maquinaRegistradora;
	}

	public void setProducto(Productos producto) {
		this.producto = producto;
	}

	@Override
	public String toString() {
		return "Venta [codigo=" + codigo + ", cajero=" + cajero + ", maquinaRegistradora=" + maquinaRegistradora
				+ ", producto=" + producto + "]";
	}
}