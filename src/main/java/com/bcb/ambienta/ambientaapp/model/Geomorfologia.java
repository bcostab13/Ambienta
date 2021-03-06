package com.bcb.ambienta.ambientaapp.model;
// Generated 16/10/2016 09:54:50 PM by Hibernate Tools 5.1.0.Beta1

/**
 * Geomorfologia generated by hbm2java
 */
public class Geomorfologia implements java.io.Serializable {

	private int idGeomorfologia;
	private Proyecto proyecto;
	private Double altitudPromMsnm;
	private String tiposAlteraciones;
	private Integer pendientePorc;
	private Integer gradoDiseccion;
	private String materialPredominante;

	public Geomorfologia() {
	}

	public Geomorfologia(int idGeomorfologia, Proyecto proyecto) {
		this.idGeomorfologia = idGeomorfologia;
		this.proyecto = proyecto;
	}

	public Geomorfologia(int idGeomorfologia, Proyecto proyecto, Double altitudPromMsnm, String tiposAlteraciones,
			Integer pendientePorc, Integer gradoDiseccion, String materialPredominante) {
		this.idGeomorfologia = idGeomorfologia;
		this.proyecto = proyecto;
		this.altitudPromMsnm = altitudPromMsnm;
		this.tiposAlteraciones = tiposAlteraciones;
		this.pendientePorc = pendientePorc;
		this.gradoDiseccion = gradoDiseccion;
		this.materialPredominante = materialPredominante;
	}

	public int getIdGeomorfologia() {
		return this.idGeomorfologia;
	}

	public void setIdGeomorfologia(int idGeomorfologia) {
		this.idGeomorfologia = idGeomorfologia;
	}

	public Proyecto getProyecto() {
		return this.proyecto;
	}

	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

	public Double getAltitudPromMsnm() {
		return this.altitudPromMsnm;
	}

	public void setAltitudPromMsnm(Double altitudPromMsnm) {
		this.altitudPromMsnm = altitudPromMsnm;
	}

	public String getTiposAlteraciones() {
		return this.tiposAlteraciones;
	}

	public void setTiposAlteraciones(String tiposAlteraciones) {
		this.tiposAlteraciones = tiposAlteraciones;
	}

	public Integer getPendientePorc() {
		return this.pendientePorc;
	}

	public void setPendientePorc(Integer pendientePorc) {
		this.pendientePorc = pendientePorc;
	}

	public Integer getGradoDiseccion() {
		return this.gradoDiseccion;
	}

	public void setGradoDiseccion(Integer gradoDiseccion) {
		this.gradoDiseccion = gradoDiseccion;
	}

	public String getMaterialPredominante() {
		return this.materialPredominante;
	}

	public void setMaterialPredominante(String materialPredominante) {
		this.materialPredominante = materialPredominante;
	}

}
