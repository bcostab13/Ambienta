package com.bcb.ambienta.ambientaapp.model;
// Generated 16/10/2016 09:54:50 PM by Hibernate Tools 5.1.0.Beta1

/**
 * Meteorologia generated by hbm2java
 */
public class Meteorologia implements java.io.Serializable {

	private int idMeteorologia;
	private Proyecto proyecto;
	private String variable;
	private String tipoValor;
	private String valor;

	public Meteorologia() {
	}

	public Meteorologia(int idMeteorologia, Proyecto proyecto) {
		this.idMeteorologia = idMeteorologia;
		this.proyecto = proyecto;
	}

	public Meteorologia(int idMeteorologia, Proyecto proyecto, String variable, String tipoValor, String valor) {
		this.idMeteorologia = idMeteorologia;
		this.proyecto = proyecto;
		this.variable = variable;
		this.tipoValor = tipoValor;
		this.valor = valor;
	}

	public int getIdMeteorologia() {
		return this.idMeteorologia;
	}

	public void setIdMeteorologia(int idMeteorologia) {
		this.idMeteorologia = idMeteorologia;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public String getVariable() {
		return this.variable;
	}

	public void setVariable(String variable) {
		this.variable = variable;
	}

	public String getTipoValor() {
		return this.tipoValor;
	}

	public void setTipoValor(String tipoValor) {
		this.tipoValor = tipoValor;
	}

	public String getValor() {
		return this.valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

}
