package com.fash.report;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.*;

//@SpringBootApplication
//@RestController
//public class SpringBootJasperReportApplication {
//
//    @Autowired
//    private ReportService service;
//   
//    @GetMapping("/compilar")
//    public String compilar() {
//
//    	try {
//			service.compilaReportes();
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (JRException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//        return "ok";
//    }
//
//    public static void main(String[] args) {
//        SpringApplication.run(SpringBootJasperReportApplication.class, args);
//    }
//
//}
public class SpringBootJasperReportApplication extends Application {
	private double x;
	private double y;

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("/fxml/Home.fxml"));
		primaryStage.setScene(new Scene(root));
		primaryStage.initStyle(StageStyle.UNDECORATED);
		primaryStage.setResizable(true);
		root.setOnMousePressed(event -> {
			x = event.getSceneX();
			y = event.getSceneY();
		});
//		primaryStage.setMaxHeight(650.0);
//		primaryStage.setMaxWidth(1085.0);

		root.setOnMouseDragged(event -> {

			primaryStage.setX(event.getScreenX() - x);
			primaryStage.setY(event.getScreenY() - y);

		});
		primaryStage.show();
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		launch(args);
	}
}