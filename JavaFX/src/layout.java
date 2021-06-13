import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class layout extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button bt1 = new Button("click me");
        Button bt2 = new Button("click me");
        Button bt3 = new Button("click me");
        Button bt4 = new Button("click me");
        Button bt5 = new Button("click me");
        Button bt6 = new Button("click me");
        Button bt7 = new Button("click me");
        Button bt8 = new Button("click me");
        Button bt9 = new Button("click me");
        Button bt10 = new Button("click me");
        VBox root = new VBox();
        root.setSpacing(10);
        root.getChildren().add(bt1);
        root.getChildren().add(bt2);
        root.getChildren().add(bt3);
        root.getChildren().add(bt4);
        root.getChildren().add(bt5);
        root.getChildren().add(bt6);
        root.getChildren().add(bt7);
        root.getChildren().add(bt8);
        root.getChildren().add(bt9);
        root.getChildren().add(bt10);
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.setTitle("Karthik Stage");
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.show();
    }
}
