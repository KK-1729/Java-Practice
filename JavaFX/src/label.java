import java.io.FileInputStream;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class label extends Application {
    public static void main(String[] args) {
        launch();
    }

    public void start(Stage primaryStage) throws Exception {
        FileInputStream fin = new FileInputStream("IMG_20191016_192759_650.jpg");
        Image img = new Image(fin);
        ImageView imgview = new ImageView(img);
        Label lb1 = new Label("Enter your name", imgview);
        lb1.setText("I am setting some other text and this text is a large text and I don't think this text is going to wrap");
        lb1.setWrapText(true);
        lb1.setTextFill(Color.BLUE);
        lb1.setFont(new Font("Times New Roman", 32));
        lb1.setTextAlignment(TextAlignment.CENTER);
        HBox root = new HBox();
        root.getChildren().add(lb1);
        Scene sc = new Scene(root);
        primaryStage.setHeight(500);
        primaryStage.setWidth(500);
        primaryStage.setScene(sc);
        primaryStage.show();
    }
}
