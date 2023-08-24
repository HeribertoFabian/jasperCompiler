package com.fash.report;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import net.sf.jasperreports.engine.JRException;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

import com.fash.report.entity.FxDialogs;
import com.fash.report.service.ReportService;

public class HomeController implements Initializable {
	@FXML
	private TextField pathEntrada;
	@FXML
	private TextField pathSalida;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		pathEntrada.setDisable(true);
		pathSalida.setDisable(true);
	}

	@FXML
	private void salir(ActionEvent event) {
		String exit = FxDialogs.showConfirm("Reportería", "¿Deseas salir?", FxDialogs.OK, FxDialogs.CANCEL);
		if (exit.equals(FxDialogs.OK)) {
			System.exit(0);
		}
	}

	@FXML
	private void entrada(ActionEvent event) {
		DirectoryChooser directory = new DirectoryChooser();
		directory.setTitle("Agregar path");
		File archivo = directory.showDialog(null);
		if (archivo != null) {
			this.pathEntrada.setText(archivo.getPath());
		} else {
			FxDialogs.showWarning("UPS!", "Debes elegir un directorio de entrada");
		}
	}

	@FXML
	private void salida(ActionEvent event) {
		DirectoryChooser directory = new DirectoryChooser();
		directory.setTitle("Agregar path");
		File archivo = directory.showDialog(null);
		if (archivo != null) {
			this.pathSalida.setText(archivo.getPath());
		} else {
			FxDialogs.showWarning("UPS!", "Debes elegir un directorio de salida");
		}
	}

	@FXML
	private void ejecutar(ActionEvent event) {
		ReportService service = new ReportService();
		try {
			if (this.pathEntrada.getText().isEmpty() || this.pathSalida.getText().isEmpty()) {
				FxDialogs.showError("ALTO!", "Debes elegir un directorio de entrada y de salida");
			} else {
				service.compilaReportes(new File(this.pathEntrada.getText()).listFiles());
			}
		} catch (FileNotFoundException | JRException e) {
			FxDialogs.showException("Error", e.getMessage(), e);
		}
	}
}
