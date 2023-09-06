package com.ta36investigadores.dto;

import java.time.LocalDateTime;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "reservas")
public class Reservas {

	// Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "codigo")
    private int codigo;
    
    @Column(name = "comienzo")
    private LocalDateTime comienzo;
    
    @Column(name = "fin")
    private LocalDateTime fin;
    
    @ManyToOne
    @JoinColumn(name = "dni")
    private Investigadores investigador;
    
    @ManyToOne
    @JoinColumn(name = "num_serie")
    private Equipos equipo;

    // Constructores
    public Reservas() {
        
    }
    
    public Reservas(int codigo, LocalDateTime comienzo, LocalDateTime fin, Investigadores investigador, Equipos equipo) {
		this.codigo = codigo;
		this.comienzo = comienzo;
		this.fin = fin;
		this.investigador = investigador;
		this.equipo = equipo;
	}

    // Métodos
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public LocalDateTime getComienzo() {
		return comienzo;
	}

	public void setComienzo(LocalDateTime comienzo) {
		this.comienzo = comienzo;
	}

	public LocalDateTime getFin() {
		return fin;
	}

	public void setFin(LocalDateTime fin) {
		this.fin = fin;
	}

	public Investigadores getInvestigador() {
		return investigador;
	}

	public void setInvestigador(Investigadores investigador) {
		this.investigador = investigador;
	}

	public Equipos getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipos equipo) {
		this.equipo = equipo;
	}

	@Override
	public String toString() {
		return "Reserva [codigo=" + codigo + ", comienzo=" + comienzo + ", fin=" + fin + ", investigador="
				+ investigador + ", equipo=" + equipo + "]";
	}
}