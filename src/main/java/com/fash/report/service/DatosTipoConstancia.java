package com.fash.report.service;

import java.io.Serializable;

public class DatosTipoConstancia implements Serializable {

	private static final long serialVersionUID = -7927124538661630251L;

	private Character nomenclatura;
	private String rutaPlantilla;
	
	public Character getNomenclatura() {
		return nomenclatura;
	}
	public void setNomenclatura(Character nomenclatura) {
		this.nomenclatura = nomenclatura;
	}
	public String getRutaPlantilla() {
		return rutaPlantilla;
	}
	public void setRutaPlantilla(String rutaPlantilla) {
		this.rutaPlantilla = rutaPlantilla;
	}
}