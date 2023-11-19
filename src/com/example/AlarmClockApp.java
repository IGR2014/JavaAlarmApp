package com.example;


// JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


// Головне вікно програми
public class AlarmClockApp extends Application {


	// Метод запуску головного вікна програми
	@Override
	public void start(Stage primaryStage) {

		primaryStage.setTitle("Будильник");

		final Button setAlarmButton = new Button("Встановити будильник");
		setAlarmButton.setOnAction(event -> setAlarm());

		final VBox vBox = new VBox(setAlarmButton);
		final Scene scene = new Scene(vBox, 300, 200);

		primaryStage.setScene(scene);
		primaryStage.show();

	}

	private void setAlarm() {
		// TODO
	}


	// Метод запуску GUI
	public static void main(String[] args) {
		launch(args);
	}


}

