package com.fash.report.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fash.report.entity.ArchivoTramite;
import com.fash.report.entity.Constancia;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class ReportService {

	public static final String RUTA_IMAGENES = "/reportes/images/";

	public void generaReporte(File file) throws JRException, FileNotFoundException {
		ArchivoTramite archivo = new ArchivoTramite();
		Constancia constancia = new Constancia();
		Map<String, Object> params = new HashMap<>();
		List<Constancia> datos = new ArrayList<>();

		DatosTipoConstancia datosTipoConstancia = new DatosTipoConstancia();

		constancia = generaDatosConstancia(constancia);
		datos.add(constancia);

		datosTipoConstancia = getDatosTipoConstancia();

		Date fecha = new Date();
		archivo.setArtCud("ART CUD");
		archivo.setDorsSolicitada("DORS SOLICITADA");
//		archivo.set
		System.out.println(System.getProperty("user.dir"));

//    	File file = ResourceUtils.getFile("classpath:reportes/Constancia_Autorizacion_DoRS.jrxml");
		JasperReport jasperReport = (JasperReport) JasperCompileManager.compileReport(file.getAbsolutePath());

//		JasperCompileManager.compileReportToFile(file.getAbsolutePath(),
//				System.getProperty("user.dir") + File.separator + "ejemplo.jasper");

//		InputStream plantilla = getClass().getResourceAsStream("/reportes/Constancia_Autorizacion_DoRS.jasper");

		params.put("IS_IGNORE_PAGINATION", Boolean.FALSE);
		params.put("IMG_HEADER", this.getClass().getResource(RUTA_IMAGENES + "header.jpg").toString());
		params.put("IMG_FOOTER", this.getClass().getResource(RUTA_IMAGENES + "footer.jpg").toString());
		params.put("CONDICION", "ESTA ES LA CONDICION");
		params.put("ADVERTENCIA", "Esta es la advertencia");
		
		System.out.println(params.toString());

//    	JasperReport reporte =(JasperReport) JRLoader.loadObject(plantilla);
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params,
				new JRBeanCollectionDataSource(datos));
		JasperExportManager.exportReportToPdfFile(jasperPrint,
				System.getProperty("user.dir") + File.separator + "reporte.pdf");

//    	archivo.setArchivo(output);

	}

	private DatosTipoConstancia getDatosTipoConstancia() {
		DatosTipoConstancia dtc = new DatosTipoConstancia();
		dtc.setNomenclatura('A');
		dtc.setRutaPlantilla(RUTA_IMAGENES);
		return dtc;
	}

	private Constancia generaDatosConstancia(Constancia constancia) {
		constancia.setCadenaOriginal("adgfkhasgdfhkagsdfjafhasgdfkjgasdfhkgasjf");
		constancia.setCadenaOriginalSE("jakljfhjkasdhfjdahljsadhfljkashdfljashdfjkhaskjl");
		constancia.setCadenaOriginalSol("dlksadhasjhfkjasdhflkjashdflkjahsldkfjhalsdkjfh");
		constancia.setCadenaOriginalSP("weprtyoyt983tyfgui9p45hsñodnfvñadvna");
		constancia.setCertificadoSE("CERTIFICASDOASLDKJ");
		constancia.setCertificadoSol("CertificadoSOLdalksdjañslkdj");
		constancia.setCertificadoSP("CERTIFICADOsp_DFHSLKJFHSLKJFSHDJFH");
		constancia.setClaveUnicaDocto("CLAVE_UNICA_DOCTO");
		constancia.setFirma("FIRMA_dsakdhalksjdhlaksdh");
		constancia.setFirmaSol("FIRMA_SOL_ASDALSDKHALSJD");
		constancia.setFirmaSP("Firma_SP_asdakjsdhlajksdhasd");
		constancia.setMotivoRechazo("POR_EJEMPLO");
		constancia.setNombreDoRS("NOMBRE_DORS");
		constancia.setNombreSolicitante("HERIBERTO FABIAN SANTIAGO");
		constancia.setSelloSE("SELLO_SE");
		constancia.setSelloTiempoSol("selloTiempoSoldajsdhaldhlakjhdl");
		constancia.setSelloTiempoDictamen("SelloTiempoDictamen");
		constancia.setSimilarDoRS("similar DORS");
		constancia.setSelloTiempoAut("SelloTiempoAutASDADADADADS");
		constancia.setSelloSP("SELLO_SP");
		constancia.setSelloSol("sello_SOL");

		constancia.setListaDatos(null);

		return constancia;
	}

	public void compilaReportes(File[] resources) throws JRException, FileNotFoundException {

		try {
//			ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
//			Resource[] resources = resolver.getResources("classpath:input_folder/*");

			for (File resource : resources) {
				String fileName = resource.getName();
				String outputFile = fileName.replaceFirst("\\.\\w+$", ".jasper");

				convertAndSave(resource, outputFile);
				
				if(fileName.equalsIgnoreCase("Constancia_Autorizacion_DoRS.jrxml")) {
					generaReporte(resource);
				}
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

    private void convertAndSave(File sourceResource, String outputFile) throws IOException, JRException {
    	
//    	File file = sourceResource.getFile();


        // Obtener la ruta absoluta de la carpeta de salida en el sistema del usuario
        File userOutputFolder = new File(System.getProperty("user.home"), "output_folder");
        if (!userOutputFolder.exists()) {
            userOutputFolder.mkdirs();
        }
        
        // Obtener la ruta absoluta de salida
        String absoluteOutputPath = new File(userOutputFolder, outputFile).getAbsolutePath();
        
    	JasperCompileManager.compileReportToFile(sourceResource.getAbsolutePath(), absoluteOutputPath);
    	
    }
}
