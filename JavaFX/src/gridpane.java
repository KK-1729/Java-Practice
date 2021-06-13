import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class gridpane extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button bt1 = new Button("click me");
        Button bt2 = new Button("click me");
        Button bt3 = new Button("click me");
        GridPane root = new GridPane();
        root.add(bt1, 0, 0);
        root.add(bt2, 1, 1);
        root.add(bt3, 2, 2);
        root.setGridLinesVisible(true);
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Karthik Stage");
        primaryStage.show();
    }
}
