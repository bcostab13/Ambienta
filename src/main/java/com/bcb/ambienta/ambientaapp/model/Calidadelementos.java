package com.bcb.ambienta.ambientaapp.model;
// Generated 16/10/2016 09:54:50 PM by Hibernate Tools 5.1.0.Beta1

/**
 * Calidadelementos generated by hbm2java
 */
public class Calidadelementos implements java.io.Serializable {

	private int idCalidadElementos;
	private Proyecto proyecto;
	private Integer concentracionPm10;
	private Boolean superaNivelExtractivo;
	private Integer ruidoNpseq;

	public Calidadelementos() {
	}

	public Calidadelementos(int idCalidadElementos, Proyecto proyecto) {
		this.idCalidadElementos = idCalidadElementos;
		this.proyecto = proyecto;
	}

	public Calidadelementos(int idCalidadElementos, Proyecto proyecto, Integer concentracionPm10,
			Boolean superaNivelExtractivo, Integer ruidoNpseq) {
		this.idCalidadElementos = idCalidadElementos;
		this.proyecto = proyecto;
		this.concentracionPm10 = concentracionPm10;
		this.superaNivelExtractivo = superaNivelExtractivo;
		this.ruidoNpseq = ruidoNpseq;
	}

	public int getIdCalidadElementos() {
		return this.idCalidadElementos;
	}

	public void setIdCalidadElementos(int idCalidadElementos) {
		this.idCalidadElementos = idCalidadElementos;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Integer getConcentracionPm10() {
		return this.concentracionPm10;
	}

	public void setConcentracionPm10(Integer concentracionPm10) {
		this.concentracionPm10 = concentracionPm10;
	}

	public Boolean getSuperaNivelExtractivo() {
		return this.superaNivelExtractivo;
	}

	public void setSuperaNivelExtractivo(Boolean superaNivelExtractivo) {
		this.superaNivelExtractivo = superaNivelExtractivo;
	}

	public Integer getRuidoNpseq() {
		return this.ruidoNpseq;
	}

	public void setRuidoNpseq(Integer ruidoNpseq) {
		this.ruidoNpseq = ruidoNpseq;
	}

}
