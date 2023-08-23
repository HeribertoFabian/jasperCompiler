package com.fash.report.entity;

import java.io.Serializable;
import java.util.Date;

public class GenericTransferObject implements Serializable {

	private static final long serialVersionUID = -7299438109588698423L;
	private Date fechaCreacion;
	private String strFechaCreacion;
	private Date ultimaModificacion;
	private Integer activo;

	public String getStrFechaCreacion() {
		return strFechaCreacion;
	}

	public void setStrFechaCreacion(String strFechaCreacion) {
		this.strFechaCreacion = strFechaCreacion;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getUltimaModificacion() {
		return ultimaModificacion;
	}

	public void setUltimaModificacion(Date ultimaModificacion) {
		this.ultimaModificacion = ultimaModificacion;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

}