package com.fash.report.service;

import com.fash.report.entity.ArchivoTramite;
import com.fash.report.entity.Constancia;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.util.JRLoader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.util.FileCopyUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {
   
    public static final String RUTA_IMAGENES = "/reportes/images/";
    

    
    public void generaReporte() throws JRException, FileNotFoundException{
    	ArchivoTramite archivo = new ArchivoTramite();
    	Constancia constancia = new Constancia();
    	
    	Map<String, Object> params = new HashMap<>();
    	List<Constancia> datos = new ArrayList<>();
    	
    	DatosTipoConstancia datosTipoConstancia = new DatosTipoConstancia();
    	
    	constancia = generaDatosConstancia(constancia);
    	
    	datosTipoConstancia = getDatosTipoConstancia();
    	
    	Date fecha = new Date();
    	archivo.setArtCud("ART CUD");
    	archivo.setDorsSolicitada("DORS SOLICITADA");
    	System.out.println(System.getProperty("user.dir"));
    	
    	File file = ResourceUtils.getFile("classpath:reportes/Constancia_Autorizacion_DoRS.jrxml");
        JasperReport jasperReport = (JasperReport)JasperCompileManager.compileReport(file.getAbsolutePath());
        
        JasperCompileManager.compileReportToFile(file.getAbsolutePath(), System.getProperty("user.dir")+File.separator+"ejemplo.jasper");
    	
    	InputStream plantilla =getClass().getResourceAsStream("/reportes/Constancia_Autorizacion_DoRS.jasper");
    	
    	params.put("IS_IGNORE_PAGINATION", Boolean.FALSE);
    	params.put("IMG_HEADER", this.getClass().getResource(RUTA_IMAGENES + "header.jpg"));
    	params.put("IMG_FOOTER", this.getClass().getResource(RUTA_IMAGENES + "footer.jpg"));
    	
//    	JasperReport reporte =(JasperReport) JRLoader.loadObject(plantilla);
    	JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, params, new JRBeanCollectionDataSource(datos));
    	JasperExportManager.exportReportToPdfFile(jasperPrint, System.getProperty("user.dir") + File.separator + "reporte.pdf");
    	
//    	archivo.setArchivo(output);
    	
    	
    }

	private DatosTipoConstancia getDatosTipoConstancia() {
		// TODO Auto-generated method stub
		return null;
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
		constancia.setSimilarDoRS("similar DORS");
		
		constancia.setListaDatos(null);
		
		return constancia;
	}
	
	
	public void compilaReportes() throws JRException, FileNotFoundException{
		
	try {
        // Obtener recursos de la carpeta dentro de resources
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        Resource[] resources = resolver.getResources("classpath:input_folder/*");
        
        
        
        // Iterar sobre los recursos y convertirlos
        for (Resource resource : resources) {
            String fileName = resource.getFilename();
            String outputFile = fileName.replaceFirst("\\.\\w+$", ".jasper");
            

            convertAndSave(resource, outputFile);
        }
		
	}catch (IOException e) {
        e.printStackTrace();
    }
	}
	
	
	
    private void convertAndSave(Resource sourceResource, String outputFile) throws IOException, JRException {
    	
    	File file = sourceResource.getFile();


        // Obtener la ruta absoluta de la carpeta de salida en el sistema del usuario
        File userOutputFolder = new File(System.getProperty("user.home"), "output_folder");
        if (!userOutputFolder.exists()) {
            userOutputFolder.mkdirs();
        }
        
        // Obtener la ruta absoluta de salida
        String absoluteOutputPath = new File(userOutputFolder, outputFile).getAbsolutePath();
        
    	JasperCompileManager.compileReportToFile(file.getAbsolutePath(), absoluteOutputPath);
    	
    }
}
