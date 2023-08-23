package com.fash.report.entity;

import java.util.Arrays;
import java.util.Date;

public class ProcesoTramite extends GenericTransferObject {

    private static final long serialVersionUID = -3880397139775861068L;

    private Long idProcAutorizacion;
    private Date fechaResolucion;
    private String strFechaResolucion;
    private Integer resolucion;// Dictaminador (FAVORABLE, NO FAVORABLE)
    private String uri;
    private byte[] archivo;
    private Long idFirma;
    private String cud;
    private Date fechaModificacion;
    private Long usuModificacion;

    private EstatusPeticion estatusPeticion;
    private String idProcess;
    private String idProcessRazon;
    private Peticion peticion;

    private RazonSocial razonSocial;
    private EstatusRazonSocial estatusRazonSocial;

    private Boolean actualizarRegimen = false;
    private Boolean actualzarFedatario = false;

    private String resultadoPrevalidacion = "";
    private Long diasTransAutorizado;

    private String totalRecords;

    //Para las constancias
    private String condicion;
    private String advertencia;
    private String fundamentos;
    private String sustento;
    private String instrumentoPublico;
    private String folioMercantil;
//    private String estatus;
    private int enProceso;

    public Long getDiasTransAutorizado() {
        return diasTransAutorizado;
    }

    public void setDiasTransAutorizado(Long diasTransAutorizado) {
        this.diasTransAutorizado = diasTransAutorizado;
    }

    public String getResultadoPrevalidacion() {
        return resultadoPrevalidacion;
    }

    public void setResultadoPrevalidacion(String resultadoPrevalidacion) {
        this.resultadoPrevalidacion = resultadoPrevalidacion;
    }

    public Boolean getActualizarRegimen() {
        return actualizarRegimen;
    }

    public void setActualizarRegimen(Boolean actualizarRegimen) {
        this.actualizarRegimen = actualizarRegimen;
    }

    public Boolean getActualzarFedatario() {
        return actualzarFedatario;
    }

    public void setActualzarFedatario(Boolean actualzarFedatario) {
        this.actualzarFedatario = actualzarFedatario;
    }

    public EstatusRazonSocial getEstatusRazonSocial() {
        return estatusRazonSocial;
    }

    public void setEstatusRazonSocial(EstatusRazonSocial estatusRazonSocial) {
        this.estatusRazonSocial = estatusRazonSocial;
    }

    public String getIdProcessRazon() {
        return idProcessRazon;
    }

    public void setIdProcessRazon(String idProcessRazon) {
        this.idProcessRazon = idProcessRazon;
    }

    public Date getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Long getUsuModificacion() {
        return usuModificacion;
    }

    public void setUsuModificacion(Long usuModificacion) {
        this.usuModificacion = usuModificacion;
    }

    public String getIdProcess() {
        return idProcess;
    }

    public void setIdProcess(String idProcess) {
        this.idProcess = idProcess;
    }

    public Long getIdProcAutorizacion() {
        return idProcAutorizacion;
    }

    public void setIdProcAutorizacion(Long idProcAutorizacion) {
        this.idProcAutorizacion = idProcAutorizacion;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public String getStrFechaResolucion() {
        return strFechaResolucion;
    }

    public void setStrFechaResolucion(String strFechaResolucion) {
        this.strFechaResolucion = strFechaResolucion;
    }

    public Integer getResolucion() {
        return resolucion;
    }

    public void setResolucion(Integer resolucion) {
        this.resolucion = resolucion;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public byte[] getArchivo() {
        return archivo;
    }

    public void setArchivo(byte[] archivo) {
        this.archivo = archivo;
    }

    public Long getIdFirma() {
        return idFirma;
    }

    public void setIdFirma(Long idFirma) {
        this.idFirma = idFirma;
    }

    public String getCud() {
        return cud;
    }

    public void setCud(String cud) {
        this.cud = cud;
    }

    public RazonSocial getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(RazonSocial razonSocial) {
        this.razonSocial = razonSocial;
    }

    public Peticion getPeticion() {
        return peticion;
    }

    public void setPeticion(Peticion peticion) {
        this.peticion = peticion;
    }

    public EstatusPeticion getEstatusPeticion() {
        return estatusPeticion;
    }

    public void setEstatusPeticion(EstatusPeticion estatusPeticion) {
        this.estatusPeticion = estatusPeticion;
    }

    public String getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(String totalRecords) {
        this.totalRecords = totalRecords;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    public String getAdvertencia() {
        return advertencia;
    }

    public void setAdvertencia(String advertencia) {
        this.advertencia = advertencia;
    }

    public String getFundamentos() {
        return fundamentos;
    }

    public void setFundamentos(String fundamentos) {
        this.fundamentos = fundamentos;
    }

    public String getSustento() {
        return sustento;
    }

    public void setSustento(String sustento) {
        this.sustento = sustento;
    }

    public String getInstrumentoPublico() {
        return instrumentoPublico;
    }

    public void setInstrumentoPublico(String instrumentoPublico) {
        this.instrumentoPublico = instrumentoPublico;
    }

    public String getFolioMercantil() {
        return folioMercantil;
    }

    public void setFolioMercantil(String folioMercantil) {
        this.folioMercantil = folioMercantil;
    }

    public int getEnProceso() {
        return enProceso;
    }

    public void setEnProceso(int enProceso) {
        this.enProceso = enProceso;
    }

//	public String getEstatus() {
//		return estatus;
//	}
//
//	public void setEstatus(String estatus) {
//		this.estatus = estatus;
//	}

	@Override
	public String toString() {
		return "ProcesoTramite [idProcAutorizacion=" + idProcAutorizacion + ", fechaResolucion=" + fechaResolucion
				+ ", strFechaResolucion=" + strFechaResolucion + ", resolucion=" + resolucion + ", uri=" + uri
				+ ", archivo=" + Arrays.toString(archivo) + ", idFirma=" + idFirma + ", cud=" + cud
				+ ", fechaModificacion=" + fechaModificacion + ", usuModificacion=" + usuModificacion
				+ ", estatusPeticion=" + estatusPeticion + ", idProcess=" + idProcess + ", idProcessRazon="
				+ idProcessRazon + ", peticion=" + peticion + ", razonSocial=" + razonSocial + ", estatusRazonSocial="
				+ estatusRazonSocial + ", actualizarRegimen=" + actualizarRegimen + ", actualzarFedatario="
				+ actualzarFedatario + ", resultadoPrevalidacion=" + resultadoPrevalidacion + ", diasTransAutorizado="
				+ diasTransAutorizado + ", totalRecords=" + totalRecords + ", condicion=" + condicion + ", advertencia="
				+ advertencia + ", fundamentos=" + fundamentos + ", sustento=" + sustento + ", instrumentoPublico="
				+ instrumentoPublico + ", folioMercantil=" + folioMercantil + ", enProceso=" + enProceso + "]";
	}

}