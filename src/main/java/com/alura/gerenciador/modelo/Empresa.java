package com.alura.gerenciador.modelo;

import java.util.Date;

public class Empresa {

	private Integer id;
	private String nombre;
	private Date fechaAbertura = new Date();
	
	
	public Empresa(String nombreEmpresa) {
		this.setNombre(nombreEmpresa);
	}
	
	public Empresa(String nombreEmpresa, Date fechaAbertura) {
		this.setNombre(nombreEmpresa);
		this.setFechaAbertura(fechaAbertura);
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaAbertura() {
		return fechaAbertura;
	}
	public void setFechaAbertura(Date fechaAbertura) {
		this.fechaAbertura = fechaAbertura;
	}

	@Override
	public String toString() {
		return "Empresa [id=" + id + ", nombre=" + nombre + ", fechaAbertura=" + fechaAbertura + "]";
	}
	
	

}
