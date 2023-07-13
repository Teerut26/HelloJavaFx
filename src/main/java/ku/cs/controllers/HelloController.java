package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        try {
            FXRouter.goTo("student-profile");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}