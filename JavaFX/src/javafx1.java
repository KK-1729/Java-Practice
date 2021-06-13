import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class javafx1 extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button bt1 = new Button("click me");
        HBox root = new HBox();
        root.getChildren().add(bt1);
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}