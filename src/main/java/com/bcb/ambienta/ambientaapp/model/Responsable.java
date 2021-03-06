package com.bcb.ambienta.ambientaapp.model;
// Generated 16/10/2016 09:54:50 PM by Hibernate Tools 5.1.0.Beta1

/**
 * Responsable generated by hbm2java
 */
public class Responsable implements java.io.Serializable {

	private int idResponsable;
	private Empresa empresa;
	private String nombre;
	private String dni;
	private String email;
	private String telefono;
	private String cargo;

	public Responsable() {
	}

	public Responsable(int idResponsable, Empresa empresa, String dni) {
		this.idResponsable = idResponsable;
		this.empresa = empresa;
		this.dni = dni;
	}

	public Responsable(int idResponsable, Empresa empresa, String nombre, String dni, String email, String telefono,
			String cargo) {
		this.idResponsable = idResponsable;
		this.empresa = empresa;
		this.nombre = nombre;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		this.cargo = cargo;
	}

	public int getIdResponsable() {
		return this.idResponsable;
	}

	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}

	public Empresa getEmpresa() {
		return this.empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return this.dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefono() {
		return this.telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCargo() {
		return this.cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

}
