package com.example.demo.models;

import javax.persistence.*;

@Entity
@Table (name = "farmacia")


public class Farmacia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(unique = true, nullable = false)
	private Integer id_farmacia;
	private String nombre_farmacia;
	private String direccion;
	private Integer telefono;
	private String horario;
	private String descripcion;
	private String logo;
	private Integer id_usuario;
	public int getId_farmacia() {
		return id_farmacia;
	}
	public void setId_farmacia(int id_farmacia) {
		this.id_farmacia = id_farmacia;
	}
	public String getNombre_farmacia() {
		return nombre_farmacia;
	}
	public void setNombre_farmacia(String nombre_farmacia) {
		this.nombre_farmacia = nombre_farmacia;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLogo() {
		return logo;
	}
	public void setLogo(String logo) {
		this.logo = logo;
	}
	public Integer getId_usuario() {
		return id_usuario;
	}
	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}
}
