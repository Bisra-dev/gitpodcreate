import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SimpleTest extends Application {
    
    @Override
    public void start(Stage stage) {
        // Create components
        Label label = new Label("🎉 JavaFX Works in GitPod!");
        label.setStyle("-fx-font-size: 20px; -fx-text-fill: blue;");
        
        Button button = new Button("Click Me!");
        button.setStyle("-fx-background-color: green; -fx-text-fill: white;");
        
        // Button action
        button.setOnAction(e -> {
            label.setText("Button Clicked! ✅");
        });
        
        // Layout
        VBox root = new VBox(20);
        root.setStyle("-fx-padding: 30; -fx-alignment: center;");
        root.getChildren().addAll(label, button);
        
        // Setup window
        Scene scene = new Scene(root, 400, 300);
        stage.setTitle("JavaFX GitPod Test - SUCCESS!");
        stage.setScene(scene);
        stage.show();
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}
