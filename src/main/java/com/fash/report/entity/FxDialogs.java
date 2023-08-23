package com.fash.report.entity;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.StageStyle;

public class FxDialogs {
	public static final String OK = "Aceptar";
	public static final String CANCEL = "Cancelar";

	public static String showConfirm(String title, String message, String... options) {
		Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
		alert.initStyle(StageStyle.UTILITY);
		alert.setTitle("Elije una opción");
		alert.setHeaderText(title);
		alert.setContentText(message);
		alert.getDialogPane().addEventFilter(KeyEvent.KEY_PRESSED, (KeyEvent event) -> {
			if (event.getCode().equals(KeyCode.ENTER)) {
				event.consume();
				try {
					Robot r = new Robot();
					r.keyPress(java.awt.event.KeyEvent.VK_SPACE);
					r.keyRelease(java.awt.event.KeyEvent.VK_SPACE);
				} catch (AWTException e) {
					//
				}
			}
		});
		if (options == null || options.length == 0) {
			options = new String[] { OK, CANCEL };
		}

		List<ButtonType> buttons = new ArrayList<>();
		for (String option : options) {
			buttons.add(new ButtonType(option));
		}

		alert.getButtonTypes().setAll(buttons);

		Optional<ButtonType> result = alert.showAndWait();
		return !result.isPresent() ? CANCEL : result.get().getText();
	}

	public static void showInformation(String title, String message) {
		Alert alert = new Alert(Alert.AlertType.INFORMATION);
		alert.initStyle(StageStyle.UTILITY);
		alert.setTitle("Información");
		alert.setHeaderText(title);
		alert.setContentText(message);

		alert.showAndWait();
	}

	public static void showWarning(String title, String message) {
		Alert alert = new Alert(Alert.AlertType.WARNING);
		alert.initStyle(StageStyle.UTILITY);
		alert.setTitle("Alerta");
		alert.setHeaderText(title);
		alert.setContentText(message);

		alert.showAndWait();
	}

	public static void showError(String title, String message) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.initStyle(StageStyle.UTILITY);
		alert.setTitle("Error");
		alert.setHeaderText(title);
		alert.setContentText(message);

		alert.showAndWait();
	}

	public static void showException(String title, String message, Exception exception) {
		Alert alert = new Alert(Alert.AlertType.ERROR);
		alert.initStyle(StageStyle.UTILITY);
		alert.setTitle("Excepción");
		alert.setHeaderText(title);
		alert.setContentText(message);

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		exception.printStackTrace(pw);
		String exceptionText = sw.toString();

		Label label = new Label("Detalles:");

		TextArea textArea = new TextArea(exceptionText);
		textArea.setEditable(false);
		textArea.setWrapText(true);

		textArea.setMaxWidth(Double.MAX_VALUE);
		textArea.setMaxHeight(Double.MAX_VALUE);
		GridPane.setVgrow(textArea, Priority.ALWAYS);
		GridPane.setHgrow(textArea, Priority.ALWAYS);

		GridPane expContent = new GridPane();
		expContent.setMaxWidth(Double.MAX_VALUE);
		expContent.add(label, 0, 0);
		expContent.add(textArea, 0, 1);

		alert.getDialogPane().setExpandableContent(expContent);

		alert.showAndWait();
	}
}
