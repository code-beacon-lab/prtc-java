package thisIsJava.ch17_javaFX.example;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class AppMain extends Application {
	@Override
	public void start(Stage primaryStage) throws Exception {
		VBox root = new VBox();
		root.setPrefWidth(350);
		root.setPrefHeight(150);
		root.setAlignment(Pos.CENTER);
		root.setSpacing(20); // contorller's vertical space
		
		Label label = new Label();
		label.setText("To be or not to be, that's the question");
		label.setFont(new Font(50));
		
		Button button = new Button();
		button.setText("Ȯ��");
		button.setOnAction(event->Platform.exit()); // click event
		
		root.getChildren().add(label);
		root.getChildren().add(button);
		
		Scene scene = new Scene(root);
		
		
		primaryStage.setTitle("AppMain"); // window title
		primaryStage.setScene(scene); // window scene
		primaryStage.show(); // ������ �ٷ� �����ֱ�

	}
	
	public static void main(String[] args) {
		launch(args); // AppMain ��ü ���� �� ���� ������ ����
	}
}
