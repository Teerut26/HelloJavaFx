package ku.cs.lab02javafx;

import javafx.scene.Scene;
import ku.cs.services.FXRouter;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXRouter.bind(this, stage, "Hello World");
        configRoute();
//        FXRouter.goTo("student-profile");
        FXRouter.goTo("hello");
    }

    public static void configRoute()
    {
        String viewPath = "ku/cs/views/";
        FXRouter.when("hello", viewPath + "hello-view.fxml");
        FXRouter.when("student-profile", viewPath + "student.fxml");
    }

    public static void main(String[] args) {
        launch();
    }
}