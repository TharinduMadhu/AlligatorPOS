import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class AppInizializer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/MainForm.fxml"));
        Scene mainScene = new Scene(root);
        primaryStage.setTitle("Alligator POS");
        primaryStage.setScene(mainScene);
        primaryStage.centerOnScreen();
        primaryStage.resizableProperty().setValue(Boolean.FALSE);
        primaryStage.show();
    }
}
