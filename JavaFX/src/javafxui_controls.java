import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class javafxui_controls extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField name = new TextField();
        name.setMaxWidth(300);
        Button bt1 = new Button("Click here");
        Label lb1 = new Label();
        bt1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                lb1.setText("Welcome Mr." + name.getText());
                lb1.setTextFill(Color.BLUE);
                lb1.setFont(new Font("Times New Roman", 32));
            }    
        });
        VBox root = new VBox();
        root.getChildren().addAll(name, bt1, lb1);
        Scene sc = new Scene(root);
        primaryStage.setHeight(300);
        primaryStage.setWidth(500);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
