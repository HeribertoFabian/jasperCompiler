package com.fash.report.entity;

import java.io.Serializable;
import java.util.List;

public class Constancia implements Serializable {

	private static final long serialVersionUID = -1056437105431509876L;
	
	//Propiedades generales
	private String nombreSolicitante;
	private String nombreDoRS;
	private String claveUnicaDocto;
	
	//Firma Secretar�a econom�a
	private String cadenaOriginalSE;
	private String selloSE;
	private String certificadoSE;
	private String selloTiempoAut;
	
	//Firma dictaminador
	private String cadenaOriginalSP;
	private String firmaSP;
	private String certificadoSP;
	private String selloTiempoDictamen;
	
	//Firma ciudadano
	private String cadenaOriginalSol;
	private String firmaSol;
	private String certificadoSol;
	private String selloTiempoSol;
	
	//Firma que se utiliza para obtener los datos de base de datos
	private String cadenaOriginal;
	private String selloTiempo;
	private String tipoFirma;
	private String firma;
	
	private String selloSP;
	private String selloSol;
	
	//Para constancias de rechazo
	private String motivoRechazo;

	//Para el rechazo por dictamen
	private String similarDoRS;
	
	
	//ATENCION
	private List<DatoRenglonReporte> listaDatos;
	
	public String getMotivoRechazo() {
		return motivoRechazo;
	}

	public void setMotivoRechazo(String motivoRechazo) {
		this.motivoRechazo = motivoRechazo;
	}

	public String getSimilarDoRS() {
		return similarDoRS;
	}

	public void setSimilarDoRS(String similarDoRS) {
		this.similarDoRS = similarDoRS;
	}

	public String getNombreSolicitante() {
		return nombreSolicitante;
	}

	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}

	public String getNombreDoRS() {
		return nombreDoRS;
	}

	public void setNombreDoRS(String nombreDoRS) {
		this.nombreDoRS = nombreDoRS;
	}

	public String getCadenaOriginalSE() {
		return cadenaOriginalSE;
	}

	public void setCadenaOriginalSE(String cadenaOriginalSE) {
		this.cadenaOriginalSE = cadenaOriginalSE;
	}

	public String getSelloSE() {
		return selloSE;
	}

	public void setSelloSE(String selloSE) {
		this.selloSE = selloSE;
	}

	public String getCertificadoSE() {
		return certificadoSE;
	}

	public void setCertificadoSE(String certificadoSE) {
		this.certificadoSE = certificadoSE;
	}

	public String getSelloTiempoAut() {
		return selloTiempoAut;
	}

	public void setSelloTiempoAut(String selloTiempoAut) {
		this.selloTiempoAut = selloTiempoAut;
	}

	public String getCadenaOriginalSP() {
		return cadenaOriginalSP;
	}

	public void setCadenaOriginalSP(String cadenaOriginalSP) {
		this.cadenaOriginalSP = cadenaOriginalSP;
	}

	public String getFirmaSP() {
		return firmaSP;
	}

	public void setFirmaSP(String firmaSP) {
		this.firmaSP = firmaSP;
	}

	public String getCertificadoSP() {
		return certificadoSP;
	}

	public void setCertificadoSP(String certificadoSP) {
		this.certificadoSP = certificadoSP;
	}

	public String getSelloTiempoDictamen() {
		return selloTiempoDictamen;
	}

	public void setSelloTiempoDictamen(String selloTiempoDictamen) {
		this.selloTiempoDictamen = selloTiempoDictamen;
	}

	public String getCadenaOriginalSol() {
		return cadenaOriginalSol;
	}

	public void setCadenaOriginalSol(String cadenaOriginalSol) {
		this.cadenaOriginalSol = cadenaOriginalSol;
	}

	public String getFirmaSol() {
		return firmaSol;
	}

	public void setFirmaSol(String firmaSol) {
		this.firmaSol = firmaSol;
	}

	public String getCertificadoSol() {
		return certificadoSol;
	}

	public void setCertificadoSol(String certificadoSol) {
		this.certificadoSol = certificadoSol;
	}

	public String getSelloTiempoSol() {
		return selloTiempoSol;
	}

	public void setSelloTiempoSol(String selloTiempoSol) {
		this.selloTiempoSol = selloTiempoSol;
	}

	public String getClaveUnicaDocto() {
		return claveUnicaDocto;
	}

	public void setClaveUnicaDocto(String claveUnicaDocto) {
		this.claveUnicaDocto = claveUnicaDocto;
	}

	public List<DatoRenglonReporte> getListaDatos() {
		return listaDatos;
	}

	public void setListaDatos(List<DatoRenglonReporte> listaDatos) {
		this.listaDatos = listaDatos;
	}

	public String getCadenaOriginal() {
		return cadenaOriginal;
	}

	public void setCadenaOriginal(String cadenaOriginal) {
		this.cadenaOriginal = cadenaOriginal;
	}

	public String getSelloTiempo() {
		return selloTiempo;
	}

	public void setSelloTiempo(String selloTiempo) {
		this.selloTiempo = selloTiempo;
	}

	public String getTipoFirma() {
		return tipoFirma;
	}

	public void setTipoFirma(String tipoFirma) {
		this.tipoFirma = tipoFirma;
	}

	public String getFirma() {
		return firma;
	}

	public void setFirma(String firma) {
		this.firma = firma;
	}

	public String getSelloSP() {
		return selloSP;
	}

	public void setSelloSP(String selloSP) {
		this.selloSP = selloSP;
	}

	public String getSelloSol() {
		return selloSol;
	}

	public void setSelloSol(String selloSol) {
		this.selloSol = selloSol;
	}

}