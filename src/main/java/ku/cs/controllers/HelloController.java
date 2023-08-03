package ku.cs.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import ku.cs.services.FXRouter;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private ImageView sampleImageView;

    @FXML
    public void initialize() {
        welcomeText.setText("Hello JavaFX");
        Image image = new Image(getClass().getResource("/images/smile.png").toString());  // แบบที่ 1
        // Image image = new Image(getClass().getResourceAsStream("/images/cat.png"));  // แบบที่ 2
        sampleImageView.setImage(image);
    }


    @FXML
    protected void onHelloButtonClick() {
        try {
            FXRouter.goTo("student-list");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}