package com.fash.report.entity;

import java.io.Serializable;

public class ArchivoTramite implements Serializable {

	private static final long serialVersionUID = 6682345328512773437L;
	private Long artId;
	private byte[] archivo;
	private String     artCud       ;
	private String     artUri       ;
	private Integer    artActivo    ;
	private ProcesoTramite procesoTramite;
	private TipoArchivo catTipoArchivo;
	private String dorsSolicitada ;
	private Long oldID;
	
	
	public String getDorsSolicitada() {
		return dorsSolicitada;
	}
	public void setDorsSolicitada(String dorsSolicitada) {
		this.dorsSolicitada = dorsSolicitada;
	}
	public Long getArtId() {
		return artId;
	}
	public void setArtId(Long artId) {
		this.artId = artId;
	}
	public byte[] getArchivo() {
		return archivo;
	}
	public void setArchivo(byte[] archivo) {
		this.archivo = archivo;
	}
	public String getArtCud() {
		return artCud;
	}
	public void setArtCud(String artCud) {
		this.artCud = artCud;
	}
	public String getArtUri() {
		return artUri;
	}
	public void setArtUri(String artUri) {
		this.artUri = artUri;
	}
	public Integer getArtActivo() {
		return artActivo;
	}
	public void setArtActivo(Integer artActivo) {
		this.artActivo = artActivo;
	}
	public ProcesoTramite getProcesoTramite() {
		return procesoTramite;
	}
	public void setProcesoTramite(ProcesoTramite procesoTramite) {
		this.procesoTramite = procesoTramite;
	}
	public TipoArchivo getCatTipoArchivo() {
		return catTipoArchivo;
	}
	public void setCatTipoArchivo(TipoArchivo catTipoArchivo) {
		this.catTipoArchivo = catTipoArchivo;
	}
	public Long getOldID() {
		return oldID;
	}
	public void setOldID(Long oldID) {
		this.oldID = oldID;
	}
}